package switchcommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException 
	{
		

		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  			//Launch chrome browse
		driver.get("https://www.cleartrip.com/trains"); //load webpage to browser window
		driver.manage().window().maximize();			//maximize browser window

		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get All dynamic window ID's
		Set<String> Allwindow_IDS=driver.getWindowHandles();
		//Iteate for all window times
		for (String EachWindowID : Allwindow_IDS) 
		{
			//Switch to Every window
			driver.switchTo().window(EachWindowID);
			//Capture every window title
			String Runtime_title=driver.getTitle();
			
			//Condition to accept on expected window title match
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break;   //Stop Iteration and get execution control out of for loop.
			}
			
		}
		
		
		
		System.out.println("Current Focused window is => "+driver.getTitle());
	}

}
