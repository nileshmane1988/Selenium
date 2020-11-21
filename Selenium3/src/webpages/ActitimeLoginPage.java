package webpages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage 
{
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(how=How.NAME,using="pwd")
	private WebElement password;
	
	@FindBy(how=How.ID,using="keepLoggedInCheckBox")
	private WebElement checkbox;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	@FindBy(how=How.CLASS_NAME,using="errormsg")
	private WebElement errormsg;
	
	@FindBy(id="licenseLink")
	private WebElement viewlicense;
	
	
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setCredentials(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	
	public void selectCheckbox()
	{
		checkbox.click();
	}
	
	public void clickOnLogin()
	{
		loginbutton.click();
	}
	
	public boolean verifyErrorrMsg()
	{
		return errormsg.isDisplayed();
	}
	
	public void clickOnviewLicence()
	{
		viewlicense.click();
	}
	
	
	
	
	
	
	
	
	
	

}
