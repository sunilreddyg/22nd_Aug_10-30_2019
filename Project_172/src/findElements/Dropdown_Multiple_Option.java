package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Multiple_Option 
{

	public static void main(String[] args) throws Exception 
	{
	
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.manage().window().maximize();
		
	
		WebElement Month_Dropdown=driver.findElement(By.id("month"));
		//get List of option nodes under Month Dropdown
		List<WebElement> Month_options=Month_Dropdown.findElements(By.tagName("option"));
		//Get single option from list of options using index number
		Month_options.get(5).click();
		
		//Apply for loop to iterate list of options
		for (int i = 0; i < Month_options.size(); i++) 
		{
			//get Each option using index nuber
			Month_options.get(i).click();
			Thread.sleep(1000);
		}
		
		
		
		
		
		
		
	}

}
