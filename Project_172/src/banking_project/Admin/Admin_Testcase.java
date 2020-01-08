package banking_project.Admin;

import org.openqa.selenium.WebDriver;

public class Admin_Testcase 
{
	WebDriver driver;
	RHP rhp;
	
	
	public Admin_Testcase(WebDriver driver) 
	{
		this.driver=driver;
		rhp=new RHP(driver);
	}

	
	public void Admin_login(String UID,String PWD)
	{
		
		rhp.Admin_UID_EB.clear();
		rhp.Admin_UID_EB.sendKeys(UID);
		
		rhp.Admin_PWD_EB.clear();
		rhp.Admin_PWD_EB.sendKeys(PWD);
		
		rhp.Admin_login_btn.click();
	}

}
