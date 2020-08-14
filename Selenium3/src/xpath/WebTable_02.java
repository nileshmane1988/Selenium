package xpath;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_02 {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Nilesh/Desktop/PSSE17_HTMLCode/WebTable1.html");
		//Approach-01:findElement()
		
		/*String str = driver.findElement(By.xpath("//tr[3]")).getText();
		System.out.println(str);*/
		
		//Approach-02---- findElements()
		List<WebElement> ref = driver.findElements(By.xpath("//tr"));
		WebElement rv = ref.get(2);
		String str = rv.getText();
		System.out.println(str);
		
		
		
		
	}

}
