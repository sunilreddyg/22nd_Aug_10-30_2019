package banking_project.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import banking_project.Admin.Admin_Testcase;

public class RFB_Bank_Runner {

	public static void main(String[] args) 
	{
		String path="C:\\Users\\Administrator\\git\\30th_Oct_6_30_PM_2019\\Project174\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		//launch chrome browser with help of webdriver interface.
		WebDriver driver=new ChromeDriver();
		//Load webpage to browser window
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		
		
	    Admin_Testcase TC=new Admin_Testcase(driver);
		TC.Admin_login("Admin", "Admin");

	}

}
