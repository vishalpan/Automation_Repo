package Assignment;

public class Assignment1_8 {

	public static void main(String[] args)
	{
		//  Find the greatest number in a array

		int[] numb= {15,17,40,24,25};
		
		if(numb[0]>numb[1])
			{
				System.out.println(numb[0]);
			}else if (numb[1]>numb[2])
			{
				System.out.println(numb[1]);
			}else if (numb[2]>numb[3])
			{
				System.out.println(numb[2]);
			}
			else if (numb[3]>numb[4])
			{
				System.out.println(numb[3]);
			}else
			{
				System.out.println(numb[4]);
			}
		}
}


