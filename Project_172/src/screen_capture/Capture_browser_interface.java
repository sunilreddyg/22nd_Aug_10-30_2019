package screen_capture;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_browser_interface {

	public static void main(String[] args) throws Exception 
	{
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch chrome browse
		driver.get("https://www.hdfcbank.com/"); 	//load webpage to browser window
		driver.manage().window().maximize();		//maximize browser window
	
		/*
		 * 	Note:-->To use fileutils[local folders and files] in selenium 
		 * 			3.6 above version ,Download below jar files and configure to project.  
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.zip
		 * 		   Unzip file and configure all executable jar files to selenium-project.
		 */
		
		//Captured screen and converted into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Dump screen into local utilities
		FileUtils.copyFile(src, new File("screens\\image.png"));
		
		
		/*
		 * PNG => Image extension [Portable network graphic]
		 * 			Note;--> We can also use other extension [bmp,jpg --etc]
		 * 
		 * => new file craeation is a thows exception command we must handle
		 * 			exception either adding throws exception to method or
		 * 			handling using try catch.
		 */
		
		
		/*
		 * Disadvantages while screen capturing:-->
		 * 		
		 * 		=> We can' take screen shot when alert presented at page
		 * 		=> Screen capture only top interface of webpage
		 * 		=> When user rerun testcase it always override existing image.
		 */
		
		
	}

}
