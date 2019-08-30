package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_Browser 
{

	public static void main(String[] args) 
	{
		/*
		 * Download geckodriver.exe file:-->
		 * 
		 * 		URL:--> https://github.com/mozilla/geckodriver/releases
		 * 		    --> select geckodriver version w.r.t firefox browser
		 * 					Firefox browser version:--> 65
		 * 					geckodriver version :--> v0.24.0
		 * 			--> download w.r.t operating system
		 * 			--> After download zip format file for windows, unzip file to back up location
		 * 
		 * 		Note:--> Inorder to use geckodriver in local PC, We must
		 * 				 create environment variable at system path.
		 */
		
		
		//Setting runtime environment variable
		String path="D:\\sunill\\22nd_10-30_Aug_2019\\Project_172\\Browser_Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		
		//Launch firefox browse
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://www.google.com");
		
	}

}
