package com.testngexample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample6 {

	@Test (invocationTimeOut = 5)
	public void test1() throws InterruptedException
	{
		Thread.sleep(5000);
		Reporter.log("execute test 1 ", true);
	}
	
}
