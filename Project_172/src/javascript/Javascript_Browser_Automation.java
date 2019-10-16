package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Browser_Automation 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
					    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type text into editbox using javascrip
		js.executeScript("document.getElementById('email').value='Darshan'");
		js.executeScript("document.getElementById('pass').value='Hello12345'");

		
		//javascript code,identify location using xpath
		WebElement Firstname_EB=driver.findElement(By.xpath("//input[@aria-label='First name']"));
		js.executeScript("arguments[0].value='Rahul'", Firstname_EB);
		
		
		//Select dropdown using javascript [use dropdown option value ]
		js.executeScript("document.getElementById('day').value='22'");
		js.executeScript("document.getElementById('month').value='11'");
		js.executeScript("document.getElementById('year').value='1990'");
		
		//Identify Female radio button using xpath
		WebElement Female_Rbtn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].checked=true", Female_Rbtn);
		Thread.sleep(3000);
		
		//Identify male radio button using xpath
		WebElement Male_Rbtn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].click()", Male_Rbtn);
		
	}

}
