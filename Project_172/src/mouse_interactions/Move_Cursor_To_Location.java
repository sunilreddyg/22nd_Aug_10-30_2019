package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_Cursor_To_Location {

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //Launch chrome browse
		driver.get("https://www.redbus.in/hotels/");     //load webpage to browser window
		driver.manage().window().maximize();	//maximize browser window

		//using javscript executor scroll window
		((JavascriptExecutor)driver).executeScript("scroll(100,400)");	
				
		
		//identifying location at webpage
		WebElement Signin_btn=driver.findElement(By.xpath("//button[@class='login-btn'][contains(.,'Sign in')]"));
		//Perform movetoelement action
		new Actions(driver).moveToElement(Signin_btn).pause(5000).perform();
		//Click On Singin btn
		Signin_btn.click();
		
		
				

	}

}
