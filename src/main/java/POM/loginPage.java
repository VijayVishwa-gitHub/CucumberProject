package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.base;
import abstractClass.utils;

public class loginPage {
	
	public WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userEmail") public WebElement uName;
	@FindBy(id="userPassword") public WebElement pWord;
	@FindBy(id="login") public WebElement loggin;
	
	
	
	
	public void title() throws IOException {
		System.out.println(driver.getTitle());
	}
	
	public void getURL() throws IOException {
		driver.get(utils.getPropFilValue().get("URL"));
		
	}
	public void logging(String mail, String pwd) {
		
		uName.sendKeys(mail);
		pWord.sendKeys(pwd);
		loggin.click();
		
	}
	public void screensh() throws IOException {
		utils.takeSS();
	}

}
