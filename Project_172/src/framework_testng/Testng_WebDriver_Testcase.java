package framework_testng;

import java.io.File;
import java.lang.reflect.Method;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_WebDriver_Testcase 
{
	
	 String firefox_path="Browser_Drivers\\geckodriver.exe";
	 WebDriver driver;
	 String url="http://facebook.com";

	@BeforeClass
	public  void setUpBeforeClass() 
	{
		System.setProperty("webdriver.gecko.driver", firefox_path);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public  void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@BeforeMethod
	public void setUp() throws Exception 
	{
		driver.get(url);
		
	}

	@AfterMethod
	public void tearDown(Method method) throws Exception 
	{
		Thread.sleep(5000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+method.getName()+".png"));
	}
	
	
	@Test
	public void Tc001_Verify_Signup_page() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		String Exp_title="Sign up for Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		Reporter.log("Signup page title verified");
	}
	
	
	@Test
	public void Tc002_Verify_SignIn_page() 
	{
		driver.findElement(By.xpath("//a[@title='Log in to Facebook']")).click();
		String Exp_title="Log in to Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		Reporter.log("Signin page title verified");
	}
	
	@Test
	public void Tc003_Verify_Messenger_page() throws Exception 
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Thread.sleep(5000);
		String Exp_title="Messenger";
		Assert.assertEquals(driver.getTitle(), Exp_title);
		Reporter.log("Messenger page title verified");
	}
	
	@Test
	public void Tc004_Verify_Games_page() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Games')]")).click();
		String Exp_title="Games";
		Assert.assertEquals(driver.getTitle(), Exp_title);
		Reporter.log("Games page title verified");
	}
	
	@Test
	public void Tc005_Verify__page_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Pages')]")).click();
		String Exp_title="Pages directory";
		Assert.assertTrue(ExpectedConditions.titleIs(Exp_title).apply(driver));
		Reporter.log("pages link title verified");
	}

}
