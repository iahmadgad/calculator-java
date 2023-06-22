package scriptPack;

/**
 * JCalculator
 * @version 0.4
 * Solve class.
 * @author iAhmadGad
 */

public class Solve {
	
	double result , num1 , num2, num3;
	String RndSen;
	String[] splitSen;
	public String out(String sen)
	{
		
		if (sen.contains("+"))
		{
			
			splitSen = sen.split("\\+");
			num1 = Double.parseDouble(splitSen[0]);
			num2 = Double.parseDouble(splitSen[1]);
			result = num1 + num2;
			
		}
		
		else if (sen.contains("-"))
		{
			
			splitSen = sen.split("-");
			num1 = Double.parseDouble(splitSen[0]);
			num2 = Double.parseDouble(splitSen[1]);
			result = num1 - num2;
			
		}
		
		else if (sen.contains("*"))
		{
			
			splitSen = sen.split("\\*");
			num1 = Double.parseDouble(splitSen[0]);
			num2 = Double.parseDouble(splitSen[1]);
			result = num1 * num2;
			
		}
		
		else if (sen.contains("x"))
		{
			
			splitSen = sen.split("x");
			num1 = Double.parseDouble(splitSen[0]);
			num2 = Double.parseDouble(splitSen[1]);
			result = num1 * num2;
			
		}
		
		else if (sen.contains("/"))
		{
			
			splitSen = sen.split("/");
			num1 = Double.parseDouble(splitSen[0]);
			num2 = Double.parseDouble(splitSen[1]);
			result = num1 / num2;
			
		}
		
		else if (sen.contains("\u00F7"))
		{
			
			splitSen = sen.split("\u00F7");
			num1 = Double.parseDouble(splitSen[0]);
			num2 = Double.parseDouble(splitSen[1]);
			result = num1 / num2;
			
		}
		
		else if (sen.contains("^"))
		{
			
			splitSen = sen.split("\\^");
			num1 = Double.parseDouble(splitSen[0]);
			num2 = Double.parseDouble(splitSen[1]);
			result = Math.pow(num1 , num2);
			
		}
		
		else if (sen.contains("\u221A"))
		{
			splitSen = sen.split("\u221A");
								
			if (splitSen[0].compareTo("3")==0)
			{
				
				num1 = Double.parseDouble(splitSen[1]);
				result =num1;
				result = Math.cbrt(num1);			
			
			}
			
			else 
			{
				num1 = Double.parseDouble(splitSen[1]);
				result = Math.sqrt(num1);			
				
			}
			
		}
		
		else if (sen.contains("\u03C0"))
		{
			
			splitSen = sen.split("\u03C0");
			num1 = Double.parseDouble(splitSen[0]);
			result = Math.PI * num1;
			
		}
		
		else if (sen.contains("sin"))
		{
			
			splitSen = sen.split("sin");
			num1 = Double.parseDouble(splitSen[1]);
			result = Math.sin(Math.toRadians(num1));
			
		}
		
		else if (sen.contains("cos"))
		{
			
			splitSen = sen.split("cos");
			num1 = Double.parseDouble(splitSen[1]);
			result = Math.cos(Math.toRadians(num1));
			
		}
		
		else if (sen.contains("tan"))
		{
			
			splitSen = sen.split("tan");
			num1 = Double.parseDouble(splitSen[1]);
			result = Math.tan(Math.toRadians(num1));
			
		}
		
		
		else if (sen.contains("rn"))
		{
			
			splitSen = sen.split("rn");
		
			if (sen.indexOf("rn") == 0)
			{
				
				if (sen.contains(","))
				{
					
					splitSen = splitSen[1].split(",");
					num1 = Double.parseDouble(splitSen[0]);
					num2 = Double.parseDouble(splitSen[1]);
					result = (Math.random()*(num2-num1))+num1;
					
				}
				else 
				{
					
					result = Math.random();
					
				}
			}
			
			if (sen.indexOf("rn") != 0)
			{
				
				num1 = Double.parseDouble(splitSen[0]);
				
				if (sen.contains(","))
				{
					
					splitSen = splitSen[1].split(",");
					num2 = Double.parseDouble(splitSen[0]);
					num3 = Double.parseDouble(splitSen[1]);
					result = num1 * ((Math.random()*(num3-num2))+num2);
					
				}
				else
				{
					
					result = num1 * Math.random();
					
				}
			}	
		}	
		
		else
		{
			
			result = Double.parseDouble(sen);
			
		}	
		
		return Double.toString(result);
		
	}
}
