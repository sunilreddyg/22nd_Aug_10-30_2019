package framework_testng.DP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng_Reading_Data_From_Excel 
{
	
	XSSFWorkbook book;
	XSSFSheet sht;
	XSSFRow row;
	XSSFCell cell;
	String filepath="TestData\\InputData.xlsx";
	
	
	@Test
	public void userLogin()
	{
		int Rcount=sht.getLastRowNum();
		for (int i = 5; i <= Rcount; i++) 
		{
			
			//Read First cell data
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			sht.getRow(i).createCell(2).setCellValue("Testpass");
		}
	}
	
	
	@BeforeClass
	public void Pre_Condition() throws IOException
	{
		FileInputStream fi=new FileInputStream(filepath);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet("Sheet3");
		
	}
	
	
	@AfterClass
	public void Createoutput() throws IOException
	{
		FileOutputStream fo=new FileOutputStream("TestData\\OP1.xlsx");
		book.write(fo);
		book.close();
	}

}
