package stringClass;

public class JavaString
{

	public static void main(String[] args)
	{
		// Creating java string by string literals
		
		String s= "Java String"; 
		
		// Converting char array to string
		
		char[] ch = {'j','a', 'v','a'};
		String s1=new String (ch);
		
		// Creating java string by using new keyword
		String s2=new String("Welcome");
		
		// printing all the string object
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		

	}

}
