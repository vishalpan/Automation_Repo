package Practise;

import functions.Practiseaccessmodifies; // import functionname.classname

public class Callaccessmodifers extends Practiseaccessmodifies
{

	public static void main(String[] args)
	{
		// here we try to call access modifer, since this is different package so we have to import

		Practiseaccessmodifies obj=new Practiseaccessmodifies();
		{
			obj.publicmethod();
		}
	// here we have to call protected method so creating a object of child and refering parent also we have to extend it
		
		Callaccessmodifers obj1= new Callaccessmodifers();
		{
			obj1.protectedmethod();
		}
	}
	
	

}
