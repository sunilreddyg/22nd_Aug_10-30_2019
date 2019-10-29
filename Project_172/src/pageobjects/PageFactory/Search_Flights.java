package pageobjects.PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Search_Flights 
{
	
	
	@FindBy(how=How.ID,using="OneWay") 
	public WebElement Oneway_Rbtn;
	
	@FindBy(how=How.ID,using="RoundTrip")
	public WebElement Roundtrip_Rbtn;
	
	@FindBy(xpath="//input[@id='MultiCity']")
	public WebElement Multiple_Trip_Rbtn;
	
	@FindBy(xpath="//div[@id='homeErrorMessage']")
	public WebElement Home_error_msg;
	
	@FindBy(xpath = "//h1[contains(.,'Search flights')]")
	public WebElement Page_header;
	
	@FindBy(how=How.XPATH,using="//strong[contains(.,'One way')]")
	public WebElement Oneway_Rbtn_label;
	
	@FindBy(xpath = "(//strong[contains(.,'Round trip')])[1]")
	public WebElement Roundtrip_Rbtn_Label;
	
	@FindBy(xpath = "//input[@id='FromTag']")
	public WebElement From_EB;
	
	@FindBy(xpath = "//a[contains(.,'Hyderabad, IN - Rajiv Gandhi International (HYD)')]")
	public WebElement Hyd_City_Airport;
	
	@FindBy(xpath = "//input[@id='ToTag']")
	public WebElement Arrival_EB;
	
	@FindBy(xpath = "//a[contains(.,'New Delhi, IN - Indira Gandhi Airport (DEL)')]")
	public WebElement Delhi_City_Airport;
	
	@FindBy(xpath = "//input[@id='SearchBtn']")
	public WebElement Flight_Search_btn;
	
	
	/*
	 * Methodname:--> Search flight
	 */
	public void flight_search_oneway_trip()
	{
		if(!Oneway_Rbtn.isSelected())
		{
			Oneway_Rbtn.click();
		}
		
		From_EB.clear();
		From_EB.sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Hyd_City_Airport.click();
		
		Arrival_EB.clear();
		Arrival_EB.sendKeys("D"+Keys.ARROW_RIGHT+"EL");
		Delhi_City_Airport.click();
		
		Flight_Search_btn.click();
		
		
	}
	
	/*
	 * Methodname:--> Search flight
	 */
	public void flight_search_roundtrip()
	{
		if(!Roundtrip_Rbtn.isSelected())
		{
			Roundtrip_Rbtn.click();
		}
		
		From_EB.clear();
		From_EB.sendKeys("H"+Keys.ARROW_RIGHT+"YD");
		Hyd_City_Airport.click();
		
		Arrival_EB.clear();
		Arrival_EB.sendKeys("D"+Keys.ARROW_RIGHT+"EL");
		Delhi_City_Airport.click();
		
		Flight_Search_btn.click();
		
		
	}
	
	
	
	
	
}
