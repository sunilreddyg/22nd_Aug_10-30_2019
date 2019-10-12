package robot_actions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString_Using_Clipboard 
{

	public static void main(String[] args) throws Exception 
	{
		//launching notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
				
		String text="Selenium automates browsers. That's it!";
		
		//First select string before copy to clipboard
		StringSelection Stext=new StringSelection(text);
		//Get System defalt clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Copy content to clipboard
		clipboard.setContents(Stext, Stext);
		
	
		//Create object for Robot[AWT]
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press Control+V shortcut to paste action from clipboard
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//We Must release down keys after completed action
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}

}
