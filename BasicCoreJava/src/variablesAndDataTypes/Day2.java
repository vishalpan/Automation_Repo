package variablesAndDataTypes;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day1 obj= new Day1();;
		System.out.println(obj.city);
		System.out.println(obj.city2);
		System.out.println(obj.country); // 
		
		//+ -  * / %
		
		int a= 3;
		int b = 7;
		/*
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(b%a);
		System.out.println(7%3); */
		
		b=b-a;
		a=a+b;
		b=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
