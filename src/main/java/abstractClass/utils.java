package abstractClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import DriverSetUp.driverClass;


public class utils{
	static WebDriver driver;
	
	public static HashMap<String, String> propMap = new HashMap<String, String>();
	
	public static HashMap<String, String> getPropFilValue() throws IOException{
		try {
		Properties prop = new Properties();
		FileInputStream fil = new FileInputStream("C:\\Users\\VijayBala\\eclipse-workspace\\Framework\\src\\main\\java\\parameters\\resources\\globalData.properties");
		prop.load(fil);
		propMap.putAll((Map) prop);
		return propMap;}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return propMap;
		
	}
	
	public static void takeSS() throws IOException {
		System.out.println("Taking Screenshot");
		driver = driverClass.getDriver();
		TakesScreenshot ss = ((TakesScreenshot) driver);
		File src  = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\VijayBala\\eclipse-workspace\\Framework\\target\\screenshot.png"));
		
		
		
	}

}
