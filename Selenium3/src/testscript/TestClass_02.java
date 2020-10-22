package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import webpages.ActitimeLoginPage;

public class TestClass_02 {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		//Click on Login button
		ActitimeLoginPage rv=new ActitimeLoginPage(driver);
		rv.clickOnLogin();
		//Verify Errormsg
		boolean status = rv.verifyErrorrMsg();
		if(status)
		{
			System.out.println("Error Msg displayed");
		}
		else
		{
			System.out.println("Error msg not displayed");
		}
		
		driver.close();
		
		
		
		
		
		

	}

}
