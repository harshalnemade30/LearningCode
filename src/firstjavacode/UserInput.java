package firstjavacode;

import java.util.Scanner;

public class UserInput {

	static int c=5;
	static int d=7;

	public static void main (String [] args) {
		UserInput UI = new UserInput();	
		Scanner sc = new Scanner(System.in);
		System.out.println("Taking input from user!!");
		/*
		 * System.out.println("enter number a: "); int a = sc.nextInt();
		 * System.out.println("enter number b: "); int b = sc.nextInt(); int add = a+b;
		 * System.out.println("a+b="+add);
		 */
		//UI.Multipliaction(c, d);
		
		boolean b1 =sc.hasNextByte();
		System.out.println(b1);
		sc.close();
		
	}
	
	public void Multipliaction(int c, int d){
		
		int mul = c*d;
		System.out.println("multipliaction of c and d ="+mul);

		
	}
	
	

}
