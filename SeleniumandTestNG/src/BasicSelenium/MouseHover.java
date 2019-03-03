package BasicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	private static final String ExpectedCondtions = null;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Repo\\chromedriver_win32\\chromedriver.exe"); // path of chrome driver
		ChromeDriver dr =new ChromeDriver(); // created object of chrome driver
		dr.manage().window().maximize(); // to maximize the browser window
		
		dr.get("https://www.flipkart.com/");

		
		//dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
// dr.findElement(By.className("_2AkmmA _29YdH8")); // we cannot use this directly by class name as it has multiple _
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click(); //  this is to close the popup
		
		WebElement ele =dr.findElement(By.xpath("//span[text()='Men']")); // here we have used text() function in xpath so we have not use @
		
		Actions act=new Actions(dr); // Actions class is used to mouse hover and drag and drop on any page
		
		act.moveToElement(ele).build().perform();
		
		WebDriverWait wait=new WebDriverWait(dr, 2); // Explicit wait , wait till condition meets
		
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[@title='Shirts']"))));
		
		dr.findElement(By.xpath("//a[@title='Shirts']")).click();
		
	//wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"))));
	Thread.sleep(3000);
	
	act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 50, 0).build().perform(); // here in this occurrence of xpath is multiple so added parenthesis in xpath then in square bracket added occurrences
	
	act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]")), -50, 0).build().perform();
	
}}
