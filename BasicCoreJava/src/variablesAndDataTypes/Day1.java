package variablesAndDataTypes;

public class Day1 {
	
	String city = "pune" ; // instance variable we have to create a object
	String city2 = "Jbp" ;

		static String country = "India"; // to use class variable we have to use static keyword
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("welcome to TechBodhi");
		
		//Data Type
		
		int iage= 30;
		char cgender= 'M';
		boolean bstatus= true;
		long lpin= 411014;
		double dmarks= 151.45;
		
		// other datatypes not used in selenium
		
		byte small =10;
		short val= 100;
		float fl=78.36f;
		
		// end
		
		String name= "Vishal"; // here string is a class	
		System.out.println(iage);
		System.out.println(cgender);
		System.out.println(bstatus);
		System.out.println(lpin);
		System.out.println(dmarks);
		System.out.println(small);
		System.out.println(val);
		System.out.println(fl);
		System.out.println(name);	
		
		System.out.println(country); // this is static variable so can call or print, as method is static
		
		//System.out.println(city); // this is a instance variable , so we have to create a instance created below.
		
		Day1 obj=new Day1();
		
		System.out.println(obj.city);
		System.out.println(obj.city2);

	}

}
