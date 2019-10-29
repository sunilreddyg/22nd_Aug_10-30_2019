package pageobjects.PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_Search_Flight {

	public static void main(String[] args)
	{
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		/*
		 * Note:--> Inorder to use @findby methods, we should
		 * 			take help of pagefactory class.
		 */
		Search_Flights SFlight=PageFactory.initElements(driver, Search_Flights.class);
		
		SFlight.Roundtrip_Rbtn.click();
		SFlight.From_EB.clear();
		SFlight.From_EB.sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		SFlight.Hyd_City_Airport.click();
		
		SFlight.Arrival_EB.clear();
		SFlight.Arrival_EB.sendKeys("D"+Keys.ARROW_RIGHT+"EL");
		SFlight.Delhi_City_Airport.click();
		
		SFlight.Flight_Search_btn.click();
		
		
		
	}

}
