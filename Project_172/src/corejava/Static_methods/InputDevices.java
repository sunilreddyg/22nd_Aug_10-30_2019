package corejava.Static_methods;

public class InputDevices 
{
	
	public static void keyboard()
	{
		System.out.println("keyboard active");
	}
	
	public static void mouse()
	{
		System.out.println("mouse active");
	}

	public static void main(String[] args) 
	{
		/*
		 * Because main method contains static access specifier
		 * we can call any static methods without object creation.
		 */
		keyboard();
		mouse();

	}

}
