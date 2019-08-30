package browser_launch;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_Browser {

	public static void main(String[] args) 
	{
		
		/*
		 * donwload IEDriverServer.exe file:-->
		 * 		
		 * 		URL:--> https://www.seleniumhq.org/download/
		 * 			--> Under The Internet Explorer Driver Server
		 * 			--> select hotspot size and downlaod w.r.t Selenium version
		 * 					Selenium version :--> 3.14
		 * 					IEDriver version :--> 3.14
		 * 					Supported IEBrowser versons:--> 8,9,10,11
		 * 			--> Download zip format file and unzip file to backup drive.
		 * 
		 * 
		 * 			Note;-->
		 * 				1. zoom level shoule be 100
		 * 				2. Need to disable all security and privacy settings.
		 * 
		 * 		Note:--> Inorder to use IEDriverServer in local PC, We must
		 * 				 create environment variable at system path.
		 * 
		 */
		
		String path="D:\\sunill\\22nd_10-30_Aug_2019\\Project_172\\Browser_Drivers\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", path);
		
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		
		
		
		
		
		
		
		
		

	}

}
