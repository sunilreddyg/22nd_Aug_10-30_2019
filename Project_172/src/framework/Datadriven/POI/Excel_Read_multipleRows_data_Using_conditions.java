package framework.Datadriven.POI;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_multipleRows_data_Using_conditions {

	public static void main(String[] args) throws Exception {
		
		String filepath="TestData\\InputData.xlsx";
		//Target file using inputstream
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file located");
		
		//Access workbook using above file location
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//target sheet using above book referral
		XSSFSheet sht=book.getSheet("Sheet4");
		
		//Get Number of rows data available at excel.
		int Row_count=sht.getLastRowNum();
		System.out.println("Data available in number of rows is =>"+Row_count);
		
		//Iterate for expected range
		for (int i = 5; i <= Row_count; i++) 
		{
			XSSFRow DynamicRow=sht.getRow(i);
			
			//get Execution status
			String Exe_status=DynamicRow.getCell(2).getStringCellValue();
			
			if(Exe_status.equalsIgnoreCase("y"))
			{
				String UID=DynamicRow.getCell(0).getStringCellValue();
				
				
				//Get Scenario type from excel
				String Stype=DynamicRow.getCell(3).getStringCellValue();
				
				if(Stype.equals("text"))
				{
					System.out.println(UID+"\t"+"text captured");
				}
				else if(Stype.equals("object"))
				{
					System.out.println(UID+"\t"+" object verified");
				}
				else if(Stype.equals("alert"))
				{
					System.out.println(UID+"\t"+"alert handled");
				}
				else
					System.out.println("Stype mismatch at excel");
				
			}
			
		}

	}

}
