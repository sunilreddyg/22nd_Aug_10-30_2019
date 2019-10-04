package switchcommands;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Window_Using_Iterators {

	public static void main(String[] args) throws Exception {
		
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
				
		
		//Get All dynamic window id's
		Set<String> All_windowIDs=driver.getWindowHandles();
		//Convert Set of objects into iterators.
		Iterator<String> itr=All_windowIDs.iterator();
		
		/*
		 * Iterator helps to get each token under 
		 * 	collection using Next method
		 */
		String W1=itr.next();
		driver.switchTo().window(W1);
		System.out.println("W1 Title is => "+driver.getTitle());
		
		String W2=itr.next();
		driver.switchTo().window(W2);
		System.out.println("W2 Title is => "+driver.getTitle());
		
		String W3=itr.next();
		driver.switchTo().window(W3);
		System.out.println("W3 Title is => "+driver.getTitle());
		
		
		
		
		
		
		
		
	}

}
