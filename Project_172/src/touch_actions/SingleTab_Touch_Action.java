package touch_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;

public class SingleTab_Touch_Action 
{

	public static void main(String[] args) 
	{
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1024,768));
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		//target location
		WebElement Exp_Sal=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		
		
		/*
		 * Note:--> By creation of object for TouchActions, We can
		 * 			access mouse,keyboard,touch interaction methods.
		 */
		
		/*
		 *  Single tap action analogs mouse left click option at webpage
		 *  => Enable touch actions on automation browser
		 */
		new TouchActions(driver).singleTap(Exp_Sal).perform();
		
		
	}

}
