package com.testngexample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {

	@Test
	public void accountCreate() {
		Reporter.log("Account creation method executed", true);
	}

	@Test
	public void accountEdit() {
		Reporter.log("acc edit method executed", true);
	}

	@Test
	public void accountDelete() {
		Reporter.log("acc deletion method executed", true);
	}
	
	
	
}
