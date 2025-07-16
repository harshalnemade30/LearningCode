package firstjavacode;

public class BasicStringPractice {

	
	
	public static void main(String [] args) {
		
		String name = "Harshal_01";
		
		System.out.println(name);
		
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		

		String name1 = "      Harshal_01 Nemade   ";

		System.out.println(name1);
		System.out.println(name1.trim());
		System.out.println(name1.lastIndexOf('a'));
		System.out.println(name1.substring(17));
		System.out.println(name1.substring(7, 15));
		System.out.println(name1.charAt(10));
		System.out.println("*******************************");

		System.out.println(name.startsWith("Ha"));
		System.out.println(name.startsWith("Ha"));
		System.out.println("My name is vidhi \" My name is harshal" );
		System.out.println("My name is vidhi \n My name is harshal" );



		
	}
	
	
}
