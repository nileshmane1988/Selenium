package popup;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_01 {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com");
		//Total windows displayed
		Set<String> ref = driver.getWindowHandles();
		//Count
		int count = ref.size();
		System.out.println("Total Windows displayed "+count);
		
		
		
		

	}

}
