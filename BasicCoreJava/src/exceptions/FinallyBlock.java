package exceptions;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
		
		fun1();
		
	}
	public static void fun1() throws Exception
	{
		
	}

}
