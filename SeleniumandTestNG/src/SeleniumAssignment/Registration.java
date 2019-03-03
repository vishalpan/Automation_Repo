package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:/Automation_Repo/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");		
		driver.findElement(By.linkText("REGISTER")).click();
		String text= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font")).getText();
		System.out.println(text);
		driver.findElement(By.name("firstName")).sendKeys("Vishal");
		driver.findElement(By.name("lastName")).sendKeys("Pandey");
		driver.findElement(By.name("phone")).sendKeys("9837261341");
		driver.findElement(By.id("userName")).sendKeys("ervishalpandey@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Kumar Samruddhi Society");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Flat no. 401, P4 Block, Vishrantwadi");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("Maharasthra");
		driver.findElement(By.name("postalCode")).sendKeys("411015");
		/*WebElement country=driver.findElement(By.xpath("//select[@name='country']"));// in this driver.find element return web element so we sotred it country
		Select dropdwn=new Select(country);
		dropdwn.selectByVisibleText("INDIA");*/
		Select country =new Select(driver.findElement(By.xpath("//select[@name='country']")));
		country.selectByVisibleText("INDIA");   // calling select() so that we can select the value
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vishu");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vishu@123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("vishu@123");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
		

	}

}
