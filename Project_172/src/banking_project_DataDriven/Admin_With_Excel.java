package banking_project_DataDriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Admin_With_Excel 
{
	
	public FileInputStream fi;
	public XSSFWorkbook book;
	public String filepath="";
	public XSSFSheet sht;
	public XSSFRow row;
	
	
	public void excel_Connection(String filepath,String sheetname)
	{
		try {
			fi=new FileInputStream(filepath);
			book=new XSSFWorkbook(fi);
			sht=book.getSheet(sheetname);
			row=sht.getRow(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void Excel_Admin_login()
	{
		excel_Connection(filepath, "Login");
		String UID=row.getCell(0).getStringCellValue();
		String PWD=row.getCell(1).getStringCellValue();
		
		System.out.println(UID);
		System.out.println(PWD);
	}
	
	
	public void Excel_New_BrancCreation()
	{
		excel_Connection(filepath, "New_Branch");
		String Bname=row.getCell(0).getStringCellValue();
		String Add1=row.getCell(1).getStringCellValue();
		
		System.out.println(Bname);
		System.out.println(Add1);
		
	}
	
	
	
	

}
