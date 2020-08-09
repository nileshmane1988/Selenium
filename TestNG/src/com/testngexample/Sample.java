package com.testngexample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void test1() {

		System.out.println("hello");
		Reporter.log("Welcome");
		Reporter.log("\n\n\tTo India", true);
	}
}
