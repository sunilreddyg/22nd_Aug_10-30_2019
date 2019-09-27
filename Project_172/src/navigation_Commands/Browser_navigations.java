package navigation_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_navigations 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.manage().window().maximize();    	//maximize browser window
				
		//Method enter url into browser window
		driver.navigate().to("http://facebook.com");
		
		//navigat to page 
		driver.navigate().to("https://messenger.com/");
		Thread.sleep(3000);
		
		//navigate to back to previous page
		driver.navigate().back();
		Thread.sleep(3000);
		
		//navigate to next window
		driver.navigate().forward();
		
		//Refresh page
		driver.navigate().refresh();
		
		//Close focussed browser widnow
		driver.close();  //[Close only single window]
		
		
		


	}

}
