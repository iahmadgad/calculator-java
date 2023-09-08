package iahmadgad.calculator;

import java.util.ArrayList;

public class Parser 
{
	private static String sentence;
	private static double value;
	
	public static Object getEnhancedValue(String sentence)
	{
		double value = getValue(sentence);
		if(value - (int) value == 0.0) return (int) value;
		else return value;
	}
	
	public static double getValue(String sentence)
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
			if(isFirstOrderOperator(elements.get(i)) && operandsNumber(elements.get(i)) == 1)
			{
				String currentOperation = String.valueOf(operate(elements.get(i), Double.parseDouble(elements.get(i + 1))));
				elements.set(i, currentOperation);
				elements.remove(i + 1);
			}
			else if(isFirstOrderOperator(elements.get(i)) && operandsNumber(elements.get(i)) == -1)
			{
				String currentOperation = String.valueOf(operate(elements.get(i), Double.parseDouble(elements.get(i - 1))));
				elements.set(i, currentOperation);
				elements.remove(i - 1);
			}
		}
		for(int i = 0; i < elements.size(); i++)
		{
			if(isSecondOrderOperator(elements.get(i)) && operandsNumber(elements.get(i)) == 2)
			{
				String currentOperation = String.valueOf(operate(Double.parseDouble(elements.get(i - 1)), elements.get(i), Double.parseDouble(elements.get(i + 1))));
				elements.set(i - 1, currentOperation);
				elements.remove(i);
				elements.remove(i);
			}
			else if(isFirstOrderOperator(elements.get(i)) && operandsNumber(elements.get(i)) == 1)
			{
				String currentOperation = String.valueOf(operate(elements.get(i), Double.parseDouble(elements.get(i + 1))));
				elements.set(i, currentOperation);
				elements.remove(i + 1);
			}
		}
		for(int i = 0; i < elements.size(); i++)
		{
			if(isThirdOrderOperator(elements.get(i)))
			{
				String currentOperation = String.valueOf(operate(Double.parseDouble(elements.get(i - 1)), elements.get(i), Double.parseDouble(elements.get(i + 1))));
				elements.set(i - 1, currentOperation);
				elements.remove(i);
				elements.remove(i);
			}
		}
		for(int i = 0; i < elements.size(); i++)
		{
			if(isFourthOrderOperator(elements.get(i)))
			{
				String currentOperation = String.valueOf(operate(Double.parseDouble(elements.get(i - 1)), elements.get(i), Double.parseDouble(elements.get(i + 1))));
				elements.set(i - 1, currentOperation);
				elements.remove(i);
				elements.remove(i);
			}
		}
		value = Double.parseDouble(elements.get(0));
	}
	
	private static ArrayList<String> splitElements()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		int index = 0;
		for(int i = 0; i < sentence.length(); i++)
		{
			if(isOperator(sentence.charAt(i)) || isSymbol(sentence.charAt(i)))
			{
				list.add(Character.toString(sentence.charAt(i)));
				index++;
				list.add("");
				index++;
			}
			else if(Character.isAlphabetic(sentence.charAt(i)))
			{
				list.add(Character.toString(sentence.charAt(i)));
				index++;
				while(Character.isAlphabetic(sentence.charAt(i + 1)))
				{
					list.set(index, list.get(index) + sentence.charAt(i + 1));
					i++;
				}
				list.add("");
				index++;
			}
			else list.set(index, list.get(index) + sentence.charAt(i));
		}
		while(list.contains("")) list.remove(list.indexOf(""));
		return list;
	}
	
	private static byte operandsNumber(String operand)
	{
		if(operand.compareTo("sqrt") == 0 || operand.compareTo("cbrt") == 0 || operand.compareTo("!") == 0 || operand.compareTo("sin") == 0 || operand.compareTo("cos") == 0 || operand.compareTo("tan") == 0) return 1;
		else if(operand.compareTo("π") == 0) return -1;
		else return 2;
	}
	
	private static double operate(double firstOperand, String operator, double secondOperand)
	{
		if(operator.compareTo("+") == 0) return firstOperand + secondOperand;
		else if (operator.compareTo("-") == 0) return firstOperand - secondOperand;
		else if(operator.compareTo("*") == 0 || operator.compareTo("x") == 0) return firstOperand * secondOperand;
		else if(operator.compareTo("/") == 0 || operator.compareTo("÷") == 0) return firstOperand / secondOperand;
		else if(operator.compareTo("pow") == 0) return Math.pow(firstOperand, secondOperand);
		return 0;
	}
	
	private static double operate(String operator, double operand)
	{
		if(operator.compareTo("sqrt") == 0) return Math.sqrt(operand);
		else if(operator.compareTo("cbrt") == 0) return Math.cbrt(operand);
		else if(operator.compareTo("!") == 0) return Function.factorial(operand);
		else if(operator.compareTo("π") == 0) return Math.PI * operand;
		else if(operator.compareTo("sin") == 0) return Math.sin(Math.toRadians(operand));
		else if(operator.compareTo("cos") == 0) return Math.cos(Math.toRadians(operand));
		else if(operator.compareTo("tan") == 0) return Math.tan(Math.toRadians(operand));
		return 0;
	}
	
	private static boolean isOperator(char c)
	{
		if(c == '+' || c == '-' || c == '*' || c == 'x' || c == '/' || c == '÷' || c == '^' || c == '!') return true;
		return false;
	}
	
	private static boolean isSymbol(char c)
	{
		if(c == 'π') return true;
		return false;
	}
	
	private static boolean isFirstOrderOperator(String s)
	{
		if(s.compareTo("sin") == 0 || s.compareTo("cos") == 0|| s.compareTo("tan") == 0 || s.compareTo("π") == 0) return true;
		return false;
	}
	
	private static boolean isSecondOrderOperator(String s)
	{
		if(s.compareTo("pow") == 0 || s.compareTo("sqrt") == 0|| s.compareTo("cbrt") == 0 || s.compareTo("!") == 0) return true;
		return false;
	}
	
	private static boolean isThirdOrderOperator(String s)
	{
		if(s.compareTo("*") == 0 || s.compareTo("x") == 0 || s.compareTo("/") == 0 ||  s.compareTo("÷") == 0) return true;
		return false;
	}
	
	private static boolean isFourthOrderOperator(String s)
	{ 
		if(s.compareTo("+") == 0 || s.compareTo("-") == 0) return true;
		return false;
	}
}
