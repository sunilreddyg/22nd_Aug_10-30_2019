package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Run_Remote_Webdriver {

	public static void main(String[] args) throws MalformedURLException 
	{
		
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WINDOWS);
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		driver.get("http://google.com");
	}

}
