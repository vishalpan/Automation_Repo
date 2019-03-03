package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetInterface2 
{

	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<>();
		set.add("Vishal");
		set.add("pandey");
		set.add("rashmi");
		set.add("kute");
		
		for (String s:set)
		{
			System.out.println(s);
		}
	
	System.out.println("----------------------");
	
	Set<String> set1=new TreeSet<>();  // here created a object of child and referencing a parent class
	
	set1.add("vishal");
	set1.add("pandey");
	set1.add("rashmi");
	set1.add("kute");
	
	for (String s1:set1)
	{
		System.out.println(s1);
	}
	
	}
	
	
	

	
}
