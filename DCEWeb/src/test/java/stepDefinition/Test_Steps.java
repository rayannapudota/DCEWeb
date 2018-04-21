package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	public static WebDriver driver;
	@Given("^Application is launched and User is on home page$")
	public void application_is_launched_and_User_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\Browser Drivers Servers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	   driver = new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.coinbase.com");
		throw new PendingException();
	}
	
	@When("^User click on Registration link$")
	public void user_click_on_Registration_link() throws Throwable {
		driver.findElement(By.name("data-action-name")).click();
		
	    throw new PendingException();
	}
	@When("^Enters all the required information for residential user$")
	public void enters_all_the_required_information_for_residential_user() throws Throwable {
		driver.findElement(By.id("input id")).sendKeys("Arogya mary");
		driver.findElement(By.name("Placeholder")).sendKeys ("Mallavarapu");
	    throw new PendingException();
	}

	@When("^User clicks on submit$")
	public void user_clicks_on_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Registration should be performed successfully$")
	public void registration_should_be_performed_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Enters all the required information for business user$")
	public void enters_all_the_required_information_for_business_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
	
}
