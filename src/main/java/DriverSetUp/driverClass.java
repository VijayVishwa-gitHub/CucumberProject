package DriverSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverClass {
	 WebDriver driver;
	

	public static ThreadLocal<WebDriver> t1 = new ThreadLocal<>();
	
	
	public void getDriver(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			t1.set(new ChromeDriver());	
		}
		else if(browser.equalsIgnoreCase("Edge")){
			WebDriverManager.edgedriver().setup();
			t1.set(new EdgeDriver());
			
		}else {
			WebDriverManager.chromedriver().setup();
			t1.set(new ChromeDriver());
		}
		getDriver().manage().window().maximize();
		
	}
	
	public static WebDriver getDriver() {
		return t1.get();
	}

}
