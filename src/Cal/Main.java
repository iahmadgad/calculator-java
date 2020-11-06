package Cal;

import java.util.Scanner;
import java.util.Random;
public class Main {
	static Random rand = new Random();
    static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		int out1, out; 
		String end;
		String sen = read.nextLine();
		do {
		//addition
		if (sen.contains("+")) {
			String[] split = sen.split("+");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			out = x+y;
			System.out.println(out);

				}
		//Subtraction
		else if (sen.contains("-")) {
			String[] split = sen.split("-");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			out = x-y;
			System.out.println(out);

				}
		//Multiplication
		else if (sen.contains("*")) {
			String[] split = sen.split("*");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			out = x*y;
			System.out.println(out);
			}
		else if (sen.contains("x")) {
			String[] split = sen.split("x");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			out = x*y;
			System.out.println(out);
			}
		//Division
		else if (sen.contains("/")) {
			String[] split = sen.split("/");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			out = x/y;
			System.out.println(out);
			}
		//Modulus
		else if (sen.contains("%")) {
			String[] split = sen.split("%");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			out = x%y;
			System.out.println(out);
			}
			

		//power
		else if (sen.contains("p")) {
			String[] split = sen.split("p");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			out = (int) Math.pow(x,y);
			System.out.println(out);

			}
		// max number
		else if (sen.contains("mx")) {
			String[] split = sen.split("mx");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			System.out.println(Math.max(x, y));
			}
		// min number
		else if (sen.contains("mn")) {
			String[] split = sen.split("mn");
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			System.out.println(Math.min(x, y));
		    }
		//random number
		else if (sen.contains("rn")) {
			String[] split1 = sen.split("rn");
			String sennu1 = split1[0];
		    String senin = split1 [1];
			if (sennu1 == null) {
			    if (senin == null) {
				System.out.println((int) Math.random());
			    }
			    else if(senin != null) {
			    String[] split = senin.split(",");
			    int x = Integer.parseInt(split[0]);
			    int y = Integer.parseInt(split[1]);
			    //int rx = (int) (Math.random()*(y-x))+x;
			    out = (int)(Math.random()*(y-x))+x;
			    System.out.println(out);
			    }
			}
		    else if(sennu1 != null) {
		    	if (senin == null) {
		    	//int sennu2 = Integer.parseInt(sennu1);
		    	}
				else if(senin != null) {
				String[] split = senin.split(",");
				int x = Integer.parseInt(split[0]);
				int y = Integer.parseInt(split[1]);
				//int rx = (int) (Math.random()*(y-x))+x;
				out = (int)(Math.random()*(y-x))+x;
				System.out.println(out);
				}
		    }
	    }
		
		//abs
		else if (sen.contains("a")) {
			String[] split = sen.split("a");
			int x = Integer.parseInt(split[1]);
			out = Math.abs(x); ;
			System.out.println(out);
		    }
		end = read.next();
		if (end == "e") {
			System.out.println("end");
		}
		else
		{
			sen = end;
			end = "1";
		}
		
		}while (end == "1");
		
}
}
