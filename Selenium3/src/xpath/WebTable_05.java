package xpath;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_05 
{

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Nilesh/Desktop/PSSE17_HTMLCode/WebTable1.html");
		int value=0;
		//All Subjects cost
		List<WebElement> ref = driver.findElements(By.xpath("//td[3]"));
		for(int i=0;i<ref.size();i++)
		{
			String str = ref.get(i).getText();
			int a = Integer.parseInt(str);
			value=value+a;
			
		}
		System.out.println("Total Subjects cost "+value);
		
		//Webtable total
		String rv = driver.findElement(By.xpath("//tr[6]/th[3]")).getText();
		int b = Integer.parseInt(rv);
		System.out.println("Total displayed in webtable "+b);
		if(value==b)
		{
			System.out.println("Webtable displayed total is correct");
		}
		else
		{
			System.out.println("Webtable displayed total is not correct");
		}
		
		
		
	}

}
