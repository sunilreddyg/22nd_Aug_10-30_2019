package framework_testng.DP;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InputData 
{
	
	@Test (dataProvider="user_info")
	public void Enter_user_info(String UID,String PWD,String EID)
	{
		
	}
	
	
	
	@DataProvider
	public String[][] user_info()
	{
		
		String data[][]=
			{
					{"user1","pwd1","9030"},
					{"user2","pwd3","9040"},
					{"user3","pwd3","9050"},
					{"user4","pwd4","9060"},
			};
			
		return data;
		
	}

}
