package framework_testng.DP.Excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_DataProvider_Intergration
{
	XSSFWorkbook book;
	XSSFSheet sht;
	XSSFRow row;
	XSSFCell cell;
	String filepath="TestData\\InputData.xlsx";
	
	
	@Test(dataProvider="get_data")
	public void userLogin(String UID,String PWD)
	{
		
	}
	
	
	
	
	@DataProvider
	public String [][] get_data()
	{
		int Rcount=sht.getLastRowNum();
		String data[][];
		data=new String[Rcount+1][2];
		for (int i = 0; i <= Rcount; i++) 
		{
			//Iterate for number of cells
			for (int j = 0; j < 2; j++) 
			{
				data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		
		return data;
	}
	
	
	
	
	
	
	@AfterSuite
	public void Pre_Condition() throws IOException
	{
		FileInputStream fi=new FileInputStream(filepath);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet("Sheet7");
		
	}
	
	
	@BeforeSuite
	public void Createoutput() throws IOException
	{
		FileOutputStream fo=new FileOutputStream("TestData\\OP1.xlsx");
		book.write(fo);
		book.close();
	}

}
