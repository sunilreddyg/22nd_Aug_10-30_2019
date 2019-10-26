package findElements;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Get_Selected_Item_To_Cart 
{

	public static void main(String[] args) throws Exception {
		
		//Set Runtime environment variable for chrome driver
		String chrome_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome_path);
					    
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/search?p[]=facets.brand%255B%255D%3DHonor&sid=tyy%2F4io&otracker=CLP_filters&otracker=nmenu_sub_Electronics_0_Honor");
		driver.manage().window().maximize();
		
		
		//Identifying location of Products
		WebElement Products_Area;
		Products_Area=driver.findElement(By.cssSelector("#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div > div:nth-child(2)"));
		
		List<WebElement> All_products;
		All_products=Products_Area.findElements(By.className("bhgxx2"));
		System.out.println("Product count is => "+All_products.size());
		
		
		WebElement Footer;
		Footer=All_products.get(25);
		
		List<WebElement> pages;
		pages=Footer.findElements(By.className("_2Xp0TH"));
		
		boolean flag=false;
		for (int i = 1; i < pages.size(); i++) 
		{
			
			
			//Iterate for number of products
			for (int j =1; j < All_products.size()-2; j++) 
			{
				
				//Get Each Product
				WebElement EachProduct=All_products.get(j);
				
				WebElement ProductName_loc=EachProduct.findElement(By.className("_3wU53n"));
				String ProductName=ProductName_loc.getText();
				//System.out.println(ProductName);
				
				
				if(ProductName.equals("Honor 7C (Blue, 32 GB)"))
				{
					WebElement Mobile_Price_loc=EachProduct.findElement(By.cssSelector("div[class='_1vC4OE _2rQ-NK']"));
					String Mobile_Price=Mobile_Price_loc.getText();
					System.out.println(ProductName+"   "+Mobile_Price);
					
					//Click To open prodcut
					EachProduct.findElement(By.className("_31qSD5")).click();
				
					//Switch to window
					Set<String> allwindows=driver.getWindowHandles();
					Iterator<String> itr=allwindows.iterator();
					
					String Home=itr.next();
					String Product_win=itr.next();
					
					driver.switchTo().window(Product_win);
					
					//click addtocart button
					WebElement Cart=driver.findElement(By.xpath("//button[contains(.,'ADD TO CART')]"));
					new Actions(driver).moveToElement(Cart).pause(3000).perform();
					
					flag=true;
					break;  //Stop iteration of innerloop.
					
					
					
				
				}
			}
			
			
			if(flag==true)
			{
				break;
			}
			
			pages.get(i).click();
			Thread.sleep(5000);
			
			//Restore all idenification because page is changing..
			Products_Area=driver.findElement(By.cssSelector("#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div > div:nth-child(2)"));
			All_products=Products_Area.findElements(By.className("bhgxx2"));
			Footer=All_products.get(25);
			pages=Footer.findElements(By.className("_2Xp0TH"));
		}
		
		
	}

}
