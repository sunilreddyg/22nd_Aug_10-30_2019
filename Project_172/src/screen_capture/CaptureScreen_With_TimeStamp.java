package screen_capture;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaptureScreen_With_TimeStamp 
{

	public static void main(String[] args) throws Exception
	{
		/*
		 * 	Note:-->To use fileutils[local folders and files] in selenium 
		 * 			3.6 above version ,below downloads required.  
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.zip
		 * 		   Unzip file and configure all executable jar files to selenium-project.
		 */
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
					    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		//Target Location
		WebElement Location=driver.findElement(By.xpath("//a[contains(@id,'anc')]"));
		new Actions(driver).moveToElement(Location).pause(3000).perform();
		
		
		//Java time stamp.
		
		//creating simple date format
		SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//get system default date
		Date d=new Date();
		//Convert system date using default format
		String time=df.format(d);
		
	
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"Targetimage.png"));
		
		
		
		

	}

}
