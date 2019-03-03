package Assignment;

public class Assignment1_7 {

	public static void main(String[] args) 
	{
		// Print alternate elements of String array
		
		String[] str={"v","i","s","h","a","l"};
		
		for(int i=0; i<=str.length; i++)
		{       
			if(i<str.length)
			{
				i=i+1;
				
				System.out.println("Alternate elemet is " +str[i]);
			}
			
		}
			}

}
