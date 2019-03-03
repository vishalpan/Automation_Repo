package oops.abstraction;

public class User {

	public static void main(String[] args) 
	{
		RBI ref;
		
	ref=new BOM();
	ref.creditcard();
	ref.currentacc();
	ref.debitcard();
	ref.savingacc();
	
	ref=new CITI();
	ref.creditcard();
	ref.currentacc();
	ref.debitcard();
	ref.savingacc();
	
	ref =new SBI();
	ref.creditcard();
	ref.currentacc();
	ref.debitcard();
	ref.savingacc();
	}
	
}
