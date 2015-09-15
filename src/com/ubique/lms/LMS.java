package com.ubique.lms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LMS {
	
	static WebDriver driver;
	private static final long TIMEOUT = 12000;
	
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
	
	public static void PortalLMS() throws InterruptedException {
		
		/*WebElement signin = driver.findElement(By.xpath(".//*[@id='sign-in']"));
		signin.click();
		Thread.sleep(TIMEOUT);
		WebElement email = driver.findElement(By.id("_58_login"));
		email.clear();
		email.sendKeys("shahnawaz@ubiquesystems.co.in");
		WebElement password = driver.findElement(By.id("_58_password"));
		password.clear();
		password.sendKeys("bismillah786");
		WebElement signin_button = driver.findElement(By.xpath(".//*[@id='_58_fm']/div/button"));
		signin_button.click();
		Thread.sleep(TIMEOUT);
		WebElement my_name = driver.findElement(By.xpath(".//*[@id='_145_userAvatar']/a/span"));
		my_name.click();
		WebElement signOut = driver.findElement(By.xpath(".//*[@id='_145_userAvatar']/ul/li[2]/a/span"));
		signOut.click();
		Thread.sleep(TIMEOUT);
		*/
		
		/*signin.click();
		Thread.sleep(TIMEOUT);
		email.clear();
		email.sendKeys("shahnawaz@ubiquesystems.co.in");
		password.clear();
		password.sendKeys("bismillah786");
		signin_button.click();
		Thread.sleep(TIMEOUT);
		my_name.click();
		signOut.click();
		Thread.sleep(TIMEOUT);*/
		
		
		
		
	}
	

}
