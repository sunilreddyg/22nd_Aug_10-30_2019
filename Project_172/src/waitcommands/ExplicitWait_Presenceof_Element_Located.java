package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Presenceof_Element_Located {

	public static void main(String[] args) {
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
				
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		
		//How to handle servival advertise window.[When window display optionaly]
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated
					(By.className("popupCloseButton"))).click();
			
		} catch (TimeoutException e) {
			System.out.println("offer popup window not presented");
		}
		

	}

}
