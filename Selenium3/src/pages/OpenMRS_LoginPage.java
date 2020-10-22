package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenMRS_LoginPage
{
	private WebElement username;
	private WebElement password;
	private WebElement inpatientward;
	private WebElement isolationward;
	private WebElement laboratory;
	private WebElement outpatientclinic;
	private WebElement pharmacy;
	private WebElement registrationdesk;
	private WebElement loginbutton;
	private WebElement cantlogin;
	
	public OpenMRS_LoginPage(WebDriver driver)
	{
		username=driver.findElement(By.id("username"));
		password=driver.findElement(By.id("password"));
		inpatientward=driver.findElement(By.id("Inpatient Ward"));
		isolationward=driver.findElement(By.id("Isolation Ward"));
		laboratory=driver.findElement(By.id("Laboratory"));
		outpatientclinic=driver.findElement(By.id("Outpatient Clinic"));
		pharmacy=driver.findElement(By.id("Pharmacy"));
		registrationdesk=driver.findElement(By.id("Registration Desk"));
		loginbutton=driver.findElement(By.id("loginButton"));
		cantlogin=driver.findElement(By.id("cantLogin"));
	}
	
	public void setUsername()
	{
		username.sendKeys("Admin");
	}
	public void setPassword()
	{
		password.sendKeys("Admin123");
	}
	public void selectInpatientWard()
	{
		inpatientward.click();
	}
	public void selectIsolationWard()
	{
		isolationward.click();
	}
	public void selectLaboratory()
	{
		laboratory.click();
	}
	public void selectOutPatientClinic()
	{
		outpatientclinic.click();
	}
	public void selectPharmacy()
	{
		pharmacy.click();
	}
	public void selectRegistrationDesk()
	{
		registrationdesk.click();
	}
	
	public void clickOnLogin()
	{
		loginbutton.click();
	}
	
	public void clickOnCantLogin()
	{
		cantlogin.click();
	}
	
	
	

}
