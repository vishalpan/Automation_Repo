package Practise;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args)
	{		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation_Repo\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		// to find parent window use method getwindowhandle
		String parent=driver.getWindowHandle();
		Set<String>child=driver.getWindowHandles();
		 for(String c:child)
		 {
			 driver.switchTo().window(c);
			 if (!c.equals(parent))
			 {
				 driver.close();
			 }
		 	 
		 }


	}
	}

