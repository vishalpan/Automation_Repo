package functions;

public class Day5TestFunctions {

	public static void main(String[] args) 
	{
	
		Day5AccessModifiers obj = new Day5AccessModifiers(); // here we have created a objet of previous class where modifier is defined and call object in same package but in different class
		obj.publicmethod();
		obj.noaccessmodmethod();
		obj.protectedmethod();

	}

}
