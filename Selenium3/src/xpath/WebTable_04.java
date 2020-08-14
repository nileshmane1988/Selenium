package xpath;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_04 {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Nilesh/Desktop/PSSE17_HTMLCode/WebTable1.html");
		//All Subjects cost
		List<WebElement> ref = driver.findElements(By.xpath("//td[3]"));
		for(int i=0;i<ref.size();i++)
		{
			String str = ref.get(i).getText();
			System.out.println(str);
		}
	}

}
