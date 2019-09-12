package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDentification_With_Class_Attribute {

	public static void main(String[] args) 
	{
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		//Identifying location with class property
		driver.findElement(By.className("phone-no")).clear();
		driver.findElement(By.className("phone-no")).sendKeys("sunilreddy.gajjala@yahoomail.com");
		
		/*
		 * Identify location when class name havaing space.
		 * 		Note:--> Don't define class property when it contains space.
		 */
		driver.findElement(By.className("orko-button-primary")).click();
		System.out.println("Element identified");
				
	}

}
