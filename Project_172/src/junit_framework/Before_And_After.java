package junit_framework;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Before_And_After {

	@Before//Invoke Every @Test annotation before
	public void setUp() throws Exception 
	{
		System.out.println("method-precondition");
	}

	@After //Invoke every @Test annotation after
	public void tearDown() throws Exception 
	{
		System.out.println("method-postcondition");
	}

	@Test //Annotation invoke method to run without object creation.
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Test //Annotation ignore method execution with in current class.
	public void test2() 
	{
		System.out.println("test2 executed");
	}
}
