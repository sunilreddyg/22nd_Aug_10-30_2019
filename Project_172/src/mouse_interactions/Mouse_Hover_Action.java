package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action {

	public static void main(String[] args) throws Exception {
		
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch chrome browse
		driver.get("https://www.hdfcbank.com/"); 	//load webpage to browser window
		driver.manage().window().maximize();		//maximize browser window
		
		
		/*
		 * Crate object for Actions class, Inorder to use
		 * mouse interaction methods.
		 */
		
		//Identfy location
		WebElement Products_menu=driver.findElement(By.xpath("//a[@href='/personal/products']"));
		//performing hover action at location
		new Actions(driver).moveToElement(Products_menu).perform();
		Thread.sleep(3000);
		
		//identify location
		WebElement SubMenu_insurance=driver.findElement(By.xpath("//a[@href='/personal/products/insurance']"));
		//performing hover action at location
		new Actions(driver).moveToElement(SubMenu_insurance).perform();
	}

}
