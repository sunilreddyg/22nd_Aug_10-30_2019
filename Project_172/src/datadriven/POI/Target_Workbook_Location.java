package datadriven.POI;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Target_Workbook_Location {

	public static void main(String[] args) throws Exception
	{	
		//Target workbook location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Access excel workbook using above location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get Sheet using above book referal
		XSSFSheet sht=book.getSheet("Sheet1");
		
		//usng sheet referal target row
		XSSFRow row=sht.getRow(1);
		
		//Using row referal target cell
		XSSFCell cell=row.getCell(0);
		
		String url=cell.getStringCellValue();
		System.out.println(url);
		
		//using row referral target cell
		String CID=row.getCell(1).getStringCellValue();
		System.out.println(CID);
		
		/*
		 * CellData to retrieve we hava diff methods available
		 * 			getStringCellvalue
		 * 			getNumericCellValue
		 * 			getBooleanCellvalue
		 * 			getDateCellValue
		 */
		
	}

}
