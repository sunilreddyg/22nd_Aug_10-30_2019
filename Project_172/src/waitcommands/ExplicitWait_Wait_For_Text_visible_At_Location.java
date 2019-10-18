package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_For_Text_visible_At_Location {

	public static void main(String[] args) 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.get("http://gmail.com");       //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		//Type email and press enter key
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com");
		
		
		//Enable Explicit wait at automation browser
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[contains(.,'Welcome')]"), "Welcome"));
		System.out.println("Timeout released expected text visible at location");
		
		driver.findElement(By.id("pass")).clear();		
		driver.findElement(By.id("pass")).sendKeys("Hello123456");
	}

}
