package com.qa.stepdefination;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testbase.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends TestBase {
	LoginPage loginpage;
	HomePage homepage;

	@Before
	public void setup() {
		TestBase.initialization();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("^user is on login Page$")
	public void user_is_on_login_Page() {
		loginpage = new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(
				"#1 Free CRM software in the cloud for sales and service",
				title);
		System.out.println(title);

	}

	@When("^user logged in to application by entering username and password$")
	public void user_enters_username_and_password() {

		homepage = loginpage.login(prop.getProperty("username"),
				prop.getProperty("password"));

	}

	@Then("^user validate homepage Title$")
	public void user_validate_homepage_Title() {
		String homepageTitleName = homepage.validateHomePageTitle();
		Assert.assertEquals("CRMPRO", homepageTitleName);

	}

	@Then("^user validate logged in username label$")
	public void user_validate_logged_in_username_label() {

		String lName = homepage.validateHomepageUserNameLabel();
		Assert.assertEquals("  User: Shilpi Bose", lName);

	}

	// Scenario 2 : user able to create contact on homepage
	
	@Given("^user is logged into FREECRM application using username and password$")
	public void user_is_logged_into_FREECRM_application_using_username_and_password() {
		
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"),
				prop.getProperty("password"));
		   
	}
	
	@When("^user is on Your HomePage$")
	public void user_is_on_Your_HomePage()  {
		
	}
	
	@Then("^user click on Contacts Link and select New Contacts$")
	public void user_click_on_Contacts_Link_and_select_New_Contacts() {
		
		driver.switchTo().frame("mainpanel");
		homepage.clickOnNewContactLink();
		 
	}
	
	@Then("^user landed on new Contact page$")
	public void user_landed_on_new_Contact_page()  {
		
		Assert.assertEquals("Contact Information",homepage.validateUserIsOnContactPage());
		System.out.println("Text to verify on Contact Page is .........>" + homepage.validateUserIsOnContactPage());
		
		
	}

	@Then("^user enters details of the new contact and save$")
	public void user_enters_and_and_save(DataTable contactData)  {
		
		homepage.saveContactDetails(contactData);
	    
	}
}
