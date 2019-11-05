package inheritance_with_keywords;

public class Run_Testcase extends Testcase
{

	public static void main(String[] args) 
	{
		
		Testcase obj=new Run_Testcase();
		obj.setup_browser();
		obj.Tc001_userlogin_with_invalidData();
		obj.Close_browser(); //From parent-repository class

	}

}
