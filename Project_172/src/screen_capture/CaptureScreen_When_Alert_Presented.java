package screen_capture;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreen_When_Alert_Presented
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
		
		//Click Search button without enter data
		WebElement Search_btn=driver.findElement(By.xpath("//input[@type='submit']"));
		Search_btn.click();
		Thread.sleep(3000);
		
		
		//Create obeject fo robot class
		Robot robot=new Robot();
		
		//Get Screen dimension
		Dimension screen_size=Toolkit.getDefaultToolkit().getScreenSize();
		//Create screen using robot class
		BufferedImage image=robot.createScreenCapture(new Rectangle(screen_size));
		
		//Target file location to dump image
		String path="C:\\Users\\Administrator\\git\\22nd_Aug_10-30_2019\\Project_172\\screens\\image1.png";
		File filepath=new File(path);
		
		//Write image into local system
		ImageIO.write(image, "PNG", filepath);

	}

}
