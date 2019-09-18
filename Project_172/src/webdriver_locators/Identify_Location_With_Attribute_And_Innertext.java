package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_Location_With_Attribute_And_Innertext {

	public static void main(String[] args) throws Exception 
	{
		
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		/*
		 * Identify location with element innertext.
		 * HtmlSource:--> 
		 * 		<button  id="cjaMain">Create a Job Alert</button>
		 * Syntax:-->
		 * 			//tagname[text()='Elementtext']
		 */
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();


		driver.findElement(By.xpath("//input[@id='Sug_kwdsugg']")).clear();
		driver.findElement(By.xpath("//input[@id='Sug_kwdsugg']")).sendKeys("Software Testing");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Software Testing']")).click();
		Thread.sleep(3000);
	
		
		driver.findElement(By.xpath("//div[text()='Automation Testing']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Selenium']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[.='Webdriver']")).click();
		Thread.sleep(3000);
		
		//Identify Location with Attribute and Text
		driver.findElement(By.xpath("//div[@class='Sbtn'][text()='Test Lead']")).click();
		
		
		
	}

}
