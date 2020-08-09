package com.testngexample;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample8 {
	
	@DataProvider
	public Object [] [] testData()
	{
		Object[] [] rev = new Object [1] [1];
		rev[0][0]="nileshmane1988@gmail.com";
		return rev;
	}
	
	@Test (dataProvider = "testData")
	public void test1(String username)
	{
		Reporter.log(username , true);
	}

}
