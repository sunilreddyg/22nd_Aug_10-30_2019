package method_return_types;

import org.openqa.selenium.By;

public class Run_Verification_keywords
{

	public static void main(String[] args)
	{
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(20);
		
		
		if(obj.isTitle_presented("Facebook – log in or sign up"))
			System.out.println("Title verified");
		else
			System.out.println("wrong title presented");
		
		
		if(obj.is_urlpresented("https://www.facebook.com/"))
			System.out.println("Url verified");
		else
			System.out.println("wrong url presnted");
		
		
		if(obj.is_Element_presented("email"))
		{
			obj.Enter_text(By.id("email"), "9030248855");
		}
		
		
		By Exp_text_location=By.xpath("//span[contains(.,'Create an account')]");
		if(obj.is_text_presented_At_Element(Exp_text_location, "Create an account"))
			System.out.println("text presented at location");
		else
			System.out.println("text not presented at location");
		
		
		
		By firstname_EB=By.xpath("//input[@id='u_0_m']");
		obj.Enter_text(firstname_EB, "Pranil");
		if(obj.isInput_presented_At_Editbox(firstname_EB, "Pranil"))
			System.out.println("Expected input presented at editbox");
		else
			System.out.println("expected element not presented at editbox");
	}

}
