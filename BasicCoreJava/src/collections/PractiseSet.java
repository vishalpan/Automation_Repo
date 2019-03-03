package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PractiseSet {

	public static void main(String[] args)
	{
		// Set: HashSet, LinkedHashset, TreeSet
		
		HashSet<String> set1=new HashSet<>(); 
		{
			set1.add("one");
			set1.add("two");
			set1.add("three");
			set1.add("four");
			set1.add(null);  // contains display null element, contains display unique element, doesn't have any order
			
			for(String s1:set1)
			{
				System.out.println(s1);
			}
			
			System.out.println("----------");
			
			}
		
		LinkedHashSet<String> set2=new LinkedHashSet<>();
		{
			set2.add("five");
			set2.add("four");
			set2.add("two");
			set2.add("one");
			set2.add(null);   // LinkedHashSet allow null element, contains(display) only unique element, miantian insertion order
			
			for(String s2:set2)
			{
				System.out.println(s2);
			}
			
			System.out.println("----------");
			
			}
		
		Set<String> tree=new TreeSet<>(); // creating a object of child class by refering parent class
		tree.add("vishal");
		tree.add("shilpa");
		tree.add("abhishek");
		tree.add("sonali");
		tree.add("varun");
		tree.add("varun");
		//tree.add(null); // Treeset doesn't allow null element , maintain ascending order, contains unique element.
		
		for(String s3: tree)
		{
			System.out.println(s3);
		}
		

	}

}
