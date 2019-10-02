package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_BetWeen_Frames 
{

	public static void main(String[] args)
	{
		
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //Launch chrome browse
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");     //load webpage to browser window
		driver.manage().window().maximize();	//maximize browser window


		
		
		
		
		
	}

}
