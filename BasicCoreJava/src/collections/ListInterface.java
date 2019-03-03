package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.*;    // else use * for above all

public class ListInterface {

	public static void main(String[] args)
	{
		
		// Array list
		
	/*	ArrayList <String> list= new ArrayList<>();
		list.add("Vishal");
		list.add("Pandey");

		for(String s : list)
		{
			System.out.println(s);
		} */
		
		// linked list
/*		
		LinkedList <String> list= new LinkedList<>();
		list.add("Vishal");
		list.add("Pandey");

		for(String s : list)
		{
			System.out.println(s);
		} */
		
		// Vector list
		
		Vector<String> list= new Vector<>();
		list.add("Vishal");
		list.add("Pandey");

		for(String s : list)
		{
			System.out.println(s);
		}
	}

}
