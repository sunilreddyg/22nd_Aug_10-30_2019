package method_parameters;

import org.openqa.selenium.By;

import pageobjects.PageFactory.Using_Super_Constructor.FB_Signup;
import pageobjects.Without_pagefactory.Facebook_SignIn;

public class Run_Repository_Keywords {

	public static void main(String[] args)
	{
		
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);

	     //Only Using xpath
		obj.Enter_text("//input[@name='firstname']", "Kiran");
		obj.Enter_text("//input[@name='lastname']", "Kumar");
		
		//Using Diff locators
		obj.Enter_text(By.cssSelector("#u_0_r"), "kirankumar@gmail.com");
		obj.Enter_text(By.id("u_0_u"), "kirankumar@gmail.com");
		
		//Enter login details[using pageobjects by locator as referal]
		obj.Enter_text(Facebook_SignIn.Email, "9030278855");
		
		
		//Create object inorder to use pagefactory methods
		FB_Signup signup=new FB_Signup(obj.driver);
		obj.Enter_text(signup.Password_EB, "Hello12345");
		
		//using xpath select dropdown 
		obj.select_dropdown("//select[@title='Day']", "11");
		
	}

}
