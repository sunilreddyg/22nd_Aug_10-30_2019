package exception_handling;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Not_Found {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //Launch chrome browse
		driver.get("http://gmail.com");     //load webpage to browser window
		driver.manage().window().maximize();	//maximize browser window

		
		try {
			
			//Identify email editbox
			driver.findElement(By.id("identifierId")).clear();
			driver.findElement(By.id("identifierId")).sendKeys("qadarshan"+Keys.ENTER);
			
			Thread.sleep(4000);
			
			//Identify password editbox
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("Hello12345"+Keys.ENTER);

				
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (ElementNotVisibleException e) {
			e.printStackTrace();
		} catch (InvalidElementStateException e) {
			e.printStackTrace();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}catch (UnhandledAlertException e) {
			e.printStackTrace();
			driver.switchTo().alert().accept();
		}
				
				
				
	}

}
