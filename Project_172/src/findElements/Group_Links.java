package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links {

	public static void main(String[] args) throws Exception {
		//set runtime environment variable
		String driver_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
						

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement Footer_Area;
		Footer_Area=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
		
		//Find list of links available under footer area
		List<WebElement> All_links;
		All_links=Footer_Area.findElements(By.tagName("a"));

		//Get Count of links
		int LinksCount=All_links.size();
		
		//Iterate for number of links
		for (int i = 0; i < LinksCount; i++) 
		{
			//Target Each link
			WebElement Each_link=All_links.get(i);
			//Get name of link
			String Linkname=Each_link.getText();
			String Linkhref=Each_link.getAttribute("href");
			System.out.println(Linkname+"=>    "+Linkhref);
			
			Each_link.click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			//Restore all page refernces to avlid <<" staleelementreference excepion">>
			Footer_Area=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
			All_links=Footer_Area.findElements(By.tagName("a"));
		}
		
		
		
		
	}

}
