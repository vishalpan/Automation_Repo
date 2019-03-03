package oops.encapsulation;

public class Bank 
{
private int balance;
								// here we have created getter and setters by right clicking bank-> source
private String customername;    

public int getBalance() {
	return balance;
}

public void setBalance(int amount) // here we have analyise the data and then put the condition
{
	if (amount>1000)
	{
		this.balance=amount+150;
	}else if (amount<1000)
	{
		balance= amount-150;
	}
	this.balance = balance;
}

public String getCustomername() {
	return customername;
}

public void setCustomername(String customername) {
	this.customername = customername;
}

}
