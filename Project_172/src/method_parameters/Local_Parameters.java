package method_parameters;

public class Local_Parameters 
{
	
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println(name);
	}
	
	public void print_tool(String toolname)
	{
		String name=toolname;
		System.out.println(name);
	}
	
	public void print_tool(String toolname,double price)
	{
		String name=toolname;
		System.out.println(name+" price is => "+price);
	}
	
	

	public static void main(String[] args) 
	{
		
		//Create object for Class
		Local_Parameters obj=new Local_Parameters();
		//Calling method without argument
		obj.print_tool();
		
		//Calling method with argument
		obj.print_tool("Appium");
		obj.print_tool("Cucumber");
		
		//Calling method with multiple argument
		obj.print_tool("IDE", 1000.00);

	}

}
