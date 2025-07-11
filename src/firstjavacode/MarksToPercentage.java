package firstjavacode;

import java.util.Scanner;

public class MarksToPercentage {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter math marks : ");
		int math = sc.nextInt();
		System.out.println("enter sci marks : ");
		int sci = sc.nextInt();
		System.out.println("enter eng marks : ");
		int eng = sc.nextInt();
		System.out.println("enter phy marks : ");
		int phy = sc.nextInt();
		System.out.println("enter chem marks : ");
		int chem = sc.nextInt();
		
		System.out.println("enter totalMarks : ");
		double totalMarks = sc.nextDouble();
		
		double totalObtainedMarks = math+sci+eng+phy+chem;
		System.out.println("totalMarks : " + totalObtainedMarks);
		
		
		double percentage = (totalObtainedMarks/totalMarks)*100;
		System.out.println("Percentage :" + percentage + "%");
		
		
		if (percentage>70) {
			
			System.out.println("Grade : " + "A");
		}else
		{
			
			System.out.println("Grade : " + "B");

			
		}
		
		
		
	
		
		
	}
	
	
}
