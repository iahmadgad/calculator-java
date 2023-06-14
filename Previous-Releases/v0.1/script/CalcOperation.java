package script;

import script.MathOperations;
public class CalcOperation {
	
	MathOperations MathOp = new MathOperations();
	int result , num1 , num2 , num3;
	String resultText , RndSen;
	public String calc(String MathSen)
	{
		
		if (MathSen.contains("+"))
		{
			
			String[] SplitSen = MathSen.split("\\+");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = MathOp.add(num1 , num2);
			resultText = Integer.toString(result);
			
		}
		
		else if (MathSen.contains("-"))
		{
			
			String[] SplitSen = MathSen.split("-");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = MathOp.sub(num1 , num2);
			resultText = Integer.toString(result);
			
		}
		
		else if (MathSen.contains("*"))
		{
			
			String[] SplitSen = MathSen.split("\\*");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = MathOp.mtp(num1 , num2);
			resultText = Integer.toString(result);
			
		}
		
		else if (MathSen.contains("x"))
		{
			
			String[] SplitSen = MathSen.split("x");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = MathOp.mtp(num1 , num2);
			resultText = Integer.toString(result);
			
		}
		
		else if (MathSen.contains("/"))
		{
			
			String[] SplitSen = MathSen.split("/");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = MathOp.dvd(num1 , num2);
			resultText = Integer.toString(result);
			
		}
		
		else if (MathSen.contains("÷"))
		{
			
			String[] SplitSen = MathSen.split("÷");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = MathOp.dvd(num1 , num2);
			resultText = Integer.toString(result);
			
		}
		
		else if (MathSen.contains("^"))
		{
			
			String[] SplitSen = MathSen.split("\\^");
			num1 = Integer.parseInt(SplitSen[0]);
			num2 = Integer.parseInt(SplitSen[1]);
			result = (int) Math.pow(num1 , num2);
			resultText = Integer.toString(result);
			
		}
		
		else if (MathSen.contains("√"))
		{
			
			String[] SplitSen = MathSen.split("√");
			num1 = Integer.parseInt(SplitSen[1]);
			result = (int) Math.sqrt(num1);
			resultText = Integer.toString(result);
			
		}
		
		else if (MathSen.contains("3√"))
		{
			
			String[] SplitSen = MathSen.split("3√");
			num1 = Integer.parseInt(SplitSen[1]);
			result = (int) Math.cbrt(num1);
			resultText = Integer.toString(result);
			
		}
		
		/*
		else if (MathSen.contains("π"))
		{
			
			String[] SplitSen = MathSen.split("π");
			num1 = Integer.parseInt(SplitSen[0]);
			result = (int) Math.PI(num1);
			resultText = Integer.toString(result);
			
		}
		
		*/
		
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
		
		
		return resultText;
		
	}

}
