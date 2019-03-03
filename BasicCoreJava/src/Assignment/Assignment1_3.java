package Assignment;

public class Assignment1_3 {

	public static void main(String[] args)
	{
		/*Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5,
		 it prints 'divisible by 5 followed by that number'*/
		
		for (int i=1; i<=100; i++)
		{
			System.out.println("Number: "+i);
			if (i%5==0)
			{
				System.out.println("Divisible by 5 and number is: "+i);
			}
		}

	}

}
