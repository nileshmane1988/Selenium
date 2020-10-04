package autoit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_Firefox {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt=new FirefoxOptions();
		opt.addPreference("dom.webnotifications.enabled", false);
		WebDriver driver=new FirefoxDriver();

	}

}
