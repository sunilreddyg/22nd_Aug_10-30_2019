package banking_project.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RHP 
{

	public RHP(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css="a[href='http://ravinderbasani.com']")
	public WebElement Home_btn;
	
	@FindBy(xpath="//a[@href='personal_banking.html']")
	public WebElement Header_Personal_Banking_btn;

	@FindBy(xpath="Corporate Banking.html")
	public WebElement Header_Corporate_Banking_btn;
	
	@FindBy(id="txtuId")
	public WebElement Admin_UID_EB;
	
	@FindBy(id="txtPword")
	public WebElement Admin_PWD_EB;
	
	@FindBy(id="login")
	public WebElement Admin_login_btn;
}
