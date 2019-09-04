package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login_Keybord_Shorcuts {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method //Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //Launch chrome browse
		driver.get("http://gmail.com");     //load webpage to browser window
		driver.manage().window().maximize();	//maximize browser window

		//Identify email editbox
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan"+Keys.ENTER);
		
		Thread.sleep(4000);
		
		//Identify password editbox
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Hello12345"+Keys.ENTER);
	}

}
