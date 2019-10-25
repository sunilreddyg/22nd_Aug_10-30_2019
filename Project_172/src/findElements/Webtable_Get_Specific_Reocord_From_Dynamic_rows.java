package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Get_Specific_Reocord_From_Dynamic_rows {

	public static void main(String[] args)
	{

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
		
		//Find list of rows under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//target specific row using index number
		WebElement SelectedRow=rows.get(6);
		
		//Find list of cells under selected row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		String Companyname=cells.get(0).getText();
		String HighPrice=cells.get(3).getText();
		System.out.println(Companyname+"   "+HighPrice);
	}

}
