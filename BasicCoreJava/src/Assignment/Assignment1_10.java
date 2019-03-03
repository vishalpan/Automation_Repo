package Assignment;

public class Assignment1_10
{

	public static void main(String[] args)
	{
		// Write a program which prints each number from array and the times it has been repeated in array
		
		int[] numb ={1,2,3,5,6,3};
		
		int count=0;
		
		boolean flag=true;
		
		for (int i=0; i<numb.length; i++)
		{
			for(int j=0; j<i; j++)
				
				{
				if(numb[j]==numb[i])
				{
					count++;
				}
					for (int k=i-1; k>0; k--)
					{		
						if(numb[k]==numb[i])
						{
						
							flag=false;
						
						}
				}					
					
					}
			if(flag)
				
			System.out.println(numb[i]+": Repeated " +count+" times");
				
		}
			
		}
	}


