package EDGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class CSPOrderPlacement {

	public static void main(String[] args)
	{
		// Creating object of chrome driver
	System.setProperty("webdriver.chrome.driver", "E:/Automation_Repo/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://edgedev08.jaggedpeak.com/");
	
	By locator1=new By.ById("username");
	WebElement username=driver.findElement(locator1); // this is from by class so we have to create a object
	username.sendKeys("vishal");
	
	By locator2 = new By.ById("password");
	WebElement Password=driver.findElement(locator2);
	Password.sendKeys("Cybage@108");
	
	By locator3 =new By.ByXPath("/html/body/div[1]/div[2]/div/div/div/form/button");
	WebElement submit= driver.findElement(locator3);
	submit.click();
	}

}
