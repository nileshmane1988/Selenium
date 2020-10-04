package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_03 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		Thread.sleep(7000);
		//Parent+Child refID
		Set<String> ref = driver.getWindowHandles();
		System.out.println(ref);
		//Display each refID
		Iterator<String> itr = ref.iterator();
		while (itr.hasNext())
		{
			String str = itr.next();
			System.out.println(str);
		}
		
		
		
		

	}

}
