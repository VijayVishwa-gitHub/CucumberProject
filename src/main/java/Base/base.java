package Base;

import java.io.IOException;
import java.time.Duration;
import abstractClass.utils;

import org.openqa.selenium.WebDriver;

import DriverSetUp.driverClass;
import DriverSetUp.driverFactory;
import POM.loginPage;

public class base {
	
	String URL="https://rahulshettyacademy.com/client";
	static WebDriver driver;
	
	
	public static WebDriver initializeDriver() throws IOException {
		
		//driver = driverClass.getDriver(utils.getPropFilValue().get("browser"));
		driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
	}
	public WebDriver loginIn() throws IOException {
		driver = initializeDriver();
		//driver.get("https://rahulshettyacademy.com/client");
		return driver;
		
		
		
	}

}
