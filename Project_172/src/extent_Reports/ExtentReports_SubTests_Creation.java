package extent_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports_SubTests_Creation {

	public static void main(String[] args) {
		
String file_path="D:\\extent_reports\\Reports_WithScreen.html";
		
		
		//Create Extent reports using above location
		ExtentReports reporter=new ExtentReports(file_path, true);
		
			ExtentTest test1=reporter.startTest("Homepage");
		
			ExtentTest test2=reporter.startTest("Sigin");
			test2.log(LogStatus.INFO, "Email Entry compelted");
			test2.log(LogStatus.PASS, "Login succesfull");
			
			
			ExtentTest test3=reporter.startTest("Signup");
			test3.log(LogStatus.INFO, "Firstname entry completed");
			test3.log(LogStatus.FAIL, "user registration failed");
			
			//Adding child testcase to parent testcase
			test1.appendChild(test2).appendChild(test3).assignCategory("Regression_cycle1");
	
			
			reporter.endTest(test1);
			
			
		//Write and updation
		reporter.flush();

	}

}
