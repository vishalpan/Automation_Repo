package exceptions;

public class ThrowException {

	public static void main(String[] args) throws Exception 
	{
		int a=10;
		int b=20;
		
		if (a==b)
		{
			System.out.println("Number Match");
		}else
		{
			throw new Exception("Number not mathced a="+a+"and b="+b);
		}
	}

}
