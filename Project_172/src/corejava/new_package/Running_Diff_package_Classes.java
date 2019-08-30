package corejava.new_package;

import corejava.Instant_methods.Power;
import corejava.Static_methods.InputDevices;

public class Running_Diff_package_Classes 
{

	public static void main(String[] args) 
	{
		//Calling static methods
		InputDevices.keyboard();
		InputDevices.mouse();
		
		//calling instant methods
		Power obj=new Power();
		obj.ON();
		obj.OFF();
		
	}

}
