package datadriven.POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class Excel_Read_Data_From_NumericCell {

	public static void main(String[] args) 
	{
		
		
		try {
			//Identify location of workbook
			FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
			System.out.println("file located");
			
			//Access microsoft excel workbook
			XSSFWorkbook book=new XSSFWorkbook(fi);
			
			//Using Workbook target sheet
			XSSFSheet sht=book.getSheet("Sheet1");
			
			//Using sheet target row
			XSSFRow row=sht.getRow(1);
			
			//Target cell using index number
			Double PWD_In_Double_Frmt=row.getCell(2).getNumericCellValue();
			System.out.println(PWD_In_Double_Frmt);
			
			//Convert Double format value into int format
			int PWD_In_Int_Frmt=PWD_In_Double_Frmt.intValue();
			System.out.println(PWD_In_Int_Frmt);
			
			//Convert interger value into text format
			String PWD_in_String_Frmt=NumberToTextConverter
					.toText(PWD_In_Double_Frmt);
			System.out.println(PWD_in_String_Frmt);
			
			
			//Target Mobile number cell value
			Double Mobile_in_Double_Frmt=row.getCell(3).getNumericCellValue();
			System.out.println(Mobile_in_Double_Frmt);
			
			//Convert double format mobile number into long format.
			long Mobile_num=Mobile_in_Double_Frmt.longValue();
			System.out.println("Mobile number in long format =>"+Mobile_num);
			
			//Convert double fomrat mobile number into text format
			String Mobile_in_String_frmt=NumberToTextConverter.toText(Mobile_in_Double_Frmt);
			System.out.println("Mobile number in string format is => "+Mobile_in_String_frmt);
			
			
			String Mobile=row.getCell(5).getStringCellValue();
			System.out.println(Mobile);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
