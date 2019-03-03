package oops.abstraction;

public interface RBI extends Modi, Supremecourt // here we did multiple inheritance which is possible in interface (Modi, Supremecourt) not  in class 
{
	public void savingacc(); // here we haven't use abstract keyword bcz in interface all the method are abstract by default.
	
	public void creditcard();
	
	public void currentacc();
	
	public void debitcard();
		
}
