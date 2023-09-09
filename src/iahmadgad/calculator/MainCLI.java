package iahmadgad.calculator;

/*
 * JCaclculator
 */

import java.util.Scanner;

/**
 * MainCLI class.
 * 
 * @author iAhmadGad
 * @version 0.6
 * @since 0.6
 */

public class MainCLI 
{
	private static Scanner scanner = new Scanner(System.in);
	
	static int i = 0;
	
	private MainCLI()
	{
		System.out.println("--- JCalculator 0.6 by @iAhmadGad ---");
		if(i != 0)scanner.nextLine();
		System.out.print("Enter math sentence: ");
		String sentence = scanner.nextLine();
		System.out.println(Parser.getEnhancedValue(sentence));
	}
	
	public static void main(String args[])
	{
		boolean run = true;
		while(run)
		{
			new MainCLI();
			System.out.print("run - JCaclulator - again? (y/n): ");
			run = scanner.next().compareTo("y") == 0;
			i++;
		}
		System.exit(0);
	}
}
