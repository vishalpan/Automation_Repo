package collections;

public class LimitationofArray {

	public static void main(String[] args)
	
	{
		int i=10;
		String str ="vishal";
		char gender= 'M';
		boolean status= true;
		
		// aim is to store all the above datatype value in a single array so have to create a object of type Object
		
		Object[] obj=new Object[4];
		obj[0]=i;  // here we have call child object by referring parent object
		obj[1]=str;
		obj[2]=gender;
		obj[3]=status;
		
	}

}
