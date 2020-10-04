package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_02 {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com");
		//Parent window refID
		String parent_refID = driver.getWindowHandle();
		System.out.println(parent_refID);
		
		
		
		
		
		
		
		

	}

}
