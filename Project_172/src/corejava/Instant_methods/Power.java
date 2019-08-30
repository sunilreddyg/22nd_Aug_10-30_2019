package corejava.Instant_methods;

public class Power 
{

	public void ON()
	{
		System.out.println("Power on successfull");
	}
	
	public void OFF()
	{
		System.out.println("Power off successfull");
	}
	
	public static void main(String args[])
	{
		//Call Instant methods by creation of object to class
		new Power().ON();
		new Power().OFF();
	}
}
