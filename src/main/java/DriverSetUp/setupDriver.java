package DriverSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setupDriver extends driverFactory {

	public setupDriver(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//WebDriver driver;
	
	public static WebDriver getDriverForChrome() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();	
	}
	public static WebDriver getDriverForEdge() {
		WebDriverManager.edgedriver().setup();
		return new EdgeDriver();	
	}

}
