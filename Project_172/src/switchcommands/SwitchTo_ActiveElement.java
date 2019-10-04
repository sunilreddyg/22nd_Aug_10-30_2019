package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_ActiveElement {

	public static void main(String[] args) throws Exception {
		
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  					//Launch chrome browse
		driver.get("https://www.naukri.com/free-job-alerts"); 	//load webpage to browser window
		driver.manage().window().maximize();					//maximize browser window

		//Click On Expected salary list box	
		driver.findElement(By.xpath("//input[@id='cjaMinSal']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().activeElement()
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);

	}

}
