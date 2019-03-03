package loops;

public class Day4enhanceforeachloop {

	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40,50,60,70};
		
	/*	for (int i=0; i<arr.length; i++)		   // regular for loop
		System.out.println("print value of"+arr[i]);   // here we have not use {} 
		
		*/
		
		/*	for(int i:arr) // advance for loop 
		{
			System.out.println("print the value of i="+i);
		}
		*/
		
String[] str= {"vishal, Rashmi, Anand, Kamlesh, Shubangi"};   // advance for loop using string
		
		for(String name:str)
		{System.out.println("print the name="+name);

	}
	}
}
