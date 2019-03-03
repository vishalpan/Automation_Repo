package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Repo\\chromedriver_win32\\chromedriver.exe"); // path of chrome driver
		ChromeDriver dr =new ChromeDriver(); // created object of chrome driver
		dr.manage().window().maximize(); // to maximize the browser window
		
		dr.get("http://newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		
		dr.findElement(By.name("login")).click();
		
		String str=dr.findElementByXPath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font").getText();// this is absolute x path and getText method is used to read the text
		System.out.println(str);
		
		dr.findElementByXPath("//input[@value='oneway']").click();
		
		Boolean b= dr.findElementByXPath("//input[@value='oneway']").isSelected();
		
		System.out.println(b);
		
		WebElement drpdwn= dr.findElementByXPath("//Select[@name='passCount']");
		
		Select selc =new Select(drpdwn); // Select class is used to select a dropdown which uses select tag on DOM
		
		selc.selectByVisibleText("3");   // here we are calling selc method so that we can select the value
		
		
		
	}

}
