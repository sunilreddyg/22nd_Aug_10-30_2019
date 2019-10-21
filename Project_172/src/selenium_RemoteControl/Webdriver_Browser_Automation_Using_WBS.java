package selenium_RemoteControl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class Webdriver_Browser_Automation_Using_WBS {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> Inorder to use selenium remote control using webdriver
		 * 			browser we need to add below jar file current proejct.
		 * 
		 * 		URL:-->
		 * 				https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-leg-rc/3.141.59
		 * 				download jar file and configure to current project..
		 */
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
						
		WebDriver driver=new ChromeDriver();
		String url="https://www.facebook.com";
		driver.get(url);
		driver.manage().window().maximize();
	
		WebDriverBackedSelenium rc=new WebDriverBackedSelenium(driver, url);
		
		//type text into editbox using remote control
		rc.type("id=u_0_m", "Krishna");
		rc.type("name=lastname", "Raj");
		
		//Select dropdown using remote control
		rc.select("day", "18");
		rc.select("month", "Dec");
		
		//Select radio button
		rc.click("xpath=//input[@value='1']");
		
		
		
		

		
	}

}
