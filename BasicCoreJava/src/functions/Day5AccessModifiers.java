package functions;

public class Day5AccessModifiers 
{

	public static void main(String[] args)
	{
		Day5AccessModifiers obj=new Day5AccessModifiers();   //here we have created a class object and call in a same class
		obj.publicmethod();
		obj.privatemethod();
		obj.noaccessmodmethod();
		obj.protectedmethod();

	}

	public void publicmethod()
	{
		System.out.println("Public Method");
		
	}
	
	private void privatemethod()
	{
		System.out.println("Private Method");
	}
	
	void noaccessmodmethod()
	{
		System.out.println("noAccessMethod");
	}
	
	protected void protectedmethod()
	{
		System.out.println("Protected Method");
	}
}
