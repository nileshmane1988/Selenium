package com.testngexample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	
	@Test
	public void test1()
	{
		
		Reporter.log("Test 1 Executed", true);
	}
	
	@Test
	public void test2()
	{
Reporter.log("Test 2 Executed" ,true);	}
	@Test
	public void test3()
	{
		Reporter.log("Test 3 Executed", true);
	}
}
