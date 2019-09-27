package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.gmail.com"); 		//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
				
		
		
		//Identify Email Editbox
		WebElement Email_eb=driver.findElement(By.id("identifierId"));
	
		//write condition to accept on elemnet visible & enabled
		if(Email_eb.isDisplayed() && Email_eb.isEnabled())
		{
			Email_eb.clear();
			Email_eb.sendKeys("qadarshan@gmail.com");
		}
		else
		{
			System.out.println("Element Not visible at webpage");
		}
		
	

		/*
		 * ElementNotvisibleException   ==> When user perform action on hidden element  
		 * InvalidElementstateException ==> When user perform action on disabled element
		 */
		
		
		
		
		
		
		
	
			
			
		
		
		
		
		
		
		

	}

}
