package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	
	WebDriver drivers ;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\Soft\\chromedriver.exe");
		drivers = new ChromeDriver();
		 drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
	}

	@When("^the user enters the valid username and password$")
	public void the_user_enters_the_valid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    drivers.findElement(By.id("txtUsername")).sendKeys("Admin");
	    drivers.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^clicks on login button$")
	public void clicks_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    drivers.findElement(By.id("btnLogin")).click();
	}

	@Then("^the user should be navigated to home page$")
	public void the_user_should_be_navigated_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    boolean status = drivers.findElement(By.linkText("Welcome Ram")).isDisplayed();
	Assert.assertTrue(status);
	
	}

}
