package DriverSetUp;

import org.openqa.selenium.WebDriver;

import Base.base;

public class driverFactory extends base{
	
	WebDriver driver;
	
	public driverFactory(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public static WebDriver getDriver(String browser) {
		switch(browser) {
		case("CHROME") : return setupDriver.getDriverForChrome();
		case("EDGE") : return setupDriver.getDriverForEdge();
		
		}return setupDriver.getDriverForChrome();
		
	}
	
}
