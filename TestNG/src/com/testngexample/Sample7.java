package com.testngexample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample7 {
	
	@Test
	public void test1()
	{
		Reporter.log("execute test 1 " , true);
	}

	@Test (enabled = false)
	public void test2()
	{
		Reporter.log("execute test 2 " , true);
	}
	
	@Test 
	public void test3()
	{
		Reporter.log("execute test 3 " , true);
	}
	
}
