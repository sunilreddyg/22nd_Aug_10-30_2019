package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Signup
{

	public static void main(String[] args) 
	{
		
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		//Launch chrome browse
		WebDriver driver=new ChromeDriver();
		//load webpage to browser window
		driver.get("http://facebook.com");  
		//maximize browser window
		driver.manage().window().maximize();
		
		
		//Identify location and type characters into editbox
		driver.findElement(By.id("u_0_l")).clear();
		driver.findElement(By.id("u_0_l")).sendKeys("Arjun");
		
		//Identify lastname editbox location and  type charactes into it
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Ram");
		
		//Identify mobile or email location
		driver.findElement(By.id("u_0_q")).clear();
		driver.findElement(By.id("u_0_q")).sendKeys("abc@gmail.com");

		//identify retype email or mobile
		driver.findElement(By.id("u_0_t")).clear();
		driver.findElement(By.id("u_0_t")).sendKeys("abc@gmail.com");
		
	}

}
