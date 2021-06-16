package com.qa.hostel.testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hostel.basePackage.baseClass;
import com.qa.hostel.pagePackage.homePage;

public class homePageTest extends baseClass {
	
	homePage homepage;
	
	public homePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		login();
		homepage = new homePage();
	}
	
	@Test
	public void logOutTest() throws InterruptedException {
		String logoutURL = homepage.verifyLogout();
		Assert.assertEquals(logoutURL, "http://ecollegeweb.in/hostel_project/login");
	}
	
	@Test
	public void addNewStudentButtonTest() throws InterruptedException {
		String buttonTest = homepage.verifyAddStudentButton();
		Assert.assertEquals(buttonTest, "http://ecollegeweb.in/hostel_project/add_student");
	}
	
	@Test
	public void addStudentLink() throws InterruptedException {
		String addNewStudUrl = homepage.verifyAddStudentLink();
		Assert.assertEquals(addNewStudUrl, "http://ecollegeweb.in/hostel_project/add_student");
	}
	
	@Test
	public void admittedStudTest() throws InterruptedException {
		String addStud = homepage.verifyAdmittedStudents();
		Assert.assertEquals(addStud, "http://ecollegeweb.in/hostel_project/student_management");
	}
	
	@Test
	public void roomAllocationTest() throws InterruptedException {
		String allocationUrl = homepage.verifyRoomAllocation();
		Assert.assertEquals(allocationUrl, "http://ecollegeweb.in/hostel_project/room_reallocation");
	}
	
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
	
	
	
	

}
