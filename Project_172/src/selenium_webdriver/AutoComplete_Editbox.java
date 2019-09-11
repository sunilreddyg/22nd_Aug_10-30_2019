package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws Exception 
	{
		//Browser initiation
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000); //Static timeout to wait until browser notification window popup
		
		
		//Select Roundtrip radio button
		driver.findElement(By.id("RoundTrip")).click();
	
		//Identify Location and type referral keyword init
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Thread.sleep(4000); //Static timeout to laod referrals
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//identfy location and type referral keyword init
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("D"+Keys.ARROW_RIGHT+"EL");
		Thread.sleep(4000); //Static timeout to laod referrals
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		
		
		Thread.sleep(2000); //Static timeout to prompt Datepicker
		driver.findElement(By.linkText("26")).click();
		
		
		Thread.sleep(2000); //static timeout to prompt arrival date-picker
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("W"+Keys.ARROW_RIGHT+"ed, 24 Jun, 2020");

		
		new Select(driver.findElement(By.id("Adults")))
		.selectByVisibleText("4");
		
		
		//click link with partial linkname
		driver.findElement(By.partialLinkText(" Class of travel, Airline preference")).click();
		
		//Click Search button
		driver.findElement(By.id("SearchBtn")).click();
		
	}

}
