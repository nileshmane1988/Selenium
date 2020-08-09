package com.testngexample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample5 {
	@Test(invocationCount = 10)
	public void sendSMS()
	{
		Reporter.log("SMS send method is executed" , true);
	}

}
