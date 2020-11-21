package com.propertycapsule;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class TestClass_01 extends BaseClass{
	
	@Test
	public void test1()
	{
		 driver.findElement(By.partialLinkText("Map Maker")).click();
		 
		 String title = driver.getCurrentUrl();
			
			if(title.contains("https://maps.propertycapsule.com"))
			{
				System.out.println("Home Page displayed");
			}
			else
			{
				System.out.println("Home Page Not displayed");
			}
		 
		 
	}

}



