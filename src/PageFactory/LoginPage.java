package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id="_58_login")
	public WebElement txt_Username;
	
	@FindBy(id="_58_password")
	public WebElement txt_Password;
	
	@FindBy(xpath=".//*[@id='_58_fm']/div/button")
	public WebElement Login_Button;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String strUserName) throws InterruptedException
	{
		txt_Username.clear();
		txt_Username.sendKeys(strUserName);
		Thread.sleep(200);
	}
	
	public void setUserPassword(String strUserPassword) throws InterruptedException
	{
		txt_Password.clear();
		txt_Password.sendKeys(strUserPassword);
		Thread.sleep(200);
	}
	
	public void clickLogin() throws InterruptedException
	{
		Login_Button.click();
		Thread.sleep(500);
	}
	
	public void loginToPortal(String strUserName, String strUserPassword) throws InterruptedException
	{
		this.setUserName(strUserName);
		this.setUserPassword(strUserPassword);
		this.clickLogin();
	}

}
