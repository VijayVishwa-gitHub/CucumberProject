package Main;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import DriverSetUp.driverClass;
import abstractClass.utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class appHooks {
	WebDriver driver;
	private driverClass C;
	
	@Before
	public void launchBrowser() throws IOException {
		C = new driverClass();
		C.getDriver(utils.getPropFilValue().get("browser"));
		System.out.println("Launching Browser");
	}
	
	
	@After
	public void quitBrowser() throws InterruptedException {
		
		System.out.println("Quitting browser");
		driver = driverClass.getDriver();
		driver.quit();
		}
	
	

}
