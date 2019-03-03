package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PractiseMap {

	public static void main(String[] args) {
		// In this we will see, HashMap, LinkedHashMap, TeeMap

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		{
			map1.put(101, "vishal");
			map1.put(102, "Shilpa");
			map1.put(null, "sonu");
			map1.put(null, "swati");
			map1.put(103, null);
			map1.put(104, null);
			map1.put(105, "vishu");
			map1.put(105, "monu");
 for(Map.Entry m1: map1.entrySet())
	 		 {
	 System.out.println(m1.getKey() +" " + m1.getValue());
 }
		
		}
		System.out.println("-------Hashmap End----------------");

		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		{
			map2.put(101, "vishal");
			map2.put(102, "Shilpa");
			map2.put(null, "sonu");
			map2.put(null, "swati");
			map2.put(103, null);
			map2.put(104, null);
			map2.put(105, "vishu");
			map2.put(105, "monu");

			for(Map.Entry m2:map2.entrySet())
			
			{
				System.out.println(m2.getKey() + " " + m2.getValue());
			}
		}
		System.out.println("-------Linked HashMap End----------------");

		TreeMap<Integer, String> map3= new TreeMap<Integer, String>();
		map3.put(104, "Vishal");
		map3.put(108,"shilpa");
		map3.put(101, "value1");
		//map3.put(null, "value2");
		map3.put(99, null);
		map3.put(99, "value");
		map3.put(10, null);
		
		for(Map.Entry m3:map3.entrySet())
		{
			System.out.println(m3.getKey()+ " " +m3.getValue());
		}
		System.out.println("-------TreeMap End----------------");
	
	Hashtable<Integer, String> map4=new Hashtable<Integer, String>();
	map4.put(4, "four");
	map4.put(2, "two");
	map4.put(1, "one");
	//map4.put(null, "null");
	//map4.put(5,null);
	map4.put(1,"latest one");
	
	for(Map.Entry m4:map4.entrySet())
	{
		System.out.println(m4.getKey()+ "  "+ m4.getValue());
	}
	
	
	}
}
