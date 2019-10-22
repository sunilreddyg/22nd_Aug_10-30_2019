package corejava.Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_interface {

	public static void main(String[] args) 
	{
		
		
		Set<String> set=new HashSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("WD");
		set.add("Appium");
		set.add("Cucumber");
		set.add("GRID");
		set.add("Robot");
		
	
		for (String eachobject : set) 
		{
			System.out.println(eachobject);
		}
		
		
		
	}

}
