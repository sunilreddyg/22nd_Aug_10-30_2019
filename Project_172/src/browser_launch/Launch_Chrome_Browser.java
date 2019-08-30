package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser {

	public static void main(String[] args)
	{
		
		/*
		 * Download Chromedriver.exe file:-->
		 * 		=> Open site http://seleniumhq.org
		 * 		=> Click on download tab
		 * 		=> Under third party browser and drivers
		 * 		=> Click "google chrome driver"  link.
		 * 		=> Click on chromedriver link w.r.t chrome browser version
		 * 					chromebrowser ==> 76
		 * 					chromedriver  ==> 76
		 * 		=> Select Operating system at index page and click link to download
		 * 		=> After download zip format file for windows, unzip file to back up location
		 * 
		 * 		Note:--> Inorder to use chromedriver in local PC, We must
		 * 				 create environment variable at system path.
		 */
		
		//Setting environment variable at runtime 
		String path="\\Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Launch chrome browser
		ChromeDriver chrome=new ChromeDriver();
		//load webpage to browser window..
		chrome.get("http://google.com");
		
		

	}

}
