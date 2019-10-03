package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switch_BetWeen_Frames 
{

	public static void main(String[] args)
	{
		
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //Launch chrome browse
		driver.get("https://epass.apcfss.in/"); //load webpage to browser window
		driver.manage().window().maximize();	//maximize browser window

		//Switching to frame using ID attriute
		driver.switchTo().frame("menuFrame");
		//click Link under menuframe
		driver.findElement(By.xpath("//a[contains(.,'Fee Structure')]")).click();
		
		//Get Control back to mainpage
		driver.switchTo().defaultContent();
		
		//Identify Frame Element
		WebElement BodyFrame=driver.findElement(By.cssSelector("frame[title='bodyFrame']"));
		//switch to frame using webelement referral
		driver.switchTo().frame(BodyFrame);
		
		//Select Drodown under bodyframe
		new Select(driver.findElement(By.xpath("//select[contains(@name,'board')]")))
		.selectByIndex(3);
		
		
		
	}

}
