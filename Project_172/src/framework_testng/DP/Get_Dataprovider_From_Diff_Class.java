package framework_testng.DP;

import org.testng.annotations.Test;

public class Get_Dataprovider_From_Diff_Class 
{
	
	/*
	 * How to Read Dataprovider data from Diff Testng class
	 * 		@Test(Dataprovider="Methodname",
	 * 				DataproviderClass=TesDataClassname.Class);
	 */
	
	@Test(dataProvider="user_login",dataProviderClass=TestInput_Data.class)
	public void Verify_user_Login(String UID,String PWD)
	{
		
	}

}
