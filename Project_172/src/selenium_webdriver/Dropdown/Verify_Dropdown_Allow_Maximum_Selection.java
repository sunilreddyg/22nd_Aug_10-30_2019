package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Allow_Maximum_Selection 
{

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
		
		
		//Decision to accept on multiple selection type
		if(flag==true)
		{
			
			Select State_Dropdown=new Select(driver.findElement(By.id("customState")));
			State_Dropdown.deselectAll();  //Command only work on multiple selection type
			State_Dropdown.selectByIndex(3);
			State_Dropdown.selectByIndex(5);
			State_Dropdown.selectByIndex(7);
			
			//method get all Selected option at multiple selection dropdown
			int Count=State_Dropdown.getAllSelectedOptions().size();
			
			//Decision to accept only match expected selection range.
			if(Count>=2  &&  Count==3)
			{
				System.out.println("As expected Selection count reach maximum");
			}
			else
			{
				System.out.println("Testfail:--> Failed to reach selection count maximum");
			}
			
			
		}
		else
		{
			System.out.println("dropdown is a single option selection type");
		}

	}

}
