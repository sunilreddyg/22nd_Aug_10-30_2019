package datadriven.POI;

import java.io.FileInputStream;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Multiple_Rows_With_Mixed_Data
{

	public static void main(String[] args) throws Exception 
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("file located");
		
		//Acces Microsoft Excel workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Target sheet using book referral
		XSSFSheet sht=book.getSheetAt(6);
	
		//Number of rows data available it return in integer format.
		int Last_row=sht.getLastRowNum();
		
		//iterate for number of rows
		for (int i = 1; i <= Last_row; i++) 
		{
			//target row
			XSSFCell Rcell=sht.getRow(i).getCell(0);
			
			String CellData=null;
			if(Rcell.getCellType()==Rcell.CELL_TYPE_NUMERIC)
			{
				Double Cell_In_double_Frmt=Rcell.getNumericCellValue();
				CellData=NumberToTextConverter.toText(Cell_In_double_Frmt);
			}
			else if(Rcell.getCellType()==Rcell.CELL_TYPE_STRING)
			{
				CellData=Rcell.getStringCellValue();
			}
			
			System.out.println(CellData);
			
		}
		
		
		
	}

}
