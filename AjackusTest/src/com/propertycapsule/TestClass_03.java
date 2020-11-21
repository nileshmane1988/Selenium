package com.propertycapsule;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class TestClass_03 extends BaseClass {

	@Test
	public void test3()
	{
		 driver.findElement(By.partialLinkText("Enterprise Admin Login")).click();
		 
		 
		 
			 String title = driver.getCurrentUrl();

		 if(title.contains("https://propertycapsule.com/property/admin/login/form"))
		 {
		 	System.out.println("Home Page displayed");
		 }
		 else
		 {
		 	System.out.println("Home Page Not displayed");
		 }

	}

	}


