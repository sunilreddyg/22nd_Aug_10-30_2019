package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown_Options {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.hdfcbank.com/branch-atm-locator");     //Load webpage
		driver.manage().window().maximize();    //maximize browser window
		
		//Selecting dropdown using visible option name.
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(3000);
		
		//Selecting drodpown using value attribute of option.
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("ananthapur");
		
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Raju road");
		
		//Selecting dropdown using index option
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);
				
		//Select ATM checkbox
		driver.findElement(By.id("amenity_category_order_types50")).click();
		
		//Click Search button
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[1]/div[1]/form[2]/ul/li[7]/input")).click();
	}

}
