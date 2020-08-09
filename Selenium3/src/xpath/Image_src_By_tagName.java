package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image_src_By_tagName {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		Thread.sleep(3000);
		//All Images
		List<WebElement> ref = driver.findElements(By.tagName("img"));
		for(int i=0;i<ref.size();i++)
		{
			
			
			WebElement rv = ref.get(i);
			String str = rv.getAttribute("src");
			
			
			
			
			System.out.println(str);
			
			
			
			
			
		}
	}

}
