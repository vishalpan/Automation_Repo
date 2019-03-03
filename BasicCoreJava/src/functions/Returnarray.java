package functions;

public class Returnarray {

	public static void main(String[] args) 
	{
		String[][] str= test();
		for (int r=0; r<str.length; r++)
		{
			for (int c=0; c<str[r].length; c++)
			{
				System.out.println("pritnt the string value"+str[r][c]);
			}
		}
	}
		
	public static Returnarray test2()
	{
		Returnarray obj3=new Returnarray();
		return obj3;
		
	}
	
	public static String[][] test()
	{
		String[][] str={{"U1","P1","A1"},{"U2","P2","A2"},{"U3","P3","A3"}}; //str is 2d array
	return str;
	
	}
	
	public static String test3()
	{
		return "test message";
		
	}
	
	public static int sum(int a, int b)
	{
		return a+b;
		
	}

}
