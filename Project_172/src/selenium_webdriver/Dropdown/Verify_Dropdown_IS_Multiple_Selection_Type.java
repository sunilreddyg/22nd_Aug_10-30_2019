package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_IS_Multiple_Selection_Type 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator");     //Load webpage
		driver.manage().window().maximize();    //maximize browser window
				
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown Multiple Selection Status is => "+flag);
		
		
		/*
		 * Using javascript executor convert single dropdown option into
		 * multiple selection dropdown.
		 */
		
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		
		//Verify Dropdown Multiple Selection type
		boolean flag1=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown Multiple Selection Status is => "+flag1);
		
		
		

	}

}
