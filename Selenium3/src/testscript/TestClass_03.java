package testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import webpages.ActitimeLoginPage;

public class TestClass_03 
{

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		ActitimeLoginPage rv=new ActitimeLoginPage(driver);
		rv.clickOnviewLicence();
		//Close Child window
		Set<String> ref = driver.getWindowHandles();
		Iterator<String> itr = ref.iterator();
		itr.next();//parent
		String child_window = itr.next();//child
		driver.switchTo().window(child_window);
		driver.close();
		//CLose Main Windows
		driver.close();

	}

}
