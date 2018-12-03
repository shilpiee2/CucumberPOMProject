package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

public class LoginPage extends TestBase{
	
	//define Page Factory
	
	@FindBy(name ="username")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath= "//img[contains(@class, 'img-responsive')]")
	WebElement crmLogo;
	
	@FindBy()
	WebElement signUp;
	
	//page object initialization
	
	public LoginPage(){
		PageFactory.initElements(driver,this);
	}
	
	//Actions to perform on Login Page
	
	
	//method to validate title of login page
	public String validateLoginPageTitle(){
		return driver.getTitle();
		
	}
	
	// method to validate CRM logo
	public boolean validateCRMLogo(){
		return crmLogo.isDisplayed();
		
	}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		// click at login button
		//loginBtn.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
		
		return new HomePage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
