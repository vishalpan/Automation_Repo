package functions;

public class Practicemodifer2 {

	public static void main(String[] args) 
	{
	    // here we have created a new class 'Practicemodifer2' within same package'function' and try to call all the access modifers by creating object of previous call
		
		Practiseaccessmodifies obj=new Practiseaccessmodifies();
		obj.protectedmethod();
		obj.publicmethod();
		obj.noaccessmodiifer();
		// here we are unable to call private method within same pacakage different class
     
	}

}
