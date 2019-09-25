package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_Attribute {

	public static void main(String[] args) throws Exception
	{
		
		
		/*
		 * Scenario:--> Verify Roundtrip radio button selected on browser launch
		 * 		
		 * 			Given url "http://makemytrip.com"
		 * 			when user select roundtrip radio button
		 * 			Then verify Roundtrip selected 
		 */
		

		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.makemytrip.com"); 		//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
					

		//Identify Roundtrip radio button
		WebElement Roundtrip=driver.findElement(By.xpath("//li[text()='Round Trip']"));
		Roundtrip.click();
		Thread.sleep(3000);
		
		
		//Get Class property value
		String Runtime_class=Roundtrip.getAttribute("class");
		
		if(Runtime_class.contains("selected"))
		{
			System.out.println("Testpass:--> As expected roundtrip is Selected");
			//Verify return date visible on roundtrip selection
			WebElement Return_date_Container=driver.findElement(By.xpath("//div[@class='fsw_inner ']/div[4]/label "));
			//get Runtime attribute
			String Runtime_Class=Return_date_Container.getAttribute("for");
			if(Runtime_Class.contains("return"))
				System.out.println("Testpass:--> As expected return date visible");
			else
				System.out.println("Testfail:--> Return date not visible on roundtrip selection");
			
			
		}
		else
			System.out.println("Testfail:--> Roundtrip is not selected");
		
		
		
	
		
	}

}
