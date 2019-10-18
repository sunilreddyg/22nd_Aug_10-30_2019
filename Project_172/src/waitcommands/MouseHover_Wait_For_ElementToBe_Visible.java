package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover_Wait_For_ElementToBe_Visible {

	public static void main(String[] args) {
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
						
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
		WebElement Jobs_menu=driver.findElement(By.xpath("//div[@class='mTxt'][text()='Jobs']"));
		//new Actions(driver).moveToElement(Jobs_menu).perform();
		
		//Enable Explicit wait on automation browser
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("(//a[@target='_blank'][contains(.,'Register Now')])[1]"))).click();
		System.out.println("Register now option visible at webpage");
		
		
	}

}
