package pageobjects.PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_SearchFlights_Using_Method {

	public static void main(String[] args) {
		
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
		SFlight.flight_search_roundtrip();
		
	}

}
