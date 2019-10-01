package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert 
{

	public static void main(String[] args) throws Exception
	{
		
		/*
		 * Scenario:-->
		 * 			Verify search job without enter selectcourse and keyword enter
		 * Steps:-->
		 * 		=> Given url https://www.firstnaukri.com/
		 * 		=> When click search button without enter Select courst and Keyword Enter
		 * 		=> Then receive Alert with expected text.
		 */
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.firstnaukri.com/"); 		//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
				
				

		//Identify Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		//Search_btn.click();
		Thread.sleep(5000);
		
		//Switching to alert and captured alert controls to referral variable
		Alert alert=driver.switchTo().alert();
		
		//Capture text presented at alert
		String Alert_msg=alert.getText();
		System.out.println(Alert_msg);
		
		//Accept alert window
		alert.accept();
		
		
		System.out.println("Run Continued");
		
		/*
		 * => How to Capture text on alert window
		 * 		driver.switchTo().alert().getText();
		 * 
		 * => How to Accept popup window    [It close window]
		 * 		driver.switchTo().alert().accept();
		 * 
		 * => How to Dismiss alert window   [It close window]
		 * 		driver.switchTo().alert().dismiss();
		 * 
		 * => How to Send text to popup-window  [Prompt window]
		 * 		driver.switchTo().alert().sendkeys("text");
		 */

		
		/*
		 * Alert Exceptions:-->
		 * 	
		 * 		UnhandledAlertException:--> 
		 * 					Exception receive for unexpeted alerts
		 * 
		 * 		NoalertpresentedException:--> 
		 * 					Exception receive when expected
		 * 					alert not presented.
		 */
		
		
		

	}

}
