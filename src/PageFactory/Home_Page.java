package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	WebDriver driver;
	private static final long TIMEOUT = 12000;
	
	@FindBy(xpath=".//*[@id='_145_mySites']/a/span")
	public WebElement btn_Mysites;
	
	@FindBy(xpath=".//*[@id='_145_mySites']/ul/li[1]/a")
	public WebElement btn_CorpMIS;
	
	@FindBy(xpath= ".//*[@id='_145_mySites']/ul/li[2]/a")
	public WebElement btn_MyTransactions;
	
	@FindBy(xpath=".//*[@id='_145_mySites']/ul/li[3]/a/span[1]")
	public WebElement btn_MyUbqPortal;
	
	@FindBy(xpath=".//*[@id='_145_userAvatar']/a/span")
	public WebElement btn_MyName;
	
	@FindBy(xpath=".//*[@id='_145_userAvatar']/ul/li[2]/a/span")
	public WebElement btn_SignOut;
	
	
	
	public Home_Page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickMySite() throws InterruptedException
	{
		btn_Mysites.click();
		Thread.sleep(200);
	}
	
	public void clickCorpMIS() throws InterruptedException
	{
		btn_CorpMIS.click();
		Thread.sleep(200);
	}
	
	public void clickMyTransaction() throws InterruptedException
	{
		btn_MyTransactions.click();
		Thread.sleep(500);
	}
	
	public void clickMyUbiquePortal() throws InterruptedException
	{
		btn_MyUbqPortal.click();
		Thread.sleep(200);
	}
	
	public void clickMyname() throws InterruptedException
	{
		btn_MyName.click();
		//System.out.println("............passed--------");
		Thread.sleep(TIMEOUT);
	}
	
	public void clickSignOut() throws InterruptedException
	{
		btn_SignOut.click();
		Thread.sleep(500);
	}
	
	public void eventsOnHomePage() throws InterruptedException
	{
		this.clickMySite();
		this.clickMyTransaction();
		this.clickMyname();
		this.clickMyname();
		this.clickSignOut();
	}

}




