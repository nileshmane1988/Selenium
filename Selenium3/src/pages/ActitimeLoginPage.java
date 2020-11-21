package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLoginPage 
{
		//datamember should be declared globally with access specifier private, return type should be WebElement.
		private WebElement username;
		private WebElement password;
		private WebElement checkbox;
		private WebElement loginbutton;
		
		//datamember should be intialized within constructor

		public ActitimeLoginPage(WebDriver driver)
		{
			username=driver.findElement(By.id("username"));
			password=driver.findElement(By.name("pwd"));
			checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
			loginbutton=driver.findElement(By.id("loginButton"));
		}
		//datamember should be utilized with method
		public void setUsername()
		{
			username.sendKeys("admin");
		}
		public void setPassword()
		{
			password.sendKeys("manager");
		}
		public void selctCheckBox()
		{
			checkbox.click();
		}
		public void clickOnLoginButton()
		{
			loginbutton.click();
		}
		public void clickOnLogin() {
			// TODO Auto-generated method stub
			loginbutton.click();
		}
		public boolean verifyErrorrMsg() {
			// TODO Auto-generated method stub
			return false;
		}


}
