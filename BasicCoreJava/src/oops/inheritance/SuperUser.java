package oops.inheritance;

public class SuperUser {

	public static void main(String[] args) 
	{
		// created this class with main methods and here we have to creat a object of child class and with it we can call other extended class
		// call it from child class object

		SmartWatch time=new SmartWatch();
				{
			time.alarm();
			time.digitaldisplay();
			time.displaytime();
			time.heartrate();
			time.light();
			time.tracker();
				}
	}

}
