package Constructor;

public class Users {

	public static void main(String[] args) 
	{

		// Car1
		
Car car1 = new Car("Hundia",90,"verna");
/*car1.manufactures="Hundai";
car1.name="verna";
car1.speed=90;
car1.wheels=4;*/
car1.acclerate();
car1.drive();

//car2

Car car2= new Car("honda",120,"city");
/*car2.manufactures="Honda";
car2.name="city";
car2.speed=140;
car2.wheels=4;*/
car2.drive();
car2.acclerate();

//car3

Car car3= new Car("TatA",140,"Vento");
/*car3.manufactures="Honda";
car3.name="city";
car3.speed=140;
car3.wheels=4;*/
car3.drive();
car3.acclerate();

	}

}
