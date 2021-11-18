package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTable {
	
	WebDriver drivers;
	
	@Given("^Proceed to login page$")
	public void proceed_to_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Soft\\chromedriver.exe");
		drivers = new ChromeDriver();
		drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^user enters\"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		drivers.findElement(By.id("txtUsername")).sendKeys(arg1);
		drivers.findElement(By.id("txtPassword")).sendKeys(arg2);
	}

	@When("^clicked button$")
	public void clicked_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		drivers.findElement(By.id("btnLogin")).click();
	}
	}




