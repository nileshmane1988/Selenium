package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_07 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.yatra.com");
		//Move mouse over My Account option
		WebElement rv = driver.findElement(By.partialLinkText("My Account"));
		Actions a=new Actions(driver);
		a.moveToElement(rv).perform();
		Thread.sleep(7000);
		//Click on lOgin button
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(7000);
		//Click on Facebook option
		driver.findElement(By.id("fb-login-btn")).click();
		//Switch to child
		Set<String> ref = driver.getWindowHandles();
		Iterator<String> itr = ref.iterator();
		itr.next();//parentwindow_refid
		String ref_id = itr.next();//childwindow_refid
		driver.switchTo().window(ref_id);
		//fb emailid
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		//PWD
		driver.findElement(By.id("pass")).sendKeys("admin123");
		
		
		
		
		
		
		
		
		

	}

}
