package functions;

public class Practisenonstaticmethod {

	public static void main(String[] args)
	{
		
		// sum(10,20); // Cannot make a static reference to the non-static method sum(int, int) from the type Practisenonstaticmethod
		
		Practisenonstaticmethod	obj= new Practisenonstaticmethod(); // created a object for class
			obj.sum(10, 20);
			System.out.println(obj.sum(10, 20));

	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}

}
