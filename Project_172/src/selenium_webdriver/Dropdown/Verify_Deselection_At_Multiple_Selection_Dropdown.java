package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Deselection_At_Multiple_Selection_Dropdown {

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
			if(Count==4)
			{
					System.out.println("As expected Selection count reach maximum");
					
					//deselect any single option from multiple selection
					State_Dropdown.deselectByIndex(5);
					
					//Get All Selected option count at multiple selection dropdown
					int Dcount=State_Dropdown.getAllSelectedOptions().size();
					
					//decision to verify Deselection count
					if(Dcount==2)
					{
						System.out.println("Testpass:--> Successfully Deselected option from Multiple seelction");
					}
					else
					{
						System.out.println("Testfail:--> Failed to deselect option from multiple selection");
					}
				
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
