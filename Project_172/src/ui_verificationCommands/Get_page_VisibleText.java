package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_page_VisibleText 
{

	public static void main(String[] args) 
	{
		/*
		 * Scenario:--> Verify Expected text visible at webpage.
		 * 
		 * 		Given url "http://facebook.com
		 * 		when click create account button without data entry
		 * 		then receive approriate error message "What's your name?"
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.facebook.com"); 		//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
						
		
		WebElement Signup_btn=driver.findElement(By.xpath("//button[@name='websubmit']"));
		Signup_btn.click();
		
		//Identify Entire page at current window
		WebElement Page=driver.findElement(By.tagName("body"));
		//Capture entire visible text at webpage
		String Page_Visible_text=Page.getText();
		//System.out.println(Page_Visible_text);
		
		String Exp_text="What's your name?";
		//Write decision to verify expected text available at visible text
		if(Page_Visible_text.contains(Exp_text))
			System.out.println("As expected Error message displayed at webpage");
		else
			System.out.println("Expected error msg not visible at webpage");

	}

}
