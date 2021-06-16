package com.qa.hostel.pagePackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hostel.basePackage.baseClass;

public class homePage extends baseClass{

	// constructor
	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	// page objects / web elements
	
	@FindBy(xpath="//header/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]")
	WebElement logOut_DropDown;
	
	@FindBy(linkText="Logout")
	WebElement logOut;
	
	@FindBy (xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/button[1]")
	WebElement AddNewStudent_Button;
	
	@FindBy (xpath="//body/div[1]/aside[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]")
	WebElement addStudentLink;
	
	@FindBy (xpath="//body/div[1]/aside[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]")
	WebElement admittedStudents;
	
	@FindBy (xpath="//body/div[1]/aside[1]/div[2]/nav[1]/ul[1]/li[15]/a[1]")
	WebElement roomAllocationLink;
	
	// test methods
	
	public String verifyLogout() throws InterruptedException {
		logOut_DropDown.click();
		Thread.sleep(2000);
		logOut.click();
		String urlAfterLogOut = driver.getCurrentUrl();
		return urlAfterLogOut;
	}
	
	public String verifyAddStudentButton() throws InterruptedException {
		AddNewStudent_Button.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	
	public String verifyAddStudentLink() throws InterruptedException {
		addStudentLink.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	
	public String verifyAdmittedStudents() throws InterruptedException {
		admittedStudents.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	
	public String verifyRoomAllocation() throws InterruptedException {
		roomAllocationLink.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	
}
