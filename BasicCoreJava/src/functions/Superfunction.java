package functions;

public class Superfunction
{
	// calling the method
	
	public static void main(String[] args)
	
	{
		int n1=4;
		int n2=5;
		
		int n= minval(n1, n2);
		
		System.out.println("Min value is"+n);
	}
/*
	{
		result(6.0); // since the method is void so calling it by statement
	}*/

	// creating a method which will return min value
	
	public static int minval(int n1, int n2)
	{
	int min;
		if (n1<n2)
		{
			min=n1;
		}
		else
		{
			min=n2;
		}
		return min;
	}
	
	// creating a void method which doesnt return any anthing
	
	public static void result (double marks)
	{
		if (marks>95.5)
		{
			System.out.println("First Class");
		}else if(marks>70.5)
		{
			System.out.println("second class");
		}
		else
		{
			System.out.println("Fail");
		}
		// return nothing
	}

}
