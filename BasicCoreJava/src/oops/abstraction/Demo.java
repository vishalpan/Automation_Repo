package oops.abstraction;

public class Demo {

	public static void main(String[] args) 
	{
	
		Sprint3 obj= new Sprint3();

		obj.compose();
		obj.send();
		obj.attachment();
		obj.forward();
		obj.reply();
		obj.newMethod();
		
		Outlook obj2=new Sprint3();  // here object is from child class sprint3  and reference is from parent or super class which is outlook
		obj2.compose();
		obj2.send();
		obj2.attachment();
		obj2.forward();
		obj2.reply();
		// obj2.n    // here newMethod calling is done bcz its not present/ not define in parent class
		
	}

}
