package ui_validation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Element_Enable_OR_disableState 
{

	public static void main(String[] args) throws Exception 
	{
	
	  
		/*
		 * Testcase:-->Verify locality editbox before selection of city & State selection
		 * expected:--> Editbox should be disabled.
		 * 	
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator"); 		//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
				


		
		WebElement Locality_Editbox=driver.findElement(By.id("customLocality"));
		if(!Locality_Editbox.isEnabled())//!--NOT
		{
			System.out.println("Testpass:--> As expected Locality editbox was disable before selection of state and city");
		}
		else
		{
			System.err.println("TestFail;--> Locality editox is enabled beore selection of state and city");
		}
		
	
		/*
		 * Testcase:-->Verify locality editbox After city & State  selection
		 * expected:--> Editbox should enable and display
		 * 		label as "Please enter locality"
		 */
		
		//Select State Dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		new Select(State_Dropdown).selectByVisibleText("Telangana");
		
		//Timeout to load city options
		Thread.sleep(5000);
		
		//Select City Dropdown
		WebElement City_dropdown=driver.findElement(By.id("customCity"));
		new Select(City_dropdown).selectByVisibleText("Hyderabad");
		
		//Timeout before validate
		Thread.sleep(5000);
		
		//write condition to verify Locality editbox Enabled functionality
		if(Locality_Editbox.isEnabled())
		{
			System.out.println("testpass:--> As expected locality editbox"
					+ " is enabled after selection of state and city");
		}
		else
		{
			System.err.println("tefail:--. Expected locality editbox to be enabled");
		}
		
		
		

	}

}
