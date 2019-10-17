package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox_With_Dynamic_TimeGap
{

	public static void main(String[] args) 
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		WebDriver driver=new ChromeDriver();  //Launch browser
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");    //Load webpage
		driver.manage().window().maximize();  //maximize browser window
		
		//Type referral keyword at autocompleted editbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		//Dynamic timeout collect from implicit wait
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		//Type referral keyword at autocompleted editbox
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("D"+Keys.ARROW_RIGHT+"EL");
		//Dynamic timeout collect from implicit wait
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		

	}

}
