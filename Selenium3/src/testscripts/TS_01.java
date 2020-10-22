package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.OpenMRS_LoginPage;
/*
public class TS_01 {

	public static void main(String[] args) 
	{
		// Open Browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//Open App
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		//Login to InpatientWard
		OpenMRS_LoginPage rv=new OpenMRS_LoginPage(driver);
		rv.setUsername();
		rv.setPassword();
		rv.selectInpatientWard();
		rv.clickOnLogin();
	
	}

}
*/
public class TS_01 extends BaseTest {

	public static void main(String[] args) 
	{
		BaseTest s= new BaseTest();
		s.selectBrowser("firefox");
		s.openApp();
		
		//Login to InpatientWard
		OpenMRS_LoginPage rv=new OpenMRS_LoginPage(driver);
		rv.setUsername();
		rv.setPassword();
		rv.selectInpatientWard();
		rv.clickOnLogin();
	
	}

}