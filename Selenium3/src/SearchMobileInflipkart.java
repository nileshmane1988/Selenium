
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchMobileInflipkart {

public static void main(String[] args) 
{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	System.out.println("1");
	System.out.println("sleep 15 sec");
	
	//driver.findElement(By.linkText("X")).click();

	driver.findElement(By.className("LM6RPg")).sendKeys("Mobiles");
	System.out.println("enter mobile");	
	driver.findElement(By.className("vh79eN")).click();
	System.out.println("click search");
	
		

}

}
