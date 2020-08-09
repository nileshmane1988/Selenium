import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SlectBrowser
{
	WebDriver driver;
	public void browsername(String name)
	{
		if (name.equals("firefox"))
		{
			
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (name.equals("chrome"))
		{
	        WebDriverManager.chromedriver().setup();

			//WebDriverManager.chromedriver().version("79.0").setup();
			driver=new ChromeDriver();
		}
			
		else {
			
			
		}
	}

	}

	



