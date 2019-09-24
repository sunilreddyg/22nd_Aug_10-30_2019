package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Element_Presented_At_pageSource 
{

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.facebook.com"); 	//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
		
		
		//Get Current page Source
		String PageSource=driver.getPageSource();
		
		if(PageSource.contains("email"))
		{
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys("Darshan");
		}
		else
		{
			System.out.println("Selected Email Element not presented at source");
		}
		
		
		

	}

}
