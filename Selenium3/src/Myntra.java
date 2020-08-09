import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("ProgStart");
		driver.get("https://www.myntra.com");
		String title = driver.getTitle();		
		String url = driver.getCurrentUrl();
		
		System.out.println("title = "+ title);
		System.out.println("url = "+ url);
		System.out.println("ProgEnd");
	}

}
