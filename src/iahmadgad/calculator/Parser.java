package iahmadgad.calculator;

import java.util.ArrayList;

public class Parser 
{
	private static String sentence;
	private static int value;
	
	public static int getValue(String sentence)
	{
		Parser.sentence = sentence;
		parse();
		return value;
	}
	
	private static void parse()
	{
		ArrayList<String> elements = splitElements();
		for(int i = 0; i < elements.size(); i++)
		{
			if(isFirstOrderOperator(elements.get(i)))
			{
				String currentOperation = String.valueOf(operate(Integer.parseInt(elements.get(i - 1)), elements.get(i).charAt(0), Integer.parseInt(elements.get(i + 1))));
				elements.set(i - 1, currentOperation);
				elements.remove(i);
				elements.remove(i);
			}
		}
		for(int i = 0; i < elements.size(); i++)
		{
			if(isSecondOrderOperator(elements.get(i)))
			{
				String currentOperation = String.valueOf(operate(Integer.parseInt(elements.get(i - 1)), elements.get(i).charAt(0), Integer.parseInt(elements.get(i + 1))));
				elements.set(i - 1, currentOperation);
				elements.remove(i);
				elements.remove(i);
			}
		}
		value = Integer.parseInt(elements.get(0));
	}
	
	private static int operate(int firstOperand, char operator, int secondOperand)
	{
		if(operator == '+') return firstOperand + secondOperand;
		else if (operator == '-') return firstOperand - secondOperand;
		else if(operator == '*' || operator == 'x') return firstOperand * secondOperand;
		else if(operator == '/' || operator == '÷') return firstOperand / secondOperand;
		return 0;
	}
	
	private static ArrayList<String> splitElements()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		int index = 0;
		for(int i = 0; i < sentence.length(); i++)
		{
			if(isOperator(sentence.charAt(i)))
			{
				index++;
				list.add(Character.toString(sentence.charAt(i)));
				index++;
				list.add("");
			}
			else list.set(index, list.get(index) + sentence.charAt(i));
		}
		return list;
	}
	
	private static boolean isOperator(char c)
	{
		if(c == '+' || c == '-' || c == '*' || c == 'x' || c == '/' || c == '÷') return true;
		return false;
	}
	
	private static boolean isFirstOrderOperator(String s)
	{
		if(s.compareTo("*") == 0 || s.compareTo("x") == 0 || s.compareTo("/") == 0 ||  s.compareTo("÷") == 0) return true;
		return false;
	}
	
	private static boolean isSecondOrderOperator(String s)
	{ 
		if(s.compareTo("+") == 0 || s.compareTo("-") == 0) return true;
		return false;
	}
}
