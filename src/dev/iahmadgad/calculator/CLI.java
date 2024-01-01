package dev.iahmadgad.calculator;

/*
 * Java Calculator
 */

import java.util.Scanner;

import dev.iahmadgad.maths.ValueDefiner;

/**
 * CLI class.
 * 
 * @author iAhmadGad
 * @version 0.7
 * @since 0.6
 */

public class CLI 
{
	private static Scanner scanner = new Scanner(System.in);
	
	private CLI()
	{
		while(true)
		{
			System.out.print(">>> ");
			String sentence = scanner.nextLine();
			if(sentence.compareTo("exit") == 0) break;
			System.out.println(ValueDefiner.getEnhancedValue(sentence));
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("--- JCalculator 0.6 by @iAhmadGad ---\nto stop type exit");
		new CLI();
		System.exit(0);
	}
}
