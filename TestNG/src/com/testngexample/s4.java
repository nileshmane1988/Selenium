package com.testngexample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class s4 
{
	@Test(priority=1)
	public void createAccount()
	{
		Reporter.log("Create Account Method Executed",true);
	}
	@Test(priority=2)
	public void editAccount()
	{
		Reporter.log("Edit Account Method Executed",true);
	}
	@Test(priority=3)
	public void deleteAccount()
	{
		Reporter.log("Delete Account Method Executed",true);
	}


}

