package keyboard_interactions;

import java.rmi.activation.ActivationGroup_Stub;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keydown_And_KeyUp_Actions {

	public static void main(String[] args) 
	{
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		//using javscript executor scroll window
		((JavascriptExecutor)driver).executeScript("scroll(100,400)");
		
		//Identify Frame Location
		WebElement Demo_frame=driver.findElement(By.className("demo-frame"));
		//Switch browser control to frame
		driver.switchTo().frame(Demo_frame);
		
		//Perform key up action
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		//Click 1,3,5,7 items
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		
		//Perform keyup action using keyboard shortcut
		new Actions(driver).keyUp(Keys.CONTROL).perform();
	
	}

}
