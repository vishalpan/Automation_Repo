package testNgAnnotation;

import org.testng.annotations.Test;

public class BasicAnnotation 
{
    @Test
	public void test1 ()
	{
		System.out.println("Login");
	}
	
    @Test
	public void test2 ()
	{
		System.out.println("Logout");
	}
	
	
}
