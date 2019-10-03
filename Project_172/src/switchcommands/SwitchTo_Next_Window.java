package switchcommands;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window {

	public static void main(String[] args) throws Exception 
	{
	
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch chrome browse
		driver.get("https://www.facebook.com");     //load webpage to browser window
		driver.manage().window().maximize();		//maximize browser window

		
		//Get current window dynamic ID
		String MainWindowID=driver.getWindowHandle();

		//Clicking at hyper link to open page at new window.
		driver.findElement(By.linkText("Instagram")).click();
		
		//Get All Window Dynamic ID's
		Set<String> All_window_IDs=driver.getWindowHandles();
		for (String EachwindowID : All_window_IDs) 
		{
			driver.switchTo().window(EachwindowID);
			if(!MainWindowID.equals(EachwindowID))
			{
				break;
			}
		}
		
		Thread.sleep(5000);
		System.out.println("current focused window title is => "+driver.getTitle());
		
		//Close Sub Window
		driver.close();
		
		
		//Apply switch to mainwindow
		driver.switchTo().window(MainWindowID);
		
		System.out.println("Main window title is => "+driver.getTitle());
		
	}

}
