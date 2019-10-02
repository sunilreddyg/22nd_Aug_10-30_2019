package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_frame_Using_Element_Reference {

	public static void main(String[] args) throws Exception {
		
		//Set Runtime Environment variable for browser driver
		System.setProperty("webdriver.chrome.driver",  "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //Launch chrome browse
		driver.get("https://www.redbus.in/hotels/");     //load webpage to browser window
		driver.manage().window().maximize();	//maximize browser window

		
		//Using javascript executor scroll page down
		((JavascriptExecutor)driver).executeScript("scroll(100,200)");
		Thread.sleep(3000);
		
		//identifying location at webpage
		WebElement Signin_btn=driver.findElement(By.xpath("//button[@class='login-btn'][contains(.,'Sign in')]"));
		Signin_btn.click();
		Thread.sleep(3000);
		
		
		//Identify frame using xpath
		WebElement Modal_Frame=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		//Apply switch to frame using frame element reference
		driver.switchTo().frame(Modal_Frame);
		
		
		WebElement Mobile_number=driver.findElement(By.xpath("//input[contains(@id,'mobileNoInp')]"));
		Mobile_number.clear();
		Mobile_number.sendKeys("9030248855");
		
		
	}

}
