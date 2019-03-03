package conditionalStatements;

public class Day3logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b && b > c || b > a) {
			System.out.println("a is greater");
		} else if (c > a && a > b || c > b) {
			System.out.println("c is greater");
		}

	}

}
