import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenActTimeApp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		System.out.println("2");
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(5000);
		
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		Thread.sleep(5000);
		//driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("loginButton")).click();
		System.out.println("prog End");
		Thread.sleep(5000);

	//	driver.close();
		
		
	}

}
