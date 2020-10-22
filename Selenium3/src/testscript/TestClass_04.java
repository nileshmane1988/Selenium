package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import webpages.ActitimeLoginPage;

public class TestClass_04 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		ActitimeLoginPage rv=new ActitimeLoginPage(driver);
		rv.setCredentials("admin1", "admin123");
		rv.clickOnLogin();
		Thread.sleep(5000);
		rv.setCredentials("admin","manager");
		
		
		
		
		
		
		
		

	}

}
