package inheritance_with_keywords;

import org.openqa.selenium.By;

public class Testcase extends Repository
{
	
	public void setup_browser()
	{
		launch_browser("chrome");
		load_webpage("http://gmail.com");
		set_timeout(20);
	}
	
	public void Tc001_userlogin_with_invalidData()
	{
		Enter_text("//input[@aria-label='Email or phone']", "qadarshan@gmail.com");
		//driver referral from parent class repository
		driver.findElement(By.xpath("(//span[contains(.,'Next')])[2]")).click();
	}
	
}
