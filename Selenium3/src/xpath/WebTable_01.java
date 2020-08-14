package xpath;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_01 {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Nilesh/Desktop/PSSE17_HTMLCode/WebTable1.html");
		//Identify All rows in webtable
		List<WebElement> ref = driver.findElements(By.xpath("//tr"));
		//total rows Count
		int count = ref.size();
		System.out.println("Total rows in webtable "+count);
		
		
	}

}
