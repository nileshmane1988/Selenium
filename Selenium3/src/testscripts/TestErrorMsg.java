package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Act_loginPage;

public class TestErrorMsg {

	public static void main(String[] args) throws InterruptedException {


		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do ");

		//click in login button
		Act_loginPage rv = new Act_loginPage(driver);
		rv.clickOnLogin();
		//print error msg
	
		
		String msg = rv.getErrormsgText();
	
		
		System.out.println(msg);
		
		
	}

}
