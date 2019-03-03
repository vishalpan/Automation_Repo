package functions;

public class Practiseaccessmodifies {

	public static void main(String[] args)
	{
		// since all the below method is non static and we have to call inside static method so we have to create a object
		
		Practiseaccessmodifies obj=new Practiseaccessmodifies();
				obj.publicmethod();
		obj.priavemethod();
		obj.noaccessmodiifer();
		obj.protectedmethod();

	}
	
	public void publicmethod()
	{
		System.out.println("this is public method");
	}

	private void priavemethod()
	{
		System.out.println("This is private method");
	}
	
	protected void protectedmethod()
	{
		System.out.println("This is protected method");
	}
	
	void noaccessmodiifer()
	{
		System.out.println("this is default modifiers");
	}
}
