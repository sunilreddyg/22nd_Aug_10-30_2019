package junit_framework;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Junit_WebDriver_Testcase
{
	static String firefox_path="Browser_Drivers\\geckodriver.exe";
	static WebDriver driver;
	static String url="http://facebook.com";
	public @Rule TestName test=new TestName();  //get Current constructed method name
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", firefox_path);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get(url);
		
	}

	@After
	public void tearDown() throws Exception 
	{
		Thread.sleep(5000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+test.getMethodName()+".png"));
	}

	@Test
	public void Tc001_Verify_Signup_page() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		String Exp_title="Sign up for Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Signup page title verified");
	}
	
	
	@Test
	public void Tc002_Verify_SignIn_page() 
	{
		driver.findElement(By.xpath("//a[@title='Log in to Facebook']")).click();
		String Exp_title="Log in to Facebook | Facebook";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Signin page title verified");
	}
	
	@Test
	public void Tc003_Verify_Messenger_page() throws Exception 
	{
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Thread.sleep(5000);
		String Exp_title="Messenger";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Messenger page title verified");
	}
	
	@Test
	public void Tc004_Verify_Games_page() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Games')]")).click();
		String Exp_title="Games";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("Games page title verified");
	}
	
	@Test
	public void Tc005_Verify__page_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Pages')]")).click();
		String Exp_title="Pages directory";
		Assert.assertEquals(Exp_title, driver.getTitle());
		System.out.println("pages link title verified");
	}
}
