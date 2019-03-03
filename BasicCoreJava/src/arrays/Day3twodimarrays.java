package arrays;

public class Day3twodimarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] arryval = new String[2][4];
		// Row 1
		arryval[0][0] = "vishal";
		arryval[0][1] = "Cybage";
		arryval[0][2] = "pune";
		arryval[0][3] = "jbp";

		// Row 2
		arryval[1][0] = "rashmi";
		arryval[1][1] = "Dzyne";
		arryval[1][2] = "CTS";
		arryval[1][3] = "bhopal";

		for (int r = 0; r < arryval.length; r++) 
		{
			for (int c = 0; c < arryval[r].length; c++) // arryval[r] give colmun value 
			{
				System.out.println(arryval[r][c]);
			}

		}
		

	}
}
