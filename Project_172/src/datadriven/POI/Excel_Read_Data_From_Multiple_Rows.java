package datadriven.POI;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Read_Data_From_Multiple_Rows {

	public static void main(String[] args) throws Exception 
	{
		
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Acces Microsoft Excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using book referral
		XSSFSheet sht=book.getSheetAt(2);
		
		//Method return Rownumber in integerformat where it  Data starts
		int First_row=sht.getFirstRowNum();
		System.out.println(First_row);
		
		//Number of rows data available it return in integer format.
		int Last_row=sht.getLastRowNum();
		System.out.println(Last_row);
		
		
		//Iterate for number of rows data, Available in excel
		for (int i = 5; i <= Last_row; i++) 
		{
			//Target Row using loop increment value
			String UID=sht.getRow(i).getCell(0).getStringCellValue();
			String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(UID+"    "+PWD);
		}
		

	}

}
