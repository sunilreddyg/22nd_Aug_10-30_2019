package ui_verificationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_title {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.seleniumhq.org"); 	//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
		
		//Method capture current window dynamic id
		String Runtime_url=driver.getTitle();
		System.out.println("SeleniumHQ page title is => "+Runtime_url);
		
		String Exp_title="Selenium - Web Browser Automation";
		
		
		boolean flag=Runtime_url.equalsIgnoreCase(Exp_title);
		System.out.println("Selenium title verification status is => "+flag);
		
		Thread.sleep(5000);
		driver.close();
	}

}
