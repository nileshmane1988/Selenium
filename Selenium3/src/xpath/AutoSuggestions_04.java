package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions_04 {

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
		//Approach-01---using keystrokes
		/*Keys key1 = Keys.ARROW_DOWN;
		Keys key2 = Keys.ENTER;
		rv.sendKeys(key1);
		Thread.sleep(5000);
		rv.sendKeys(key1);
		Thread.sleep(5000);
		rv.sendKeys(key1);
		Thread.sleep(5000);
		rv.sendKeys(key2);*/
		//Approach-02---using findElement method-- identify AutoSuggestion
		//driver.findElement(By.xpath("//b[contains(text(),'maven dependency')]")).click();
		
		//Approach-03:Using findElements()---Identify All AutoSuggestions---common property
		List<WebElement> ref = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		for(int a=0; a<ref.size();a++)
		{
			WebElement var = ref.get(a);
			String str = var.getText();
			if(str.contains("maven"))
			{
				var.click();
				break;
			}
		}
	}

}
