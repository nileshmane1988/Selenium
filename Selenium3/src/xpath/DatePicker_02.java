package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_02 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.phptravels.net/home");
		//Click on Checkin option 
		driver.findElement(By.id("checkin")).click();
		Thread.sleep(5000);
		String expected_month="January";
		//Identify Month in calender
		
		while(true)
		{
			String displayed_month = driver.findElement(By.xpath("(//div[@class=\"datepicker--nav-title\"])[1]")).getText();
			if(displayed_month.contains(expected_month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("(//nav[@class=\"datepicker--nav\"]/div[3])[1]")).click();
				Thread.sleep(3000);
			}
		}
		Thread.sleep(3000);
		//Select date
		String expected_date="18";
		String xpath_exp="(//div[contains(@class,'datepicker -bottom-left')])[1]/div[1]//div[contains(@class,'datepicker--cells')]/div[text()='"+expected_date+"']";
		driver.findElement(By.xpath(xpath_exp)).click();
		
		
		
		

	}

}
