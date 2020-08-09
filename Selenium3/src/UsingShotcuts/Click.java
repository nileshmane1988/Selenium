package UsingShotcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		System.out.println("2");
		driver.get("https://demo.actitime.com/login.do");

		// Copy pest UN into PWD Field

		/*
		 * WebElement un = driver.findElement(By.id("username"));
		 * 
		 * un.sendKeys("admin"); un.sendKeys(Keys.CONTROL+ "a");
		 * un.sendKeys(Keys.CONTROL+"c");
		 * 
		 * driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v");
		 * 
		 */

		// remove un field without using clear method
Thread.sleep(5000);

WebElement un = driver.findElement(By.id("username"));
un.sendKeys("Administrator");
Thread.sleep(5000);
un.sendKeys(Keys.CONTROL + "a");
Thread.sleep(5000);
un.sendKeys(Keys.BACK_SPACE);
Thread.sleep(5000);
un.sendKeys("admin");
Thread.sleep(5000);
System.out.println("hello");

		WebElement bt = driver.findElement(By.id("keepLoggedInCheckBox"));
		bt.sendKeys(Keys.SPACE);

	}

}
