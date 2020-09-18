import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://smallpdf.com/compress-pdf");
		WebElement rv = driver.findElement(By.xpath("//span[test()='Choose files']"));
		JavascriptExecutor	 js = (JavascriptExecutor) driver;
		//= (JavascriptExecutor).driver;
		
		
	}

}
