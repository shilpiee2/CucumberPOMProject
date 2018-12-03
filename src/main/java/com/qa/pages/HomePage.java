package com.qa.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testbase.TestBase;

import cucumber.api.DataTable;

public class HomePage extends TestBase {
	
	//Page factory
	
	@FindBy(xpath = "//td[contains(text() ,'User: Shilpi Bose')]")
	@CacheLookup
	WebElement usernameLabelName;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;
	
	@FindBy(xpath ="//td[@class='logo_text']")
	WebElement logoText;
	
	@FindBy(xpath = "//*[contains(text(),'Contact Information')]")
	WebElement contactInfoFieldText;
	
	@FindBy(css="#first_name")
    WebElement firstname;
	
	@FindBy(css = "#surname")
	WebElement surname;
	
	@FindBy(xpath ="//input[@type='submit' and @value='Save' ]")
	WebElement contactSaveBtn;
	
	
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomepageUserNameLabel(){
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(usernameLabelName).build().perform();
		return usernameLabelName.getText();
		
		
	}
	
	public String validateHomePageTitle(){
		
		return driver.getTitle();
	}
	
	public void clickOnNewContactLink(){
		Actions action = new Actions(driver);
		action.moveToElement(contactLink).build().perform();
		newContactLink.click();
		
	}
	
	public String validateHomepageLogo(){
		driver.switchTo().frame("mainpanel");
		return logoText.getText();
		
	}
	
	public void saveContactDetails(DataTable contactData){
		
		for (Map<String, String> contact : contactData.asMaps(String.class,
				String.class)) {
		
		firstname.sendKeys(contact.get("firstname"));
		surname.sendKeys(contact.get("surname"));
		contactSaveBtn.click();
		
		// move to contact page 
		Actions action = new Actions(driver);
		action.moveToElement(contactLink).build().perform();
		newContactLink.click();
		}
	}
	
	public String validateUserIsOnContactPage(){
		String contactPageFieldText= contactInfoFieldText.getText();
		return contactPageFieldText;
	}
}
