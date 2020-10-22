package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ActitimeLoginPage;

public class TestActitimeLogin {

	public static void main(String[] args) 
	{
		//1.Open Browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//2.Open Actitime App
		driver.get("https://demo.actitime.com/login.do");
		//3.Enter Username, password and click on login button
		ActitimeLoginPage rv=new ActitimeLoginPage(driver);
		rv.setUsername();
		rv.setPassword();
		rv.selctCheckBox();
		rv.clickOnLoginButton();
		//4.Verify homepage displayed or not
		String title = driver.getTitle();
		if(title.contains("Enter Time-Track"))
		{
			System.out.println("HomePage displayed");
		}
		else
		{
			System.out.println("Home Page not displayed");
		}
	}

}
