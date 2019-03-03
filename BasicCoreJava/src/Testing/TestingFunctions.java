package Testing;

import functions.Day5AccessModifiers;    // here we have imported 

public class TestingFunctions extends Day5AccessModifiers // here we extend the parent class if we remove extend keywords then we cannot access protected 

{

	public static void main(String[] args)
	{
		Day5AccessModifiers obj=new Day5AccessModifiers();
		obj.publicmethod();
		
		TestingFunctions fun=new TestingFunctions();
		fun.protectedmethod();
	

	}

}
