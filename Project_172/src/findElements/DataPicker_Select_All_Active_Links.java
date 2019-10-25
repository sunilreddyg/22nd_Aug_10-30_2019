package findElements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker_Select_All_Active_Links 
{

	public static void main(String[] args) throws Exception {
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//Click to open calendar 
		WebElement Open_Calendar=driver.findElement(By.className("cal_openLink"));
		Open_Calendar.click();
		Thread.sleep(2000);
		
		
		
		//Iterate to read next month
		for (int i = 0; i < 5; i++) 
		{
			//Identifying active month
			WebElement Active_month;
			Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			//Find list of active links
			List<WebElement> Active_links;
			Active_links=Active_month.findElements(By.tagName("a"));
			System.out.println("Number of active links are => "+Active_links.size());
			
			//Iterate for number of acive links
			for (int j = 0; j < Active_links.size(); j++) 
			{
				//Target Each link using Dynamic iteration
				Active_links.get(j).click();
				//Thread.sleep(1000);
				
				//Reopen calendar
				Open_Calendar.click();
				//Thread.sleep(1000);
				
				//Restore all page references to avoid "staleelementreference exception"
				Active_month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				Active_links=Active_month.findElements(By.tagName("a"));
			}
			
			
			WebElement Next_btn=driver.findElement(By.xpath("//a[@title='Next month']"));
			Next_btn.click();
			Thread.sleep(3000);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
