package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import webpages.ActitimeLoginPage;

public class TestClass_01 {

	public static void main(String[] args) 
	{
		//Open Browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Open App
		driver.get("http://localhost/login.do");
		//Enter Username, Password and click on checkbox
		ActitimeLoginPage rv=new ActitimeLoginPage(driver);
		rv.setCredentials("admin", "manager");
		rv.selectCheckbox();
		rv.clickOnLogin();
		//Verify Home Page
		String title = driver.getTitle();
		
		if(title.contains("Enter Time-Track"))
		{
			System.out.println("Home Page displayed");
		}
		else
		{
			System.out.println("Home Page Not displayed");
		}
		//close browser
		driver.close();
		
		
		
		
		
		

	}

}
