package oops.abstraction;

public interface Supremecourt
{

	// public void interstrates(); // this is alos implemented so we have to use default but we can override default method
	
	default void interstrates()
	{
		System.out.println("Supreme court rule in interest rate");
	}
	
}

