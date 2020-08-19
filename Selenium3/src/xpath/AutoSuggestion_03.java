package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion_03 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		//Open App
		driver.get("http://www.google.com");
		//Enter Text in search field
		//a .Identify Search field
		WebElement rv = driver.findElement(By.name("q"));
		//b.Enter text
		rv.sendKeys("selenium");
		Thread.sleep(10000);
		//Get Auto suggestions count
		//a.Identify All AutoSuggestions---common property
		List<WebElement> ref = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		//b.select 5th autosuggestions
		ref.get(4).click();
	}

}
