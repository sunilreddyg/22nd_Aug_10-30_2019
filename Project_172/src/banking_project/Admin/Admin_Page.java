package banking_project.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Page {

	public Admin_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css="a[href='http://ravinderbasani.com']")
	public WebElement Admin_Home_btn;
	
	

}
