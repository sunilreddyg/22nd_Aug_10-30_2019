package extent_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports_Syntax
{

	public static void main(String[] args) 
	{
		
		String file_path="filelocation with html extension";
		ExtentReports reports=new ExtentReports(file_path, true);
		
		ExtentTest test=reports.startTest("Test Login", "Login with invalid data");

		test.log(LogStatus.INFO, "Browser launched");
		test.log(LogStatus.SKIP, "Skip maximize browser");
		test.log(LogStatus.PASS, "Test verfied");
		test.log(LogStatus.FAIL, "Data not verifed");
		test.log(LogStatus.FATAL, "Total test fail no workarround");
		test.log(LogStatus.INFO, "Screen captured "
		                 +test.addScreenCapture("imagepath"));
	
		reports.endTest(test);
		
		reports.flush();
	}

}
