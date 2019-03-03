package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeshandling {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:/Automation_Repo/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[contains(text(),'Signup with mobile number and password')]")).click(); // this window is present in the i frame so we have use switch to

	}

}
