package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Using_MouseActions {

	public static void main(String[] args) throws Exception {
		
		//Set Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		//using javscript executor scroll window
		((JavascriptExecutor)driver).executeScript("scroll(100,400)");
		Thread.sleep(5000);
		
		//Identify Frame Location
		WebElement Demo_frame=driver.findElement(By.className("demo-frame"));
		//Switch browser control to frame
		driver.switchTo().frame(Demo_frame);
		
		//Target WebElement locations
		WebElement Src=driver.findElement(By.xpath("//div[contains(@id,'draggable')]"));
		WebElement Dst=driver.findElement(By.xpath("//div[contains(@id,'droppable')]"));
		
		//Perform drag and drop feature using mouse commands.
		Actions action=new Actions(driver);
		
		action.clickAndHold(Src)
		.moveToElement(Dst)
		.release(Src)
		.perform();
		
		
		
		
		

	}

}
