package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Multiple_options_from_Single_Dropdown {

	public static void main(String[] args) throws Exception 
	{
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator");     //Load webpage
		driver.manage().window().maximize();    //maximize browser window
				
		/*
		 * Using javascript executor convert single dropdown option into
		 * multiple selection dropdown.
		 */
		
		((JavascriptExecutor)driver).executeScript
		("document.getElementById('customState').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		
		//Verify Dropdown Multiple Selection type
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		System.out.println("Dropdown Multiple Selection Status is => "+flag);
		
		
		//Writing decision to accept on multiple selection type
		if(flag==true)
		{
			System.out.println("Dropdown Is Multiple Selection type");
			
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.deselectAll();  //Command only work on multiple selection type
			State_Dropdown.selectByIndex(3);
			State_Dropdown.selectByIndex(5);
			State_Dropdown.selectByIndex(7);
			State_Dropdown.selectByIndex(9);
		}
		else
		{
			new Select(driver.findElement(By.id("customState"))).deselectAll();
			System.out.println("Dropdown is Single option selection type");
		}
		
		
		
		
		
		
		

	}

}
