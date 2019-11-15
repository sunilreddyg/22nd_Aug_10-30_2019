package framework_testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion_Validations {

	
	@Test
	public void tc001()
	{
		Assert.assertEquals("MQ", "MQ");
		Reporter.log("Comparision successfull");
	}
	
	@Test
	public void tc002()
	{
		Assert.assertTrue(true);
		Reporter.log("Comparision is true");
	}
	
	@Test
	public void tc003()
	{
		Assert.assertEquals("MQ", "MQ1");
		Reporter.log("Comparision successfull");
	}
	
	@Test
	public void tc004()
	{
		Assert.assertTrue(false);
		Reporter.log("Comparision is true");
	}
	
	

}
