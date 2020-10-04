package autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe_Handling {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/PSSE17_HTMLCode/WebPage_02.html");
		//Enter Username
		driver.findElement(By.id("Username")).sendKeys("admin");
		//ENter Password
		driver.findElement(By.id("pwd")).sendKeys("admin123");
		//Switch focus to frame
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("page_01");
		WebElement rv = driver.findElement(By.id("page_01"));
		driver.switchTo().frame(rv);
		//Enter EmailID
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		//Enter Contact
		driver.findElement(By.id("contact")).sendKeys("8769897");		
		//Switch back to main page
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		//ENter country
		driver.findElement(By.id("country")).sendKeys("India");
		
		
		
		
		
		
		
		
	}

}
