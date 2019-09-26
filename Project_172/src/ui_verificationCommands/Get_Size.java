package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size {

	public static void main(String[] args) {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx"); 	//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
				
		
		WebElement Sensex_tab=driver.findElement(By.id("InvestRec"));
		
		//Get Object Dimension
		Dimension Obj_dim=Sensex_tab.getSize();
		//Using object dimension get element height and width
		int obj_height=Obj_dim.getHeight();
		int obj_width=Obj_dim.getWidth();
		System.out.println("object height in dimension => "+obj_height);
		System.out.println("object width in dimension => "+obj_width);
		
		
		//verify object visibility at webpage
		if(obj_height > 0)
			System.out.println("object visible at webpage");
		else
			System.out.println("object not visible at webpage");
		
		
		
		
		
		
	}

}
