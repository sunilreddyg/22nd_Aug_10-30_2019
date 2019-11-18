package framework_testng.DP.Excel;

import org.testng.annotations.Test;

public class Run_Testng_DataProvider_Using_Excel 
{
	
	@Test(dataProvider="get_data"
			,dataProviderClass=Excel_DataProvider_Intergration.class)
	public void Get_user_data(String UID,String PWD)
	{
		
	}

}
