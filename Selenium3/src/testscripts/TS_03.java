package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.OpenMRS_LoginPage;

public class TS_03 {

	public static void main(String[] args) 
	{
		//Open Browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//Open App
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		//Login to Laboratory
		OpenMRS_LoginPage rv=new OpenMRS_LoginPage(driver);
		rv.setUsername();
		rv.setPassword();
		rv.selectLaboratory();
		rv.clickOnLogin();
		
		

	}

}
