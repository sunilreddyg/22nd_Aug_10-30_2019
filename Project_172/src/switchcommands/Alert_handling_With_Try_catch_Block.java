package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling_With_Try_catch_Block {

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
		Search_btn.click();
		Thread.sleep(5000);
		
		
		try {
			//Switching to alert and captured alert controls to referral variable
			Alert alert=driver.switchTo().alert();
			//Capture text presented at alert
			String Alert_msg=alert.getText();
			System.out.println(Alert_msg);
			//Accept alert window
			alert.accept();
			
		} catch (NoAlertPresentException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Run continued");
		
		
		
		
		

	}

}
