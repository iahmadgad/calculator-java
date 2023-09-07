package iahmadgad.calculator;

import java.util.Scanner;

public class MainConsole 
{
	private static Scanner scanner = new Scanner(System.in);
	
	private static void MainConsole()
	{
		System.out.println("--- JCalculator 0.6 by @iAhmadGad ---");
		System.out.print("Enter math sentence: ");
		String sentence = scanner.next();
		System.out.println(Parser.getValue(sentence));
	}
	
	public static void main(String args[])
	{
		boolean run = true;
		while(run)
		{
			MainConsole();
			System.out.print("run - JCaclulator - again? (y/n): ");
			run = scanner.next().compareTo("y") == 0;
		}
		System.exit(0);
	}
}
