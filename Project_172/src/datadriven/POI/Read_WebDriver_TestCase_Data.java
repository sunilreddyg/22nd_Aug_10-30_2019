package datadriven.POI;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Read_WebDriver_TestCase_Data {

	public static void main(String[] args) throws Exception
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Acces Microsoft Excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using book referral
		XSSFSheet sht=book.getSheetAt(1);
		
		//Target row using above sheet referral
		XSSFRow row=sht.getRow(1);

		
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.gecko.driver", "Browser_Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); 	//Launch browser
		driver.manage().window().maximize();    //maximize browser window
		
		//Get firstCell data
		String URL=row.getCell(1).getStringCellValue();
		driver.get(URL);
		
		//Read SecondCell Data
		String Signin_Page_loc=row.getCell(2).getStringCellValue();
		driver.findElement(By.xpath(Signin_Page_loc)).click();
		
		//Get Email Location and InputData from excel
		String Email_loc=row.getCell(3).getStringCellValue();
		String Email_input=row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(Email_loc)).clear();
		driver.findElement(By.xpath(Email_loc)).sendKeys(Email_input);
		
		//Get next button location
		String Next_btn_loc=row.getCell(5).getStringCellValue();
		driver.findElement(By.xpath(Next_btn_loc)).click();
		
		
	}

}
