package autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadpopup {

	public static void main(String[] args) throws IOException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/PSSE17_HTMLCode/FileUpload.html");
		WebElement ele = driver.findElement(By.id("element"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
		//Execute AutoIT script
		Runtime.getRuntime().exec("D:\\PSSE17_AutoITFiles\\FileUpload.exe");
		
		
		
		
		

	}

}
