package oops.abstraction;

public class User2 {

	public static void main(String[] args) 
	{
		RBI ref= null;
		
		String name= banksname();  // caling of functions
		
		if(name.equals("SBI"))
		{
			ref=new SBI();
		}
		else if(name.equals("CITI"))
		{
			ref=new CITI();
		}
		else if(name.equals("BOM"))
		{
			ref=new BOM();
		}
					
		// Bank service script 
		
	ref.creditcard();
	ref.currentacc();
	ref.debitcard();
	ref.savingacc();
	
	}
	
	public static String banksname()   // we have cretaed this function to avoid calling of same method multiple times, check class user
	{
		return "BOM";
	}

}
