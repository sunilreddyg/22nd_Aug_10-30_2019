package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestNG_Test
{
  @Test
  public void tc001()
  {
	 Reporter.log("Tc001 Browser launch successfull",true);
  }
  
  @Test
  public void tc002()
  {
	 Reporter.log("Tc002 Application load successfull",true);
  }
  
  @Test
  public void tc003()
  {
	 Reporter.log("Tc003 User Signin completed",true);
  }
}
