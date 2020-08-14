package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker_03 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		String exp_month="November";
		while(true)
		{
			//Month
			String displayed_month = driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]/div[1]//div[@class='title']/span[1]")).getText();
			if(displayed_month.equals(exp_month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
				Thread.sleep(3000);
			}
		}
		Thread.sleep(3000);
		//Date
		String expected_date="25";
		String xpath_exp="//div[@id=\"ui-datepicker-div\"]/div[1]/table//tr/td/a[text()='"+expected_date+"']";
		driver.findElement(By.xpath(xpath_exp)).click();
	}

}
