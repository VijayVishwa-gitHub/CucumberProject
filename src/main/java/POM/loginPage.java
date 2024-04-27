package POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
	@FindBy(xpath="//i[@class='fa fa-sign-out']") public WebElement signOut;
	By signout = By.id("toast-container");
	
	
	public void title() throws IOException {
		System.out.println(driver.getTitle());
	}
	
	public void getURL() throws IOException {
		driver.get(utils.getPropFilValue().get("URL"));
		
	}
	public void logging(String mail, String pwd) throws InterruptedException {
		
		uName.sendKeys(mail);
		pWord.sendKeys(pwd);
		loggin.click();
		Thread.sleep(3000);
		
	}
	public void verifying() throws IOException {
		       utils.implicitWait();
		       //utils.wait_ElementVisibility(signOut);
			   if(signOut.isDisplayed()) {
	            utils.takeSS();	            
	            System.out.println("Login successful.");}
	
	            else {
	            	System.out.println("Failed Testcase");
	            	Assert.fail();
	            }
	            
	       
	 //driver.findElement(By.xpath("//h3[normalize-space(text()) = 'Automation']"));
	    
	    
	    	
	}



}
