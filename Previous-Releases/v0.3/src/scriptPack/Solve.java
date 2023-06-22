package scriptPack;

/**
 * JCalculator
 * @version 0.3
 * Solve class.
 * @author iAhmadGad
 */

public class Solve {
	
	double result , num1 , num2;
	String resultText , RndSen;
	public String out(String sen)
	{
		
		if (sen.contains("+"))
		{
			
			String[] splitSen = sen.split("\\+");
			num1 = Double.parseDouble(splitSen[0]);
			num2 = Double.parseDouble(splitSen[1]);
			result = num1 + num2;
			
		}
		
		else if (sen.contains("-"))
		{
			
			String[] SplitSen = sen.split("-");
			num1 = Double.parseDouble(SplitSen[0]);
			num2 = Double.parseDouble(SplitSen[1]);
			result = num1 - num2;
			
		}
		
		else if (sen.contains("*"))
		{
			
			String[] SplitSen = sen.split("\\*");
			num1 = Double.parseDouble(SplitSen[0]);
			num2 = Double.parseDouble(SplitSen[1]);
			result = num1 * num2;
			
		}
		
		else if (sen.contains("x"))
		{
			
			String[] SplitSen = sen.split("x");
			num1 = Double.parseDouble(SplitSen[0]);
			num2 = Double.parseDouble(SplitSen[1]);
			result = num1 * num2;
			
		}
		
		else if (sen.contains("/"))
		{
			
			String[] SplitSen = sen.split("/");
			num1 = Double.parseDouble(SplitSen[0]);
			num2 = Double.parseDouble(SplitSen[1]);
			result = num1 / num2;
			
		}
		
		else if (sen.contains("\u00F7"))
		{
			
			String[] SplitSen = sen.split("\u00F7");
			num1 = Double.parseDouble(SplitSen[0]);
			num2 = Double.parseDouble(SplitSen[1]);
			result = num1 / num2;
			
		}
		
		else if (sen.contains("^"))
		{
			
			String[] SplitSen = sen.split("\\^");
			num1 = Double.parseDouble(SplitSen[0]);
			num2 = Double.parseDouble(SplitSen[1]);
			result = Math.pow(num1 , num2);
			
		}
		
		else if (sen.contains("\u221A"))
		{
			
			String[] SplitSen = sen.split("\u221A");
			num1 = Double.parseDouble(SplitSen[1]);
			result = Math.sqrt(num1);
			
		}
		
		else if (sen.contains("3\u221A"))
		{
			
			String[] SplitSen = sen.split("3\u221A");
			num1 = Double.parseDouble(SplitSen[1]);
			result = Math.cbrt(num1);
			
		}
		
		
		else if (sen.contains("\u03C0"))
		{
			
			String[] SplitSen = sen.split("\u03C0");
			num1 = Double.parseDouble(SplitSen[0]);
			result = Math.PI * num1;
			
		}
		
		else if (sen.contains("sin"))
		{
			
			String[] SplitSen = sen.split("sin");
			num1 = Double.parseDouble(SplitSen[1]);
			result = Math.sin(Math.toRadians(num1));
			
		}
		
		else if (sen.contains("cos"))
		{
			
			String[] SplitSen = sen.split("cos");
			num1 = Double.parseDouble(SplitSen[1]);
			result = Math.cos(Math.toRadians(num1));
			
		}
		
		else if (sen.contains("tan"))
		{
			
			String[] SplitSen = sen.split("tan");
			num1 = Double.parseDouble(SplitSen[1]);
			result = Math.tan(Math.toRadians(num1));
			
		}
		
		/*
		else if (MathSen.contains("rn"))
		{
			
			int LocateSen = MathSen.indexOf("rn");
		
			if (LocateSen == 1)
			{
				
				String[] SplitSen = MathSen.split("rn");
				
				if (SplitSen[1].contains(","))
				{
					
					RndSen = SplitSen[1];
					String[] SplitRndSen = RndSen.split(",");
					num1 = Integer.parseInt(SplitRndSen[0]);
					num2 = Integer.parseInt(SplitRndSen[1]);
					double resultD = (Math.random()*(num2-num1))+num1;
					resultText = Double.toString(resultD);
					
				}	
				
			}	
			
		}	
		
		else
		{
			
			resultText = MathSen;
			
		}	
		*/
		
		
		return Double.toString(result);
		
	}

}
