package junit_framework;

import java.util.NoSuchElementException;

import org.apache.commons.collections4.iterators.SkippingIterator;
import org.junit.Ignore;
import org.junit.Test;

public class MyJunit_Test 
{

	@Test //Annotation invoke method to run without object creation.
	public void test1() 
	{
		System.out.println("test1 executed");
	}
	
	@Ignore //Annotation ignore method execution with in current class.
	public void test2() throws Exception 
	{
		System.out.println("test2 executed");
		throw new Exception("Element not found");
	}
	
	@Test
	public void test3() throws Exception 
	{
		throw new NoSuchElementException("Element not found");
	}

}
