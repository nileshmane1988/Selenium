package com.assertSample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo {

	@Test
	public void test()
	{
		/*
		 * int a=10; int b=20;
		 * 
		 * Assert.assertEquals(a,b);
		 */
		String str1="Hello";
		String str2= "Hello";
		Assert.assertEquals(str1, str2);
	}
}
