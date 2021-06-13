package com.qa.hostel.pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hostel.basePackage.baseClass;

public class loginPage extends baseClass{
	
	// Defining page objects or page web elements
	
	@FindBy(tagName="img") 
	WebElement Applogo;
	
	@FindBy(name="username")
	WebElement usernameText;
	
	@FindBy(id="password") 
	WebElement passwordText;
	
	@FindBy(tagName = "button")
	WebElement signInButton;
		
	// Initialisation of page factory -->
		// to load the page objects from the page class and to initialise we need to use PageFactory
		// we are gonna initiliasing page factories in the constructor
		// what is constructor--->
		// Constructor has the same of class name
		// constructor will call emmidiately once the object is created of the class
	
	// constructor of login page class
		public loginPage() {
			// code to initialise the page objects / repo/ web objects / page factory
		PageFactory.initElements(driver, this);
	}
		
		
	// page methods / test cases
		
		public boolean verifyLogoTest() {
			boolean logoresult = Applogo.isDisplayed();
			return logoresult;
		}
		
		public String verifyLoginTitle() {
			String loginTitle = driver.getTitle();
			return loginTitle;
		}
		
		public boolean verifySignInButtonVisibilty() {
			boolean buttonVisibilty = signInButton.isEnabled();
			return buttonVisibilty;
		}
		
		public String verifyLogin(String uname, String pass) {
			usernameText.sendKeys(uname);
			passwordText.sendKeys(pass);
			signInButton.click();
			String urlAfterLogin = driver.getCurrentUrl();
			return urlAfterLogin;
		}
		
		
		
	

}
