package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Timeouts {

	public static void main(String[] args) 
	{
		/*
		 * Implicit wait:-->
		 * 		categorized into 3 types
		 * 			1. Implicitlywait
		 * 			2. Pageloadtimeout
		 * 			3. SetScripttimeout
		 */
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
		.pageLoadTimeout(30, TimeUnit.SECONDS)
		.setScriptTimeout(100, TimeUnit.SECONDS);
		
		
		

	}

}
