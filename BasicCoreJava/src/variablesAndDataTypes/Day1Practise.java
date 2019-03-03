package variablesAndDataTypes;

public class Day1Practise {

	static String Country = "India"; // since static is used in string so this is variable can be call inside static method/function
	
	String city="Pune"; // this is instance variable, so  we have to create a object 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Program start data type and varialbe");
		
		byte b=5;
		short s=10;
		int i=15;
		long l=20;
		double d= 3.14;
		float f= 23.33f;
		char c= 'V';
		boolean bo=true;
System.out.println(b);
System.out.println("print value of short="+s);
System.out.println("print value of int="+i);
System.out.println("print value of long="+l);
System.out.println("pritn value of double:"+d);
System.out.println("print value of float="+f);
System.out.println("print value of char:"+c);
System.out.println("print value of boolean:"+bo);

System.out.println("print country="+Country);
			
Day1Practise obj=new Day1Practise();
		System.out.println(obj.city);
	}

}
