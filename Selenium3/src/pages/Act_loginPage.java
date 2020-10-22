package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Act_loginPage {
	private WebElement loginbutton;
	private WebElement errormsg;

	public Act_loginPage(WebDriver driver)
	{
		loginbutton = driver.findElement(By.id("loginButton"));
		errormsg = driver.findElement(By.className("errormsg"));
		
	}
	public void clickOnLogin()
	{
		loginbutton.click();
	}
	public String getErrormsgText()
	{
	 return errormsg.getText();	
	}
}
