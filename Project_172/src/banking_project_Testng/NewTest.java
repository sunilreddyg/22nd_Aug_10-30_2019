package banking_project_Testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class NewTest 
{
	String driver_path="Browser\\chromedriver.exe";
	String Reports_path="C:\\report.html";
	WebDriver driver=null;
	ExtentReports reporter;
	ExtentTest test;
	String url="http://192.168.1.97/ebank1.aspx";
	
	
	@Test(priority=0)
	public void Admin_login()
	{
		if(driver.getTitle().equals(""))
		{
			test.log(LogStatus.INFO, "Expected title presented");
		}
		else
		{
			test.log(LogStatus.SKIP, "Precondition failed admin login page not displayed");
			throw new SkipException("Adming homepage not displayed");
		}
		
	}
	
	@Test(priority=1,dependsOnMethods="Admin_login")
	public void New_BranchCreation()
	{
		
		
	}
	
	
	
	
	
	
	
	
	
	

  @BeforeMethod
  public void beforeMethod(Method method) 
  {
	  test=reporter.startTest(method.getName());
  }

  @AfterMethod
  public void afterMethod() 
  {
	  //Caputurescreen
	  test.log(LogStatus.INFO,test.addScreenCapture("image"));
	  reporter.endTest(test);
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  reporter=new ExtentReports(Reports_path,true);
	  System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(10000);
	  driver.close();
	  reporter.flush();
  }

}
