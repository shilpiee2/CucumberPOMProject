package com.qa.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testbase.TestBase;

import cucumber.api.DataTable;

public class DealsPage extends TestBase {

	// Page Factory

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'New Deal')]")
	WebElement newDealLink;

	@FindBy(xpath ="//input[@name='sequence']")
	WebElement dealSeqenceNum;
	
	@FindBy(css ="#title")
	WebElement dealTitle;
	
	@FindBy(css ="#amount")
	WebElement dealAmount;
	
	@FindBy(xpath ="//select[@name='type' and @size='1']")
	WebElement dealType;
	
	

	public DealsPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickToNewDealLink() {
		Actions action = new Actions(driver);
		action.moveToElement(dealsLink).build().perform();
		newDealLink.click();

	}
	
	public void enterDealDetails(DataTable dealData){
		for (Map<String, String> deal : dealData.asMaps(String.class,
				String.class)) {
		
		dealTitle.sendKeys(deal.get("title"));
		dealAmount.sendKeys(deal.get("amount"));
		Select s = new Select(dealType);
		s.selectByValue(deal.get("dealValueType"));
		
		
		
		// move to Deal page 
		clickToNewDealLink();
		
		}
	}
	
	

}
