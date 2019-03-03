package variablesAndDataTypes;

public class concatination {

	public static void main(String[] args) 
	{
	String name ="vishal";
	String lastname = "pandey";
	int age=30;
	int bike=1;
	

	System.out.println("My name is vishal pandey");  // hard code value
	
	System.out.println(name+" "+lastname); // concatination
	
	System.out.println(age+bike);
	
	System.out.println(name+" "+lastname+age+bike);  // string + int = string , left to right calc
	
	System.out.println(name+" "+lastname+(age+bike)); // string +(int) 
	
	System.out.println(age+bike+name+" "+lastname);
	}

}
