package firstjavacode;

import java.util.Scanner;

public class UserInput2 {
	public static void main (String [] args) {
		UserInput2 UI = new UserInput2();	
		System.out.println("Taking input from user!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number a: ");
		int a = sc.nextInt();
		System.out.println("enter number b: ");
		int b = sc.nextInt();
		int add = a+b;
		System.out.println("a+b="+add);
		UI.Multipliaction(a, b);
		sc.close();
		
	}
	
	public void Multipliaction(int a, int b){
		
		int mul = a*b;
		System.out.println("a*b="+mul);

		
	}
	
	

}
