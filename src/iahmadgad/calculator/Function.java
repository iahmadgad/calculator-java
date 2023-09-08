package iahmadgad.calculator;

public class Function 
{
	public static double factorial(double n)
	{
		if(n == 1) return n;
		else return n * factorial(n - 1);
	}
}
