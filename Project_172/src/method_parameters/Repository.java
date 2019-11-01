package method_parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
			 
			 
			 
			 
			 


}
