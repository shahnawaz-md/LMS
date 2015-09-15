package com.ubique.lms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageFactory.Home_Page;
import PageFactory.LoginPage;
import PageFactory.MyTimesheet;
import PageFactory.Signin_Page;

public class LMS {
	
	WebDriver driver;
	private static final long TIMEOUT = 12000;
	
	Signin_Page objSignin;
	LoginPage objLogin;
	Home_Page objHomepage;
	MyTimesheet objMyTimesheet;
	
	
	@BeforeClass
	
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahnawaz\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://portal.myubiquesystems.com/home");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	
	public void close() {
		
		driver.close();
		driver.quit();
	}
	
	@Test
	public void PortalLMS() throws InterruptedException {
	
		objSignin = new Signin_Page(driver);
		objSignin.signinToPortal();
		
		objLogin = new LoginPage(driver);
		objLogin.loginToPortal("shahnawaz@ubiquesystems.co.in", "bismillah786");
		
		objHomepage = new Home_Page(driver);
		objHomepage.eventsOnHomePage();
		
		
		/*objMyTimesheet = new MyTimesheet(driver);
		objMyTimesheet.eventsOnTimesheetpage();
		*/
		
		
		
		
		
		
		
		
		
	}
	

}
