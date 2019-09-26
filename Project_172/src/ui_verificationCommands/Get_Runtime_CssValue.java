package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_CssValue {

	public static void main(String[] args) throws Exception 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx"); 	//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
				
		
		WebElement Sensex_tab=driver.findElement(By.id("InvestRec"));
		//select Sensex tab
		Sensex_tab.click();
		Thread.sleep(5000);
		
		
		String Runtime_Bg_Color=Sensex_tab.getCssValue("background-color");
		System.out.println("bg color  is "+Runtime_Bg_Color);
		
		String font_size=Sensex_tab.getCssValue("font-size");
		System.out.println("Font size available at button is => "+font_size);
		
		String Exp_Bg_color="rgba(231, 120, 23, 1)";
		
		
		
		
		
		
		
		
	}

}
