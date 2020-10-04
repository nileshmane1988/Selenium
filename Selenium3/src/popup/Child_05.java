package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_05 {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com");
		//Identify Parent refid
		String parent_refid=driver.getWindowHandle();
		//Identify All Ref ID
		Set<String> ref = driver.getWindowHandles();
		
		//close all windows without using quit()
		Iterator<String> itr = ref.iterator();
		while (itr.hasNext())
		{
			String window_refID = itr.next();
			if(!window_refID.equals(parent_refid))
			{
				driver.switchTo().window(window_refID);
				driver.close();
			}
		}

	}

}
