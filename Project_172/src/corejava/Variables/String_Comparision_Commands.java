package corejava.Variables;

public class String_Comparision_Commands {

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 		String is a not only datatype, Also
		 * 		called as class.Becuase String class
		 * 		contains set of events[Methods] to to validate
		 * 		Stored characters.
		 */
		
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings
		 * 		and return boolean value true/false.
		 * 		=> Equals is a casesensitive comparison
		 */
		 String Exp_res="Account Created";
		 String Act_res="account created";
		
		boolean flag=Act_res.equals(Exp_res);
		System.out.println("equal comparision is => "+flag);
		
		/*
		 * EqualIgnoreCase:-->
		 * 		Method verify equal comparision by ignoring casesensitive.
		 * 		And return boolean value true/false.
		 */
		boolean flag1=Act_res.equalsIgnoreCase(Exp_res);
		System.out.println("EqualIgnore case comparision is => "+flag1);
		
		/*
		 * contains:-->
		 * 		Verify sub-sequence charactes availale and main string, And
		 * 		return boolean value true/false.
		 */
		String Status="Account Created 100 Successfull";
		boolean flag2=Status.contains("100");
		System.out.println("Expected id available status is => "+flag2);
		
		/*
		 * SubString:-->
		 * 		Method usefull to get substring from mainString.
		 */
		String AccountNum="1234567891234568";
		String Last_digits=AccountNum.substring(12);
		System.out.println("Account Last digit numbers are => "+Last_digits);
		
		String Middle_digits=AccountNum.substring(4, 12);
		System.out.println("Account number middle digits are => "+Middle_digits);
		
		
		/*
		 * length:-->
		 * 		Method return number of characters count, In interger
		 * 		format.
		 */
		String Mobile="9030248855";
		int len=Mobile.length();
		System.out.println("Mobile number length is => "+len);
		
		if(len==10)
			System.out.println("10 digit mobile number");
		else
			System.out.println("Wrong mobile number");
		
		/*
		 * StartsWith:-->
		 * 		Method verify given characters starts with expected
		 * 		characters, And return boolean value true/false.
		 */
		String IFSC_Code="HDFC0000123";
		boolean flag3=IFSC_Code.startsWith("HDFC");
		System.out.println("IFSC Code start status is => "+flag3);
		
		
		/*
		 * Trim:--> Method trim extra spaces available at string
		 */
		String pincode="   500074    ";
		int OldPin=pincode.length();
		System.out.println("Before trim pin number count is => "+OldPin);
		
		//trim extra spaces
		String New_pin=pincode.trim();
		int New_pin_length=New_pin.length();
		System.out.println("After trim pin number count is => "+New_pin_length);
		
		
		/*
		 * isEmpty:-->
		 * 		Method verify string empty status and return boolean
		 * 		value true/false.
		 */
		String var1="";
		String var2="MQ";
		
		System.out.println("Var1 empty status is => "+var1.isEmpty());
		System.out.println("Var2 empty status is => "+var2.isEmpty());
		
	}

}
