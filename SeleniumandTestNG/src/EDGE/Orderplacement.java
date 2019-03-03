package EDGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orderplacement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Repo\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://edgedev08.jaggedpeak.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vishal");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Cybage@108");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-submit']")).click();
		driver.findElement(By.xpath("//button[@id='merchant-button']")).click();
		driver.findElement(By.xpath("//a[text()='RD Integration']")).click();
		driver.findElement(By.xpath("//button[@id='project-button']")).click();
		driver.findElement(By.xpath("//a[text()='Branch Test N America (Test ) ']")).click();
		
		driver.findElement(By.xpath("//h4[text()='Dashboard']")).click();
		
		driver.findElement(By.xpath("//i[@class='fa fa-phone']")).click();
		driver.findElement(By.xpath("//a[@name='customerservice-menu']")).click();
		driver.findElement(By.xpath("//input[@name='memberID_search']")).sendKeys("4");
		driver.findElement(By.xpath("//div[@class='buttonSMALL']")).click();
		Thread.sleep(2000);
		Select provider=new Select(driver.findElement(By.xpath("//select[@name='providerID']")));
		provider.selectByValue("1");
		Select source=new Select(driver.findElement(By.xpath("//select[@name='orderSourceId']")));
		source.selectByValue("3");
		Select billingcode=new Select(driver.findElement(By.xpath("//select[@name='billingCodeID']")));
		billingcode.selectByValue("2");
		driver.findElement(By.xpath("//a[@name='startOrderButton']")).click();
		

	}

}
