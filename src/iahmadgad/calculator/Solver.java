package iahmadgad.calculator;

/*
 * JCalculator
 */

import java.util.ArrayList;

/**
 * Solver class.
 * 
 * @author iAhmadGad
 * @version 0.6
 * @since 0.6
 */

public class Solver 
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
		Solver.sentence = sentence;
		solve();
		return value;
	}
	
	private static void solve()
	{
		ArrayList<String> elements = parse();
		for(int i = 0; i < elements.size() && elements.size() > 1; i++)
		{
			if(isNestedOperation(elements.get(i)))
			{
				String currentOperation = String.valueOf(getValue(elements.get(i).substring(1, elements.get(i).length() - 1)));
				elements.set(i, currentOperation);
			}
		}
		for(int i = 0; i < elements.size(); i++)
		{
			if(isFunction(elements.get(i)))
			{
				String currentOperation = String.valueOf(operateFunction(elements.get(i)));
				elements.set(i, currentOperation);
			}
		}
		for(int i = 0; i < elements.size() && elements.size() > 1; i++)
		{
			if(isFirstOrderOperator(elements.get(i)) && operandsNumber(elements.get(i)) == 2)
			{
				String currentOperation = String.valueOf(operate(Double.parseDouble(elements.get(i - 1)), elements.get(i), Double.parseDouble(elements.get(i + 1))));
				elements.set(i - 1, currentOperation);
				elements.remove(i);
				elements.remove(i);
				i -= 2;
			}
			else if(isFirstOrderOperator(elements.get(i)) && operandsNumber(elements.get(i)) == 1)
			{
				String currentOperation = String.valueOf(operate(elements.get(i), Double.parseDouble(elements.get(i + 1))));
				elements.set(i, currentOperation);
				elements.remove(i + 1);
				i--;
			}
		}
		for(int i = 0; i < elements.size() && elements.size() > 1; i++)
		{
			if(isSecondOrderOperator(elements.get(i)))
			{
				String currentOperation = String.valueOf(operate(Double.parseDouble(elements.get(i - 1)), elements.get(i), Double.parseDouble(elements.get(i + 1))));
				elements.set(i - 1, currentOperation);
				elements.remove(i);
				elements.remove(i);
				i -= 2;
			}
		}
		for(int i = 0; i < elements.size() && elements.size() > 1; i++)
		{
			if(isThirdOrderOperator(elements.get(i)))
			{
				String currentOperation = String.valueOf(operate(Double.parseDouble(elements.get(i - 1)), elements.get(i), Double.parseDouble(elements.get(i + 1))));
				elements.set(i - 1, currentOperation);
				elements.remove(i);
				elements.remove(i);
				i -= 2;
			}
		}
		value = Double.parseDouble(elements.get(0));
	}
	
	private static ArrayList<String> parse()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("");
		int index = 0;
		int parenthesesCount = 0;
		CurrentParse current = CurrentParse.Default;
		for(int i = 0; i < sentence.length(); i++)
		{
			if(Character.isAlphabetic(sentence.charAt(i)) && sentence.charAt(i) != 'x' && current == CurrentParse.Default)
			{
				index++;
				if(index > 0 && (presentsInteger(list.get(index - 1)) || presentsDouble(list.get(index - 1))))
				{
					list.add("*");
					index++;
				}
				current = CurrentParse.Function;
				list.add("");
			}
			else if(sentence.charAt(i) == '(' && current == CurrentParse.Default)
			{
				index++;
				if(index > 0 && (presentsInteger(list.get(index - 1)) || presentsDouble(list.get(index - 1))))
				{
					list.add("*");
					index++;
				}
				current = CurrentParse.BetweenParentheses;
				list.add("");
			}
			if(current == CurrentParse.Function)
			{
				if(sentence.charAt(i) == '(') parenthesesCount++;
				else if(sentence.charAt(i) == ')') parenthesesCount--;
				if((sentence.charAt(i) == ')' || Character.isDigit(sentence.charAt(i))) && parenthesesCount == 0)
				{
					list.add("");
					index++;
					current = CurrentParse.Default;
				}
				else list.set(index, list.get(index) + sentence.charAt(i));
			}
			if(current == CurrentParse.BetweenParentheses)
			{
				if(sentence.charAt(i) == '(') parenthesesCount++;
				else if(sentence.charAt(i) == ')') parenthesesCount--;
				if(sentence.charAt(i) == ')' && parenthesesCount == 0)
				{
					list.set(index, list.get(index) + ')');
					list.add("");
					index++;
					current = CurrentParse.Default;
				}
				else list.set(index, list.get(index) + sentence.charAt(i));
			}
			if(current == CurrentParse.Default)
			{
				if(isOperator(sentence.charAt(i)))
				{
					list.add(Character.toString(sentence.charAt(i)));
					index++;
					list.add("");
					index++;
				}
				else if(isConsonant(sentence.charAt(i)))
				{
					if(index > 0 && (presentsInteger(list.get(index - 1)) || presentsDouble(list.get(index - 1))))
					{
						list.add("*");
						index++;
					}
					list.add(String.valueOf(getConsonantValue(sentence.charAt(i))));
					index++;
					list.add("");
					index++;
				}
				else list.set(index, list.get(index) + sentence.charAt(i));
			}
		}
		while(list.contains("")) list.remove(list.indexOf(""));
		while(list.contains(")")) list.remove(list.indexOf(")"));
		return list;
	}
	
	private static byte operandsNumber(String operand)
	{
		if(operand.compareTo("!") == 0) return 1;
		else return 2;
	}
	
	private static double operate(double firstOperand, String operator, double secondOperand)
	{
		if(operator.compareTo("+") == 0) return firstOperand + secondOperand;
		else if (operator.compareTo("-") == 0) return firstOperand - secondOperand;
		else if(operator.compareTo("*") == 0 || operator.compareTo("x") == 0) return firstOperand * secondOperand;
		else if(operator.compareTo("/") == 0 || operator.compareTo("÷") == 0) return firstOperand / secondOperand;
		else if(operator.compareTo("^") == 0) return Math.pow(firstOperand, secondOperand);
		return 0;
	}
	
	private static double operate(String operator, double operand)
	{
		if(operator.compareTo("!") == 0) return Function.factorial(operand);
		return 0;
	}
	
	private static double operateFunction(String function)
	{
	    if(function.contains("pow")) return Math.pow(getValue(function.substring(4).split(",")[0]), getValue(function.substring(4).split(",")[1]));
	    else if(function.contains("sqrt")) return Math.sqrt(getValue(function.substring(5)));
		else if(function.contains("cbrt")) return Math.cbrt(getValue(function.substring(5)));
		else if(function.contains("sin")) return Math.sin(Math.toRadians(getValue(function.substring(4))));
		else if(function.contains("cos")) return Math.cos(Math.toRadians(getValue(function.substring(4))));
		else if(function.contains("tan")) return Math.tan(Math.toRadians(getValue(function.substring(4))));
		else if(function.compareTo("rnd") == 0) return Function.random();
		else if(function.contains("rnd")) return Function.random(getValue(function.substring(4).split(",")[0]), getValue(function.substring(4).split(",")[1]));
		return 0;
	}
	
	private static boolean isOperator(char c)
	{
		if(c == '+' || c == '-' || c == '*' || c == 'x' || c == '/' || c == '÷' || c == '^' || c == '!') return true;
		return false;
	}
	
	private static boolean isConsonant(char c)
	{
		if(c == 'π') return true;
		return false;
	}
	
	private static double getConsonantValue(char c)
	{
		if(c == 'π') return Math.PI;
		return 1;
	}
	
	private static boolean isNestedOperation(String s)
	{
		if(s.charAt(0) == '(' && s.charAt(s.length() - 1) == ')') return true;
		return false;
	}
	
	private static boolean isFunction(String s)
	{
		if(s.contains("pow")|| s.contains("sqrt")|| s.contains("cbrt")|| s.contains("sin")|| s.contains("cos")|| s.contains("tan")|| s.contains("rn")) return true;
		return false;
	}
	
	private static boolean isFirstOrderOperator(String s)
	{
		if(s.compareTo("^") == 0 || s.compareTo("!") == 0) return true;
		return false;
	}
	
	private static boolean isSecondOrderOperator(String s)
	{
		if(s.compareTo("*") == 0 || s.compareTo("x") == 0 || s.compareTo("/") == 0 ||  s.compareTo("÷") == 0) return true;
		return false;
	}
	
	private static boolean isThirdOrderOperator(String s)
	{ 
		if(s.compareTo("+") == 0 || s.compareTo("-") == 0) return true;
		return false;
	}
	
	/**
	 * Checks if string presents a double value
	 * 
	 * @param string
	 * @return true if it presents a double value & false if it's not
	 */
	protected static boolean presentsDouble(String string)
	{
		int point = 0;
		for(int i = 0; i < string.length(); i++)
		{
			if(string.charAt(i) == '.' && point == 0) point = 1;
			else if((!Character.isDigit(string.charAt(i)) && string.charAt(i) != '.') || string.charAt(i) == '.' && point == 1) return false;
		}
		if(point == 0) return false;
		if(string == "") return false;
		return true;
	}
	
	/**
	 * Checks if string presents an int value
	 * 
	 * @param string
	 * @return true if it presents an int value & false if it's not
	 */
	protected static boolean presentsInteger(String string)
	{
		for(int i = 0; i < string.length(); i++)
		{
			if(!Character.isDigit(string.charAt(i))) return false;
		}
		if(string == "") return false;
		return true;
	}
	
	protected enum CurrentParse
	{
		Default,
		Function,
		BetweenParentheses
	}
}
