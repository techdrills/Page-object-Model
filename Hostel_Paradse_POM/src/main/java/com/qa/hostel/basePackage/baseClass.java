package com.qa.hostel.basePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public baseClass() {
		try {
			prop = new Properties();
			FileInputStream ip =new FileInputStream("D:\\MAHESH WORKSPACE\\tds\\7.30\\Hostel_Paradse_POM\\src\\main\\java\\com\\qa\\hostel\\configPackage\\config.properties");
			prop.load(ip);
			}
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void initialization() {
		
		// read the properties data
		String browser = prop.getProperty("browser");
		System.out.println(browser+"=============");
		String url = prop.getProperty("url");
		
		// based on property launch the browser
		if(browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browser.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.contains("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else {
			System.out.println("Browser name is undefined, Please Enter correct browser name in configuration file");
		}

		// browser properties
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		// launch the base url		
		driver.get(url);
	}
	
	public static void login() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.tagName("button")).click();		
	}
	
	
	
}
