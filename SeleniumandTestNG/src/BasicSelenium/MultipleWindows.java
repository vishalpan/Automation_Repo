package BasicSelenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "E:/Automation_Repo/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		// driver.close();
		
		// driver.quit();
		
		String Parent= driver.getWindowHandle();
		
		System.out.println(Parent);
		
		Set<String> wind =driver.getWindowHandles(); // his retrun type is set , here dev. uses SET bcz all open windows have unique id. getWindowHandles give list of unique web element
 for (String S: wind)
 {
	 // System.out.println(S);
	 
	 driver.switchTo().window(S);   // switch to is used to handle multiple windows, alert and ifrmaes
	 
	 if (!S.equals(Parent))
	 {
		 driver.close();
	 }
 }
	}

}
