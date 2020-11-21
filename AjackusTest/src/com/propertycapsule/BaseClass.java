package com.propertycapsule;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;

	@BeforeClass
	public void preConditions() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://propertycapsule.com");

	}
	@AfterClass
	public void postConditions() {

		driver.quit();driver.close();

	}

	@AfterMethod
	public void testMethodExecutionResult(ITestResult result) 
	{
		int executionStatue = result.getStatus();
		if (executionStatue == 1) {
			Reporter.log("Test Method : " + result.getName()+" Executed successfully" , true);
		}else if (executionStatue==2) {
			Reporter.log("Test Method : " + result.getName()+" Executed Failed" , true);

		}else {
			Reporter.log("Test Method : " + result.getName()+" Executed skipped" , true);

		}

	}



}
