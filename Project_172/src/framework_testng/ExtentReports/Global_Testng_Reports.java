package framework_testng.ExtentReports;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;

public class Global_Testng_Reports 
{
 
	ExtentReports logger;
	ExtentTest test;
	String Extent_path="D:\\Images\\Reports2.html";
	
	
	
	@Test
	public void tc001_userlogin_valid()
	{
		test.log(LogStatus.PASS, "User login successfull");
	}
	
	@Test
	public void tc001_userlogin_INvalid()
	{
		test.log(LogStatus.FAIL, "Testfail with invalid login");
	}
	
  @BeforeMethod
  public void beforeMethod(Method method) 
  {
	  test=logger.startTest(method.getName());
  }

  @AfterMethod
  public void afterMethod() 
  {
	  logger.endTest(test);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  logger=new ExtentReports(Extent_path,true);
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  logger.flush();
  }

}
