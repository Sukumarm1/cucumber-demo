package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DataTableWithoutHeader {
	WebDriver drivers;

	@Given("^You are on the login page$")
	public void you_are_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Soft\\chromedriver.exe");
		drivers = new ChromeDriver();
		 drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}

	@When("^You enter the below credentials$")
	public void you_enter_the_below_credentials(DataTable datatable) throws Throwable {
	
		 
		 List<String> credentials=	datatable.asList(String.class);
		 
		  String username = credentials.get(0); 
		  String password = credentials.get(1);
		
		drivers.findElement(By.id("txtUsername")).sendKeys(username);
		drivers.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@When("^clicks the login button$")
	public void clicks_the_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		drivers.findElement(By.id("btnLogin")).click();
	}

	@Then("^you should see the home page$")
	public void you_should_see_the_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean status = drivers.findElement(By.partialLinkText("Welcome")).isDisplayed();
		Assert.assertTrue(status);
	}

}
