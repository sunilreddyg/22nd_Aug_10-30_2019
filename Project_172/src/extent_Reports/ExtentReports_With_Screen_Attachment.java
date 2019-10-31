package extent_Reports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports_With_Screen_Attachment {

	public static void main(String[] args) throws Exception
	{
		String file_path="D:\\extent_reports\\Reports_WithScreen.html";
		
		
		//Create Extent reports using above location
		ExtentReports reporter=new ExtentReports(file_path, true);
		
			ExtentTest test=reporter.startTest("Homepage");
		
			
			try {
				
				System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://facebook.com");  
				driver.manage().window().maximize();
				
				String image_op="D:\\extent_reports\\images\\image.png";
				File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(Src, new File(image_op));
				
				test.log(LogStatus.PASS, "Homepage displayed ",test.addScreenCapture(image_op));
				
				
			} catch (Exception e) {
				test.log(LogStatus.FAIL,e.getMessage());
			}
		
			
			
			
			
			
			
			reporter.endTest(test);
		
		//Write and updation
		reporter.flush();
	}

}
