package conditionalStatements;

public class Day3nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10; int b =9; int c=7;
		if (a>b) {
			if (b>c) {
				
				System.out.println("a is greater");
			}else if(a>c){
				System.out.println("a is greater");
			}
		}
	}

}
