package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Keyboard_Shortcuts {

	public static void main(String[] args) 
	{
		
	    //Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //Launch chrome browse
		driver.get("http://facebook.com");     	//load webpage to browser window
		driver.manage().window().maximize();	//maximize browser window
		
		
		
		//Identify Firstname editbox location
		driver.findElement(By.id("u_0_l"))
		.sendKeys("Arjun"+Keys.TAB
				+"Krisha"+Keys.TAB
				+"arjunkrishna@gmail.com"+Keys.TAB
				+"arjunkrishna@gmail.com"+Keys.TAB
				+"Hello1234");
		
		
		//Select dropdown using characters sequences
		driver.findElement(By.id("day")).sendKeys("abc");
		
		//Select dropdown using keyboard shortcuts
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		
		/*
		 * Note:--> sendkeys accept "Character sequences" and "keyboard shortcuts", Because of
		 * 			this reason webdriver doesn't throw any exception on inavalid identification..
		 */
		
		
		
		/*
		 * Note:--> To select dropdown selenium have diff programms.
		 */
		
		
		
		
		
		
		
		


	}

}
