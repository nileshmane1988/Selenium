import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumJarDownload {

public static void main(String[] args) {

	WebDriverManager.iedriver().setup();

	System.out.println("hello");
	
	WebDriver driver = new InternetExplorerDriver();
	
	System.out.println("hi");
	
	driver.get("https://demo.actitime.com/login.do");

		
		
		
		
		
		
		
		
		
		
	}

}
