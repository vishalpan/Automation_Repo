package exceptions;

public class PractiseException {

	public static void main(String[] args) 
	{
		// Arethmetic execption
		
		int a=10;
		int b=0;
		
		try{
			System.out.println(a/b);
		}catch (ArithmeticException e)
		{
			System.out.println(" Exception caught");
		}
		
		System.out.println("Remaining case");

	}

}
