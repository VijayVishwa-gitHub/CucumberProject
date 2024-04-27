package Main;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base.base;
import DriverSetUp.driverClass;
import POM.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition{
	
	WebDriver driver;
	private loginPage A = new loginPage(driverClass.getDriver());
	
	
	
	@Given("User enters application URL")
	public void homePage() throws IOException {
	   A.getURL();
	}

	@Then("User is taken to landing Page")
	public void application_url_is_entered() throws IOException {
		A.title();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) throws InterruptedException {
		A.logging(string, string2);
	}

	@Then("User login into application")
	public void user_login_into_application() throws IOException {
		A.verifying();
	}
	
// Adding a comment
}
