package iahmadgad.calculator;

import java.util.ArrayList;

public class Parser 
{
	private int value;
	
	protected void Parse(String sentence)
	{
		ArrayList<String> elements = splitElements(sentence);
		while(elements.size() != 1)
		{
			String currentOperation;
			if(elements.get(1).compareTo("+") == 0) currentOperation = String.valueOf(Integer.parseInt(elements.get(0)) + Integer.parseInt(elements.get(2)));
			else currentOperation = String.valueOf(Integer.parseInt(elements.get(0)) - Integer.parseInt(elements.get(2)));
			elements.set(0, currentOperation);
			elements.remove(1);
			elements.remove(1);
		}
	}
	
	private ArrayList<String> splitElements(String sentence)
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
	
	private boolean isOperator(char c)
	{
		if(c == '+' || c == '-') return true;
		return false;
	}
}
