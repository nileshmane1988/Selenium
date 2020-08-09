package xpath;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		Thread.sleep(3000);
		//All Images
		List<WebElement> ref = driver.findElements(By.tagName("img"));
		System.out.println(ref.size());
	}

}
