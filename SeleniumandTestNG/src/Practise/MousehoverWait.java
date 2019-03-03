package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MousehoverWait {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Repo\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");	
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();  // close login window
		WebElement men =driver.findElement(By.xpath("//span[text()='Men']")); // reached to element where we have to mouse hover		
		Actions mhover=new Actions(driver); // Created a actions class
		
		mhover.moveToElement(men).build().perform();
		
		WebElement baby=driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		mhover.moveToElement(baby).build().perform();
		
		WebDriverWait wait= new WebDriverWait(driver, 2);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Wipes']"))));
		
		driver.findElement(By.xpath("//a[@title='Wipes']")).click();
		
		WebElement left=driver.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"));
		
	mhover.dragAndDropBy(left, 50, 0).build().perform();
	
Thread.sleep(3000);
	
	WebElement right=driver.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]"));
	
	mhover.dragAndDropBy(right, -50, 0).build().perform();

	}

}
