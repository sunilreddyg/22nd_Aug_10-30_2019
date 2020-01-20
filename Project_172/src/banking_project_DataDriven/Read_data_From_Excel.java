package banking_project_DataDriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data_From_Excel {

	public static void main(String[] args) throws Exception 
	{
		

		  
		  String filepath="C:\\Users\\Administrator\\git\\22nd_Aug_10-30_2019\\Project_172\\src\\banking_project_DataDriven\\";
		  FileInputStream fi=new FileInputStream(filepath+"Admin.xlsx");
		  System.out.println("file located");
		  
		  XSSFWorkbook book=new XSSFWorkbook(fi);
		  
		  XSSFSheet sht=book.getSheet("Login");
		  
		  String UID=sht.getRow(1).getCell(0).getStringCellValue();
		  System.out.println(UID);
		  
	}

}
