package method_return_types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webtable_Using_keywords 
{
	
	public static void main(String args[]) throws InterruptedException
	{
		
		//Create object for repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		String url="http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx";
		obj.load_webpage(url);
		obj.set_timeout(30);
		
		
		String Markets_Xpath="//a[@href='https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx'][contains(.,'markets')]";
		obj.click_element(Markets_Xpath);
		
		WebElement Cell=obj.Get_Static_Webtable_Cell("//table[@id='Table4']", 1, 3);
		String Record=Cell.getText();
		System.out.println(Record);
		
		//Get dynamic cell address
		WebElement News=obj.Get_Dynaic_Webtable_Cell("//div[@id='pnl_Bse']/table", "TATMOT", 8);
		News.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
