package xpath;

 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksCount {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		//Identify All Links
		//Common propert for links----tagname
		List<WebElement> ref = driver.findElements(By.xpath("//a"));
		
		int count = ref.size();
		System.out.println("Total Links in Google Page "+count);
		
		
		
		
		
		
		
		
		
		

	}

}
