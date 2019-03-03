package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;


public class MapInterface {

	public static void main(String[] args)
	{
		// HashMap, stored value in format of Key-Value
		
		HashMap<String, Integer> map=new HashMap<String, Integer>(); // creating hashmap
		
		map.put("Vishal",12276);   // adding object
		map.put("Rashmi",12277);
		map.put("Shubhangi",12278);
		map.put(null,12279);    // allowed null key so give value
		
	//	System.out.println(map.get("Rashmi")); 
	//	System.out.println(map.get(null)); 
		
		Set<String> set =map.keySet(); // fetching all the value of key
		
		for(String s:set)
		{
			System.out.println(map.get(s));  // iterating key..
		}
		
		System.out.println("--------------------");
		
		Hashtable<String, String> map2 = new Hashtable<String, String>();
		
		map2.put("Firstname", "Vishal");
		map2.put("Lastname","Pandey");
		//map2.put(null,"test");      // will not allowed null key so give null pointer exception error.
		
		System.out.println(map2.get(null));
		

	}

}
