package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifying_Dropdown_Options 
{

	public static void main(String[] args) throws Exception 
	{
		//set runtime environment variable
		String driver_path="Browser_Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driver_path);
						

		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		String Cities[]= {"Please select state first"
				,"South Andaman"
				,"yfiosdflj"
				,"East Siang"
				,"Guwahati"
				,"Gaya"};
		
		
		//IDentify state dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		
		//Find list of options tag element under state dropdown
		List<WebElement> All_States=State_Dropdown.findElements(By.tagName("option"));
		
		//get Count of List of option
		int StateCount=All_States.size();
		
		//Apply for loop to iteate expected number of times
		for (int i = 0; i < 6; i++) 
		{
			 //Get each option tag using Index number
			WebElement State_Element=All_States.get(i);
			//Get Name of State Element
			String State_name=State_Element.getText();
			//Click Each State option using index number
			State_Element.click();
			Thread.sleep(3000);  //Static timeout to load cities
			
			//Identify City Dropdown
			WebElement City_Dropdown=driver.findElement(By.id("customCity"));
			//get All Dropdown Options
			String CityOptions=City_Dropdown.getText();
			//System.out.println("========>"+State_name+"\n"+CityOptions);
			
			if(CityOptions.contains(Cities[i]))
			{
				System.out.println("for state ==> "+State_name+"===> City Displayed ==>"+Cities[i]+"   Result==>Testpass");
			}
			else
			{
				System.out.println("for state ==> "+State_name+"===> City Displayed ==>"+Cities[i]+"   Result==>TestFail");
			}
			
		}

	}

}
