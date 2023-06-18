package scriptPack;

import java.util.Scanner;

/**
 * JCalculator
 * @version 0.3
 * RunMain class.
 * @author iAhmadGad
 */

public class RunMain {
	
	static Solve solve = new Solve();
	static Scanner read = new Scanner(System.in);
	static int i = 0;
	public static void main(String[] args)
	{
		
		while(i < 1) {
			
			System.out.println("Type the math operation");
			String input = read.nextLine();
			if(input.compareTo("x") == 0) {
				System.out.println("- Closed -");
				System.exit(0);;
				
			}
			System.out.println(solve.out(input));
			System.out.println("Close the program - Type x -");
			
		}
	}
}
