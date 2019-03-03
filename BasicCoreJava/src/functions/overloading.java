package functions;

public class overloading {

	public static void main(String[] args) 
	{
	
		System.out.println(sum (10,20));
		System.out.println(sum(10,20,30));

	}

	public static int sum(int a, int b)
		{
		return (a+b);
	}
	
	public static int sum(int a, int b, int c)   // her we incrase one parameter, hence call method overloading
	{
	return (a+b+c);
}
	
	public static void messagge(int age, String name)
	{
		
	}
	
	public static void messagge(String name, int age)  // method overloading by swaping paramters
	{
		
	}
	
	/*public static void messagge(int age, String name)
	{
		
	}
	
	private static void messagge(String name, int age)  // method overloading not possible by chaining access modifers
	{
		
	} */
	/*
	public static void messagge(int age, String name)
	{
		
	}
	
	public void messagge(String name, int age)  // method overloading not possible by chaning nature of method
	{
		
	} */
	
/*	public static void messagge(int age, String name)
	{
		
	}
	
	public void messagge(String name, int age)  // method overloading not possible by chaning return type
	{
		return 10;
	} */
	
	
}
