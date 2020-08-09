package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links_DisplayCount {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		List<WebElement> ref = driver.findElements(By.xpath("//a"));
		System.out.println("Total Links In google page "+ref.size());
		int visible_links=0;
		int hidden_links=0;
		for(int i=0;i<ref.size();i++)
		{
			WebElement rv = ref.get(i);
			if(rv.isDisplayed())
			{
				visible_links++;
			}
			else
			{
				hidden_links++;
			}
			
			
		}
		System.out.println("Total Links Visible "+visible_links);
		System.out.println("Total Links hidden "+hidden_links);
	}

}