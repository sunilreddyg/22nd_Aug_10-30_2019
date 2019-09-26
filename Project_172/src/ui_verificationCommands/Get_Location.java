package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {

	public static void main(String[] args) 
	{
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  		//Launch browser
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx"); 	//Load webpage
		driver.manage().window().maximize();    	//maximize browser window
				
		
		WebElement Sensex_tab=driver.findElement(By.id("InvestRec"));
		
		Point Obj_point=Sensex_tab.getLocation();
		int obj_x=Obj_point.getX();
		int obj_y=Obj_point.getY();
		System.out.println("Object x coordinates are => "+obj_x);
		System.out.println("Object y coordinates are => "+obj_y);
		
		
		//Verify element visibility using object coordinates
		if(obj_x > 0)
			System.out.println("object visible at webpage");
		else
			System.out.println("object not visible at webpage");
		
		
		
		
		
		

	}

}
