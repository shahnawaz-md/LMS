package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyTimesheet {
	WebDriver driver;
	
	@FindBy(linkText="http://corpmis.myubiquesystems.com:80//user/timesheet/home?actionbean.tindex=2&actionbean.entityName=TimeSheet&actionbean.id=0&actionbean.lookupEnabled=true&actionbean.queryParamStrings=employeeId|=|15&actionbean.queryParamStrings=date|=|9/15/2015")
	public WebElement presentDate;
	
	@FindBy(xpath=".//*[@id='StoreForm-TimeSheet']/div[3]/div[6]/input")
	public WebElement inTime;
	
	@FindBy(id="StoreForm-TimeSheet_actionbean_timeSheet_tasksSummary")
	public WebElement summaryDetails;
	
	@FindBy(xpath=".//*[@id='StoreForm-TimeSheet']/div[10]/div/div[1]/div[3]/a[1]")
	public WebElement addButton;
	
	@FindBy(xpath=".//*[@id='StoreForm-TimeSheet']/div[10]/div/div[1]/div[3]/a[2]")
	public WebElement removeButton;
	
	@FindBy(id="StoreForm-TimeSheet_actionbean_timeSheet_tasks_0__orgActivityTypeId")
	public WebElement activityType;
	
	@FindBy(id="StoreForm-TimeSheet_actionbean_timeSheet_tasks_0__orgActivityId")
	public WebElement activityModule;
	
	@FindBy(id="StoreForm-TimeSheet_actionbean_timeSheet_tasks_0__task")
	public WebElement taskMessage;
	
	@FindBy(id="tools")
	public WebElement storeTimesheet;
	
	@FindBy(xpath="//button[1]/span[@class='ui-button-text']")
	public WebElement okOnAlert;
	
	public MyTimesheet(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDate()
	{
		presentDate.click();
	}
	
	public void enterInTime()
	{
		inTime.sendKeys("09:58:00");
	}
	
	public void enterTaskSummary()
	{
		summaryDetails.sendKeys("Prepared automation script for LMS by selenium using page factory");
	}
	
	public void clickAddButton()
	{
		addButton.click();
	}
	
	public void clickRemoveButton()
	{
		removeButton.click();
	}
	
	public void selectActivityType()
	{
		activityType.click();
	}
	
	public void projectActivitiesFromDropdown()
	{
		 Select drop = new Select(activityType);
	      drop.selectByVisibleText("Project Activities");
	}
	
	public void selectActivityModule()
	{
		activityModule.click();
	}
	
	public void activityModuleFromDropdown()
	{
		Select drop1 = new Select(activityModule);
	      drop1.selectByVisibleText("Testing");
	}
	
	public void enterTask()
	{
		taskMessage.sendKeys("Prepared automation script for LMS by selenium using page factory");
	}
	
	public void storeDetails()
	{
		storeTimesheet.click();
	}
	
	public void acceptAlert()
	{
		okOnAlert.click();
	}
	
	public void eventsOnTimesheetpage()
	{
		this.presentDate.click();
		this.inTime.sendKeys("09:58:00");
		this.summaryDetails.sendKeys("Prepared automation script for LMS by selenium using page factory");
		this.activityType.click();
		this.projectActivitiesFromDropdown();
		this.activityModule.click();
		this.activityModuleFromDropdown();
		this.taskMessage.sendKeys("Prepared automation script for LMS by selenium using page factory");
		this.storeTimesheet.click();
		this.okOnAlert.click();
	}

}
