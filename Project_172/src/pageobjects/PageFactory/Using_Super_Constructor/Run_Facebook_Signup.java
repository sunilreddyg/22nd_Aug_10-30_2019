package pageobjects.PageFactory.Using_Super_Constructor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_Facebook_Signup 
{

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		
		FB_Signup obj=new FB_Signup(driver);
		obj.User_reg();
		
		Thread.sleep(5000);
		driver.close();
	}

}
