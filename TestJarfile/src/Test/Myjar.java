package Test;

import functions.AreaofSquare;
import functions.AreaofTriangle;

public class Myjar {

	public static void main(String[] args) {
		// here we have to use jar created by me, so for this create a object of
		// you jar file

		AreaofSquare area = new AreaofSquare();
		int x = area.area(3);
		System.out.println("Area of Square=" + x);

		AreaofTriangle y = new AreaofTriangle();
		float f = y.Triangle(5, 5);
		System.out.println("Area of Triangle= " + f);
	}

}
