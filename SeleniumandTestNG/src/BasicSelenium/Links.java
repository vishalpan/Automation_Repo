package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Repo\\chromedriver_win32\\chromedriver.exe"); // path of chrome driver
		ChromeDriver dr =new ChromeDriver(); // created object of chrome driver
		dr.manage().window().maximize(); // to maximize the browser window
		
		dr.get("http://newtours.demoaut.com/");
		
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // this implicit delay is used to handle exception 'ElementNotVisibleException'
		
		dr.findElement(By.partialLinkText("Regrtertert")).click(); // here we are using By class 
		
		//dr.findElementByLinkText("REGISTER").click();   // directly using linktext class

}}
