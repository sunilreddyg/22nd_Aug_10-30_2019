package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Page_URL {

	public static void main(String[] args)
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.seleniumhq.org"); 	//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
		
		
		//Get Current window title
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("Currnet window url is => "+Runtime_url);

		
		//Downloads link
		WebElement Downloads_Link=driver.findElement(By.linkText("Download"));
		Downloads_Link.click();
		
		String Exp_url="/download/";
		
		if(driver.getCurrentUrl().contains(Exp_url))
			System.out.println("Expected url presented for downloads page");
		else
			System.out.println("Wrong url presented for downloads page");
		
	}

}
