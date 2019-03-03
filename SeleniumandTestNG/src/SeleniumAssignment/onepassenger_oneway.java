package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class onepassenger_oneway {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Repo\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		WebElement drpdwn= driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select slct= new Select(drpdwn); // select class is used to select a drop down 
		slct.selectByIndex(1);
		WebElement drpdwn2= driver.findElement(By.xpath("//select[@name='fromMonth']"));
		Select date=new Select(drpdwn2);
		date.selectByVisibleText("December");
		WebElement drpdwn3=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select arrv =new Select(drpdwn3);
		arrv.selectByValue("New York");
		WebElement drpdwn4=driver.findElement(By.xpath("//select[@name='toMonth']"));
		Select month=new Select(drpdwn4);
		month.selectByVisibleText("September");
		driver.findElement(By.xpath("(//input[@name='servClass'])[3]")).click();
		Select pref= new Select (driver.findElement(By.xpath("//select[@name='airline']")));
		pref.selectByVisibleText("Blue Skies Airlines");
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Vishal");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Pandey");
		Select meal= new  Select (driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
		meal.selectByValue("VGML");
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("4111111111111111111");
		driver.findElement(By.name("buyFlights")).click();

	}

}
