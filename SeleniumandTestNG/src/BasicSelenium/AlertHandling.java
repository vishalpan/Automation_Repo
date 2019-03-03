package BasicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandling {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/Automation_Repo/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://E:/Automation_Repo/Practice.html");
	
		Select selc = new Select(driver.findElement(By.id("anand"))); // combine select class with web element 
		selc.selectByIndex(2);     // selecting combo box
		selc.selectByIndex(3);
		selc.selectByIndex(4);
		selc.deselectAll();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;  // type casting: since we cannot create a object of interface so used typecasting
		WebElement ele= driver.findElement(By.tagName("button"));
		js.executeScript("arguments[0].scrollIntoView();" , ele); // this help us to scroll upto ele which is button and we have to byheart this scrllintoview
		ele.click(); // clciking on button
		
		Alert alt=driver.switchTo().alert();
		String str= alt.getText();    // find the the text displayed on the alert message
		System.out.println(str);
		alt.dismiss();
	}

}
