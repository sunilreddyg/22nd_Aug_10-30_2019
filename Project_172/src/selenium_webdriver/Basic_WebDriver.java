package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_WebDriver {

	public static void main(String[] args) 
	{
		//Setting environment variable at runtime
		String path="C:\\Users\\Administrator\\git\\22nd_Aug_10-30_2019\\Project_172\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//launch chrome browser with help of webdriver interface.
		WebDriver driver=new ChromeDriver();
		//Load webpage to browser window
		driver.get("http://facebook.com");
		
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("Hello12345");
		
		driver.findElement(By.id("u_o_a")).click();
		
		/*
		 * Exception:-->
		 * 		1. IllegalStateException  :
		 * 				=> We receive exception when driver path not specified correctly.
		 * 				
		 * 		2. SessionNotCreated:-->
		 * 				=> We receive exception when browsers drivers mismatch with browser versions.
		 * 
		 * 		3. InvalidArgumentException:-->
		 * 				=> We receive exception when given url entered with wrong protocal
		 * 								[Url should start with http:// protocal]
		 * 		4. NoSucheElementException:-->
		 * 				=> We receive exception when expected elemnet not found
		 * 					at pagesource..
		 * 						
		 * 
		 */
		
		
		
	}

}
