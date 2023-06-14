package script;

import java.util.Scanner;

import script.CalcOperation;

public class RunMain {

	static CalcOperation CalOp = new CalcOperation();
	static Scanner read = new Scanner(System.in);
	static int x = 20;
	public static void main(String[] args)
	{
		
		for(int i = 0; i < x; i++) {
			
			System.out.println("Type the math operation");
			String r = read.nextLine();
			System.out.println(CalOp.calc(r));
			
		}
			
		
	}
}
