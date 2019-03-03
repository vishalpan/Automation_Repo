package Constructor;

public class Students
{
// In this student class we have to create a parameterize constructor. This class have two parameters id and name
	
	int id;
	String name;
	
	// creating a parameterize construct
	
	Students (int i, String n)
	{
		i=id;
		n=name;
	}
		
	 void display()
	{
		System.out.println(id+""+name);
	}
	public static void main(String[] args)
	{
		//calling a constructor by creating a object and passing the value
		
		Students s1=new Students(100,"vishal");
		Students s2=new Students(101,"shilpa");
		
	// calling of an object
	
	s1.display();
	s2.display();
	
}
	}
