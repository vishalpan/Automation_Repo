package arrays;

public class Day3array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arrayRefval = new String[6];
		arrayRefval[0] = "vishal";
		arrayRefval[1] = "anand";
		arrayRefval[2] = "rashmi";
		arrayRefval[3] = "rakesh";
		arrayRefval[4] = "rahul";
		arrayRefval[5] = "vivek";

		System.out.println(arrayRefval[1]); // to print or extract array value from array.  arrayRefval : can be any name
		
		System.out.println(arrayRefval.length); // to check array length

		for (int i = 0; i < arrayRefval.length; i++) // we have use for loop to
														// print all the array
														// value
		{
			System.out.println(arrayRefval[i]);
		}

	}
}