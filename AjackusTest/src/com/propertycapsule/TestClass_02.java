package com.propertycapsule;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class TestClass_02 extends BaseClass {
	
	@Test
	public void test2()
	{
		 driver.findElement(By.partialLinkText("Tourbooks")).click();
		 
		 String title = driver.getCurrentUrl();

		 if(title.contains("https://tours.propertycapsule.com"))
		 {
		 	System.out.println("Home Page displayed");
		 }
		 else
		 {
		 	System.out.println("Home Page Not displayed");
		 }

	}


}
