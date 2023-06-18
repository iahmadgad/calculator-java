package scriptPack;

public class Solve {
	
	int result , num1 , num2 , num3;
	String resultText , RndSen;
	public String out(String sen)
	{
		
		if (sen.contains("+"))
		{
			
			String[] splitSen = sen.split("\\+");
			num1 = Integer.parseInt(splitSen[0]);
			num2 = Integer.parseInt(splitSen[1]);
			result = num1 + num2;
			resultText = Integer.toString(result);
			
		}
		
		else if (sen.contains("-"))
		{
			
			String[] SplitSen = sen.split("-");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = num1 - num2;
			resultText = Integer.toString(result);
			
		}
		
		else if (sen.contains("*"))
		{
			
			String[] SplitSen = sen.split("\\*");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = num1 * num2;
			resultText = Integer.toString(result);
			
		}
		
		else if (sen.contains("x"))
		{
			
			String[] SplitSen = sen.split("x");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = num1 * num2;
			resultText = Integer.toString(result);
			
		}
		
		else if (sen.contains("/"))
		{
			
			String[] SplitSen = sen.split("/");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = num1 / num2;
			resultText = Integer.toString(result);
			
		}
		
		else if (sen.contains("\u00F7"))
		{
			
			String[] SplitSen = sen.split("\u00F7");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = num1 / num2;
			resultText = Integer.toString(result);
			
		}
		
		else if (sen.contains("^"))
		{
			
			String[] SplitSen = sen.split("\\^");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = (int) Math.pow(num1 , num2);
			resultText = Integer.toString(result);
			
		}
		
		else if (sen.contains("\u221A"))
		{
			
			String[] SplitSen = sen.split("\u221A");
			num1 = Integer.parseInt(SplitSen[1]);
			result = (int) Math.sqrt(num1);
			resultText = Integer.toString(result);
			
		}
		
		else if (sen.contains("3\u221A"))
		{
			
			String[] SplitSen = sen.split("3\u221A");
			num1 = Integer.parseInt(SplitSen[1]);
			result = (int) Math.cbrt(num1);
			resultText = Integer.toString(result);
			
		}
		
		
		else if (sen.contains("\u03C0"))
		{
			
			String[] SplitSen = sen.split("\u03C0");
			num1 = Integer.parseInt(SplitSen[0]);
			result = num1 * (int) Math.PI;
			resultText = Integer.toString(result);
			
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
		
		
		return resultText;
		
	}

}
