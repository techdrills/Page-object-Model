package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lauch {

	public static void main(String[] args) {
		// chrome browser
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		// firefox browser
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		
		// edge browser
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		
		// opera browser
		WebDriverManager.operadriver().setup();
		WebDriver driver = new OperaDriver();
		driver.get("http://ecollegeweb.in/hostel_project/login");
		
	

	}

}
