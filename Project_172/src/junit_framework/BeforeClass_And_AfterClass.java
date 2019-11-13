package junit_framework;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BeforeClass_And_AfterClass
{

	@BeforeClass//Invoke before execution of first @Test annotation.
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class-PreCondition");
	}

	@AfterClass//Invoke after last @Test annotation with in class.
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class-PostCondition");
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
