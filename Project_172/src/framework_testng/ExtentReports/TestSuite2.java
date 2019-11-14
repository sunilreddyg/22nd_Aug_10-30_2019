package framework_testng.ExtentReports;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestSuite2
{
	ExtentReports logger;
	ExtentTest test;
	String Extent_path="D:\\Images\\Reports1.html";
	
	
	
	@Test
	public void tc001_reg_valid()
	{
		test.log(LogStatus.PASS, "User reg successfull");
	}
	
	@Test
	public void tc001_reg_INvalid()
	{
		test.log(LogStatus.FAIL, "Testfailed");
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
