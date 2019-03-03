package Practise;
import java.util.*;

public class PracInterface
{

	public static void main(String[] args)
	{
				
		ArrayList<String> list=new ArrayList<String>(); // Creating array list
		
		list.add("Vishal");// adding value to object
		list.add("Pandey");
		list.add("Shilpa");
		list.add("Sharma");
		
       System.out.println(list); // Traverse the element by iterator or for each loop
       
       for (String s:list)
       {
    	   System.out.println(s);
       }
       
       System.out.println("-----------------------------"); // added the separator
       
       LinkedList <String> linklist=new LinkedList<String> (); // creating linkedList
       linklist.add("Sonali Pandey"); // adding object to linklist
       linklist.add("Varun Pandey");
       
       System.out.println(linklist); // traver element by iterator or for each loop below
       
       for (String VS:linklist)
       {
    	   System.out.println(VS);
       }
       
 System.out.println("-----------------------------"); // added the separator
       
       Vector <String> vlist=new Vector<String> (); // creating linkedList
       vlist.add("Sonali Pandey"); // adding object to linklist
       vlist.add("Varun Pandey");
       
       System.out.println(vlist); // traver element by iterator or for each loop below
       
       for (String ss:vlist)
       {
    	   System.out.println(ss);
       }
	}

}
