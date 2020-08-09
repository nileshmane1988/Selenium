import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class extraDriverProgram {

	public static void main(String[] args) {
		
		String path= "../Selenium2/exe/chromedriver.exe";
		String PropName = "webdriver.chrome.driver";
		//String path= "../Selenium2/exe/IEDriverServer.exe";
		//String PropName = "webdriver.ie.driver";
		
		
		System.setProperty(PropName, path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.face.bbok.com");
		
	}
}
