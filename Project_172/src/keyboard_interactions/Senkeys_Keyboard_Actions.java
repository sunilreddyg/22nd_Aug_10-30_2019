package keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Senkeys_Keyboard_Actions 
{

	public static void main(String[] args) 
	{
		
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
				
		
		
		//click course list to display list of options
		driver.findElement(By.xpath("//input[@name='course']")).click();
		
		
		//keyboard actions on automation browser
		new Actions(driver).sendKeys("MCA")
		.pause(2000).sendKeys(Keys.TAB).perform();
		
		
		//Type referral text into editbox
		driver.findElement(By.xpath("//input[@id='ql']")).clear();
		driver.findElement(By.xpath("//input[@id='ql']")).sendKeys("HYD");
		//Keyboard action on automation  browser
		new Actions(driver).pause(5000)
		.sendKeys(Keys.ARROW_DOWN).pause(2000)
		.sendKeys(Keys.ENTER).perform();
		
		
		//keybaord action on automation browser
		new Actions(driver).sendKeys(Keys.TAB).pause(2000)
		.sendKeys("java").pause(1000).sendKeys(Keys.ENTER).perform();
				
		
		new Actions(driver).sendKeys("HYD")
		.pause(3000).sendKeys(Keys.ARROW_DOWN).pause(2000).sendKeys(Keys.ENTER).perform();
	}

}
