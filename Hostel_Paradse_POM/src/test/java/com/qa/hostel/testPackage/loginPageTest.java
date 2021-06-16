package com.qa.hostel.testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hostel.basePackage.baseClass;
import com.qa.hostel.pagePackage.loginPage;

public class loginPageTest extends baseClass {
	
	loginPage loginpage;
	
	public loginPageTest() {
		super();
	}
	
	//
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new loginPage();		
	}
	
	@Test
	public void logoTest() {
		boolean logoVibility = loginpage.verifyLogoTest();
		Assert.assertEquals(logoVibility, true);
	}
	
	@Test
	public void titleTest() {
		String title = loginpage.verifyLoginTitle();
		Assert.assertEquals(title, "Login");
	}
	
	@Test
	public void signInButton() {
		boolean buttonVisibility = loginpage.verifySignInButtonVisibilty();
		Assert.assertEquals(buttonVisibility, true);
	}
	
	@Test
	public void verifyLogin() {
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		String urlAfterLogin = loginpage.verifyLogin(username, password);
		Assert.assertEquals(urlAfterLogin, "http://ecollegeweb.in/hostel_project/index");
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	

}
