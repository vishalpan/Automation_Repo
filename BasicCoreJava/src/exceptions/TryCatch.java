package exceptions;

import java.util.Hashtable;

public class TryCatch {

	public static void main(String[] args) 
	{
		// try and catch , to handle unchecked exception
		
	try
	{
		// Arithmetic exception
		
		int a=10;
		int b=0;
		
		System.out.println(a/b);
		
		// Null pointer exception
		
		Hashtable<String, String> table=new Hashtable<String, String>();
		//table.put(null, "Vishal");
		
		//System.out.println(table.get(null));
		
		// String Index out of bound exception
		
		String str=new String("Vishal");
		System.out.println(str.charAt(8));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}  
	
	
	catch(RuntimeException e)
	{
		System.out.println("Fail:Run time exception or unhandled exception");
	}
	}
 
}
