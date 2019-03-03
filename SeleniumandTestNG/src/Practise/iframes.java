package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Repo\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")).click();
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Signup with mobile number and password')]")).click();
		

	}

}
