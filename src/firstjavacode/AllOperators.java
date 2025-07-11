package firstjavacode;

public class AllOperators {

	
	public static void main(String[] args) {
		
		
		int a=51;
		int b=5;
		int c= b++*a;
		//int d= --c;

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(a/b);

		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);

		System.out.println("***********************************");

		System.out.println(a>b && b<a);  //true
		System.out.println(a>b && b>a);  //false
		System.out.println(a>b || b<a);  //true
		System.out.println(a>b || b>a);  //true
		System.out.println(b>a || a>b);  //true
		
		//increment and decrement operators
		System.out.println("***********************************");

		System.out.println(a++);  //51
		System.out.println(a++);  //52
		System.out.println(a);  //53
		System.out.println(++a);  //54
		System.out.println(a);  //54
		System.out.println(a--);  //54
		System.out.println(a);  //53
		System.out.println(--a);  //52
		System.out.println(a);  //52
		System.out.println(a--);  //52
		System.out.println(a);  //51

		System.out.println(c);  //306
		//System.out.println(d);  //305





	}
	
}
