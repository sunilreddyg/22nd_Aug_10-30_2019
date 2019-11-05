package encapsulation;

public class Run_UserData {

	public static void main(String[] args) 
	{
		
		//create object for class
		UserData obj=new UserData();
		
		//We can change public variable at runtime[There is chance to misusage data]
		obj.empid="MQE002";
	
		//At runtime assign value to method parameters
		obj.set_name("vijay");
		obj.set_email("vijay@mindqsystems.com");
		obj.set_mobile("9542124578");
		
		
		//Get method return values
		String Runtime_name=obj.get_name();
		System.out.println(Runtime_name);
		
		String Runtime_email=obj.get_email();
		System.out.println(Runtime_email);
		
		
		String Runtime_mobile=obj.get_mobile();
		System.out.println(Runtime_mobile);
		
		
		
		
		
		
		

	}

}
