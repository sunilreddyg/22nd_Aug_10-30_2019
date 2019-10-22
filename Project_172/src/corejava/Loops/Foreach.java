package corejava.Loops;

public class Foreach 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Foreach:-->
		 * 		Foreach is designed to read array next values.
		 * 
		 * 		Syntax:-->
		 * 					for(Datatype variablename : Arrayname)
		 * 					{
		 * 
		 * 					}
		 */
		
		
		//Example:--> Print array values.
		String tools[]= {"IDE","RC","WD","Appium","Cucumber"};
		
		//Using Foreach iterate for number of objecs at array
		for (String eachtool : tools) 
		{
			System.out.println(eachtool);
		}
		
		
		//Example print integer array values
		int num[]= {100,200,300,400,500,600,700};
		//Applying foreach loop
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		
		
;
	}

}
