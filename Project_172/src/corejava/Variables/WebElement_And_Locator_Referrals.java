package corejava.Variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElement_And_Locator_Referrals 
{

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.facebook.com"); //Load webpage
		driver.manage().window().maximize();    //maximize browser window
				
		//Regular syntax withotu reusable
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//Reusing WebElement Locator
		WebElement Password_Editbox=driver.findElement(By.id("pass"));
		Password_Editbox.clear();
		Password_Editbox.sendKeys("Hello1234");
		
		//Reusing Locator & WebElement
		By Login_btn_locator=By.id("loginbutton");
		WebElement Login_btn=driver.findElement(Login_btn_locator);
		Login_btn.click();
		
		
	
	}

}
