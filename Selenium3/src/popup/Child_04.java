package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_04 {

	public static void main(String[] args)  throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com");
		//Identify Ref ID
		Set<String> ref = driver.getWindowHandles();
		
		//close all windows without using quit()
		Iterator<String> itr = ref.iterator();
		while (itr.hasNext())
		{
			String window_refID = itr.next();
			driver.switchTo().window(window_refID);
			driver.close();
		}
	}

}
