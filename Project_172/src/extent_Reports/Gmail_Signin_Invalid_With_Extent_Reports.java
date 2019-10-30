package extent_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Gmail_Signin_Invalid_With_Extent_Reports {

	public static void main(String[] args) throws Exception 
	{
		
		String file_path="C:\\Users\\Administrator\\git\\22nd_Aug_10-30_2019\\Project_172\\src\\extent_Reports\\";
		//Create object for extentReports
		ExtentReports reports=new ExtentReports(file_path+"Myreports.html",true);
		
			
			//Create test using extentReports
			ExtentTest test=reports.startTest("Gmail_Signin_invalid");
			
			//Set Runtime environment variable for chrome driver
			String chrome_path="Browser_Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chrome_path);
						    
			//browser initiation
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.gmail.com");
			driver.manage().window().maximize();
			test.log(LogStatus.INFO, "browser launched");
			
			//Identify email editbox
			driver.findElement(By.id("identifierId")).clear();
			driver.findElement(By.id("identifierId")).sendKeys("qadarshan"+Keys.ENTER);
			test.log(LogStatus.INFO, "Email validation completed");
			
			Thread.sleep(4000);
			test.log(LogStatus.INFO, "Waiting 4 seconds to load password page");
			
			//Identify password editbox
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys("Hello12345"+Keys.ENTER);
			test.log(LogStatus.INFO, "Password validation sucessfull");
			
			
			reports.endTest(test);
			
		
		//Clear and update all reports
		reports.flush();

	}

}
