package iahmadgad.calculator;

import java.util.Scanner;

public class MainConsole 
{
	private static Scanner scanner = new Scanner(System.in);
	
	static int i = 0;
	
	private MainConsole()
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
			new MainConsole();
			System.out.print("run - JCaclulator - again? (y/n): ");
			run = scanner.next().compareTo("y") == 0;
			i++;
		}
		System.exit(0);
	}
}
