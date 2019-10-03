package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Navigation_Command {

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //Launch chrome browse
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");     //load webpage to browser window
		driver.manage().window().maximize();	//maximize browser window

		//Switch to frame with help of frame URL
		driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
		Thread.sleep(3000);
		
		//Identifying frame Element
		WebElement Email_editbox=driver.findElement(By.id("email"));
		Email_editbox.clear();
		Email_editbox.sendKeys("qadarshan@gmail.com");

		//Identifying frame Element
		WebElement trip_ID=driver.findElement(By.id("tripidSecond"));
		trip_ID.clear();
		trip_ID.sendKeys("56454456445");

		
		//Navigate back to mainpage
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Identifying Page element
		WebElement Flights_Icon=driver.findElement(By.linkText("Flights"));
		Flights_Icon.click();
		
				
		
		
		
	}

}
