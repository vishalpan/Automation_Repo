package stringClass;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Stringfunctions {

	public static void main(String[] args) 
	{
		// string functions lenght, charAT etc.
		
		String name ="vishal";
		
		//1. length 
		
		int l=name.length();
		System.out.println(l);
		
		//2. charAT
		
		char c=name.charAt(0);
		System.out.println(c);
		
		//3 Equals and equalsIgnoreCase [igone case sentivity]
		
		String name2="Vishal";
		
		System.out.println(name.equals(name2));
		System.out.println(name.equalsIgnoreCase(name2));
		
		// 4. trim to remove white space from string
		
		String name3="      vishal      ";
		System.out.println(name3.trim());
		
       //5. sub string
		String name4= "Vishal Pandey";
		
		System.out.println(name4.substring(8)); // begin index, here will print after 8 characters
		System.out.println(name4.substring(0, 6)); // begin index and end index since we have pass 0 to 6 so it will give value b/w them
	
		// 6. Replace
		
		String name5= "Vishal";
		System.out.println(name5.replace('V', 'S')); // characs replace , single quote replace chars
	
	//7. Replacement
		
		String name6="Vi$hal P$ndey $hilpa $harma";
		System.out.println(name6.replace("$","  " )); // sequence replacement, double quotes replace string
	
		String name7= "VishalTechBodhi";
		System.out.println(name7.replace("Vishal", "shilpa")); //sequence replacement, double quotes replace string
		
		// Split 
		
		String name8="anandvishaltechvishalbodhivishal";
		String [] str= name8.split("vishal");  // here split function  give return string array (hover over it to see) so we have stored the return type in srting array
		
		for (String s:str)
		{
			System.out.println(s);
		}
		
		
	}
	
	
	

}
