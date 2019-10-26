package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_DynamicRows_And_Static_CellData {

	public static void main(String[] args) {
		
		/*
		 * Example:--> Read data from static cells in all dynamic rows
		 */
		
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//Identify markets link
		WebElement Markets=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets.click();
	
		//Identify table
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		//Find list of rows available with in table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Iterate for number of rows
		for (int i = 1 ; i < rows.size(); i++) 
		{
			//Target Each row
			WebElement DynamicRow=rows.get(i);
			
			//Find List of cell under each dynamic row
			List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
			
			
			//get Companyname and highprice in every row
			String CompanyName=cells.get(0).getText();
			String HighPrice=cells.get(3).getText();
			
			System.out.println(CompanyName+"   "+HighPrice);
		}
			

	}

}
