package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='navigation']/ul[2]/li/a")
	 WebElement btn_Signin;
	
	public Signin_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSignin() throws InterruptedException {
		btn_Signin.click();
		Thread.sleep(200);
	}
	
	public void signinToPortal() throws InterruptedException
	{
		this.clickSignin();
	}

}
