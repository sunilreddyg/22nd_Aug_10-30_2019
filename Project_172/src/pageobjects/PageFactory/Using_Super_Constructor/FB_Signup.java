package pageobjects.PageFactory.Using_Super_Constructor;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FB_Signup 
{
	WebDriver driver;
	public FB_Signup(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement Firstname_EB;
	
	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement Surname_EB;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	public WebElement Mobile_OR_Email_EB;
	
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	public WebElement ReEnter_Mobile_OR_Email_EB;
	
	@FindBy(xpath = "//input[@data-type='password']")
	public WebElement Password_EB;
	
	
	@FindBy(xpath = "//select[@aria-label='Day']")
	public WebElement Day_DD;
	
	@FindBy(xpath = "//select[@aria-label='Month']")
	public WebElement Month_DD;
	
	@FindBys(@FindBy(xpath="//select[@aria-label='Month']/option"))
	public List<WebElement> Month_Options;
	
	@FindBy(xpath = "//select[@name='birthday_year']")
	public WebElement Year_DD;
	
	
	/*
	 * Method:--> PerForm User Registration
	 */
	public void User_reg()
	{
		driver.get("http://facebook.com");
		
		Firstname_EB.clear();
		Firstname_EB.sendKeys("Akash");
		
		Surname_EB.clear();
		Surname_EB.sendKeys("Anand");
		
		Mobile_OR_Email_EB.clear();
		Mobile_OR_Email_EB.sendKeys("AkashAnand@gmail.com");
		
		ReEnter_Mobile_OR_Email_EB.clear();
		ReEnter_Mobile_OR_Email_EB.sendKeys("AkashAnand@gmail.com");
	}
	
	

}
