package functions;

public class Day4nonstaticmethod
{

	public static void main(String[] args)

	{
		// sum(10,20);   // error bcz we have call non static reference inside static method
		
		Day4nonstaticmethod obj=new Day4nonstaticmethod ();
		
		obj.sum(10, 20);	
	
		System.out.println(obj.sum(10, 20));
	}

	public int sum(int a, int b)

	{
		return a + b;
	}

}
