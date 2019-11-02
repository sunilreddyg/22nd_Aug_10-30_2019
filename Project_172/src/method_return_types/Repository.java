package method_return_types;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository
{
	public WebDriver driver;
	String driver_path="browser_drivers\\";
	WebDriverWait wait;
	
	/*
	 * KeywordName:--> lauch diff browsers [firefox,chrome,ie]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	public void launch_browser(String browsername)
	{
		switch (browsername) 
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver", driver_path+"geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		case "ie":
			System.setProperty("webdriver.ie.driver", driver_path+"IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			break;

		default:
			break;
		}
	}
	
	
	
	/*
	 * KeywordName:--> Load webpage using http:// or https:// 
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	public void load_webpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * KeywordName:--> Set implicit and explicit timeout
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	public void set_timeout(int time_in_sec)
	{
		driver.manage().timeouts().implicitlyWait(time_in_sec, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver, time_in_sec);
	}
	
	
	/*
	 * KeywordName:--> Entet inputvalue into editbox.[Only possible with xpath]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	public void Enter_text(String element_xpath,String input)
	{
		WebElement Editbox=driver.findElement(By.xpath(element_xpath));
		Editbox.clear();
		Editbox.sendKeys(input);
	}
	
	/*
	 * KeywordName:--> Entet inputvalue into editbox.[Possible with all locators]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	public void Enter_text(By locator,String input)
	{
		WebElement Editbox=driver.findElement(locator);
		Editbox.clear();
		Editbox.sendKeys(input);
	}
	
	
	/*
	 * KeywordName:--> Entet inputvalue into editbox.[Possible with pagefactory @findby methods]
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	public void Enter_text(WebElement Element,String input)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOf(Element));
		Editbox.clear();
		Editbox.sendKeys(input);
	}
	
	
	
	/*
	 * KeywordName:--> Selected Dropdown using SelectByvisibletext [Using xpath]  
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	public void select_dropdown(String element_xpath,String Optionname)
	{
		WebElement Element=driver.findElement(By.xpath(element_xpath));
		new Select(Element).selectByVisibleText(Optionname);
	}
	
	
	/*
	 * KeywordName:--> Selected Dropdown using SelectByvisibletext 
	 * 					[Using By refernce]  
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	public void select_dropdown(By locator,String Optionname)
	{
		WebElement Element=driver.findElement(locator);
		new Select(Element).selectByVisibleText(Optionname);
	}
	
	
	/*
	 * KeywordName:--> Selected Dropdown using SelectByvisibletext 
	 * 					[Using By refernce]  
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	public void select_dropdown(WebElement Element,String Optionname)
	{
		WebElement drodpown=wait.until(ExpectedConditions.visibilityOf(Element));
		new Select(drodpown).selectByVisibleText(Optionname);
	}
	
	
	/*
	 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
	 * 					[Using By refernce]  
	 * Author:-->
	 * CreatedOn;-->
	 * ReviewedBy:-->
	 * Parameters used:--> Local
	 * LastUpdationDate:-->
	 */
	 public void click_element(String element_xpath)
	 {
		 WebElement Element=driver.findElement(By.xpath(element_xpath));
		 Element.click();
	 }
	 
		/*
		 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
		 * 					[Using By class refernce]  
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */
		 public void click_element(By locator)
		 {
			 WebElement Element=wait.until(ExpectedConditions.elementToBeClickable(locator));
			 Element.click();
		 }
		 
		 /*
		 * KeywordName:--> Click Any clickable element [link,button,radiobutton,checkbox]
		 * 					[Using By class refernce]  
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */
		 public void click_element(WebElement element)
		 {
			 WebElement Element=wait.until(ExpectedConditions.elementToBeClickable(element));
			 Element.click();
		 }
			 
			 
			 
		 /*
		 * KeywordName:--> Mousehover on element.[Using By parameter]
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void mousehover(By locator)
		 {
			 WebElement Element=driver.findElement(locator);
			 new Actions(driver).moveToElement(Element).pause(2000).perform();
		 }
		 
		 
		 /*
		 * KeywordName:--> Mousehover on element.[Using WebElement paramter]
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void mousehover(WebElement element)
		 {
			 WebElement Element=wait.until(ExpectedConditions.visibilityOf(element));
			 new Actions(driver).moveToElement(Element).pause(2000).perform();
		 }
		 
		 /*
		 * KeywordName:--> Fileupload using robot class
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void FileUploading(String filepath)
		 {
		 	String text=filepath;
			
			//Select String
			StringSelection Stext=new StringSelection(text);
			//Get default system clipboard
			Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
			//set content to clipboard at runtime.
			clipboard.setContents(Stext, Stext);
			
			
			//Crate object for Robot class
			Robot robot=null;
			try {
				robot = new Robot();
			} catch (AWTException e) {
				e.printStackTrace();
			}
			robot.setAutoDelay(1000);
					
			//Press Ctrl+V to paste copied text into notepad file
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
					
			//Press enter key
			robot.keyPress(KeyEvent.VK_ENTER);
					
			//Release Control key
			robot.keyRelease(KeyEvent.VK_CONTROL);
	
		 }
	 
 
		 
		 /*
		 * KeywordName:--> CaptureScreen using [Filename]
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void capturescreen(String imagename)
		 {
			try {
				 Thread.sleep(5000);
				//creating simple date format
				SimpleDateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
				//get system default date
				Date d=new Date();
				//Convert system date using default format
				String time=df.format(d);
				
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("screens\\"+time+imagename+".png"));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		 }
		 
		 
		 
		 /*
		 * KeywordName:--> SwitchTo window
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public void switchto_window(String windowtitle)
		 {
			//Get All dynamic window ID's
			Set<String> Allwindow_IDS=driver.getWindowHandles();
			
			//Iteate for all window times
			for (String EachWindowID : Allwindow_IDS) 
			{
				//Switch to Every window
				driver.switchTo().window(EachWindowID);
				//Capture every window title
				String Runtime_title=driver.getTitle();
				
				//Condition to accept on expected window title match
				if(Runtime_title.contains(windowtitle))
				{
					break;   //Stop Iteration and get execution control out of for loop.
				}
			}		
		 }
		 
		 
		 /*
		 * KeywordName:--> Verify title presented at webpage.
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public boolean isTitle_presented(String Exp_title)
		 {
			 String Runtime_title=driver.getTitle();
			 boolean flag=Runtime_title.contains(Exp_title);
			 return flag;
		 }
		 
		 /*
		 * KeywordName:--> Verify title presented using explicit wait.
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public boolean wait_and_VerifyTitle_Presented(String Exp_title)
		 {
			 try {
				 boolean flag=wait.until(ExpectedConditions.titleContains(Exp_title));
				 return flag;
			} catch (TimeoutException e) {
				return false;
			}
			
		 }
		 
		 
		 /*
		 * KeywordName:--> Verify url presented using explicit wait.
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 public boolean is_urlpresented(String Exp_url)
		 {
			 try {
				 boolean flag= wait.until(ExpectedConditions.urlContains(Exp_url));
				 return flag;
			} catch (TimeoutException e) {
				return false;
			}
			
		 }
		 
		 
		 /*
		 * KeywordName:--> Verify Element presented at source
		 * Author:-->
		 * CreatedOn;-->
		 * ReviewedBy:-->
		 * Parameters used:--> Local
		 * LastUpdationDate:-->
		 */	 
		 	public boolean is_Element_presented(String Exp_elementSource)
		 	{
		 			String Runtime_pageSource=driver.getPageSource();
		 			boolean flag=Runtime_pageSource.contains(Exp_elementSource);
		 			return flag;
		 	}
		 	
		 	
		 	 /*
			 * KeywordName:--> Verify text presented at element.
			 * Author:-->
			 * CreatedOn;-->
			 * ReviewedBy:-->
			 * Parameters used:--> Local
			 * LastUpdationDate:-->
			 */	 
		 	public boolean is_text_presented_At_Element(By locator,String exp_text)
		 	{
		 		try {
		 			boolean flag=wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, exp_text));
			 		return flag;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
		 		
		 	}
		 	
		 	
		 	/*
			 * KeywordName:--> Verif text visible at webpage.
			 * Author:-->
			 * CreatedOn;-->
			 * ReviewedBy:-->
			 * Parameters used:--> Local
			 * LastUpdationDate:-->
			 */	 
		 	public boolean istext_visible_at_webpage(String exp_text)
		 	{
		 		String Page_Text=driver.findElement(By.tagName("body")).getText();
		 		boolean flag=Page_Text.contains(exp_text);
		 		return flag;
		 	}
		 	
		 	
		 	/*
			 * KeywordName:--> Verif expected input available at editbox
			 * Author:-->
			 * CreatedOn;-->
			 * ReviewedBy:-->
			 * Parameters used:--> Local
			 * LastUpdationDate:-->
			 */	 
		 	public boolean isInput_presented_At_Editbox(By locator,String input)
		 	{
		 		try {
		 			boolean flag=wait.until(ExpectedConditions.textToBePresentInElementValue(locator, input));
		 			return flag;
				} catch (Exception e) {
					return false;
				}
		 		
		 	}
		 
		 	/*
			 * KeywordName:--> Method verify alert presented at webpage
			 * Author:-->
			 * CreatedOn;-->
			 * ReviewedBy:-->
			 * Parameters used:--> Local
			 * LastUpdationDate:-->
			 */	
		 	public boolean isAlert_Presented()
		 	{
		 		try {
					driver.switchTo().alert();
					return true;
				} catch (Exception e) {
					return false;
				}
		 	}
		 	
		 	/*
			 * KeywordName:--> Method  verify Expected text presented at alert
			 * Author:-->
			 * CreatedOn;-->
			 * ReviewedBy:-->
			 * Parameters used:--> Local
			 * LastUpdationDate:-->
			 */	
		 	public boolean is_alert_text_presented(String exp_alert_text)
		 	{
		 		boolean flag=false;
		 		if(isAlert_Presented())
		 		{
		 			String Runtime_alert_text=driver.switchTo().alert().getText();
		 			flag=Runtime_alert_text.contains(exp_alert_text);
		 			driver.switchTo().alert().accept();
		 			return flag;
		 		}
		 		else
		 		{
		 			return flag;
		 		}
		 	}
		 	
		 	
		 	/*
			 * KeywordName:--> Close alert window
			 * Author:-->
			 * CreatedOn;-->
			 * ReviewedBy:-->
			 * Parameters used:--> Local
			 * LastUpdationDate:-->
			 */	
		 	
		 	
		 	
}
