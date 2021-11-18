package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogle {
	
	WebDriver drivers;
	
	@Given("^user is entering google\\.co\\.in$")
	public void user_is_entering_google_co_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				System.setProperty("webdriver.chrome.driver", "D:\\Soft\\chromedriver.exe");
				drivers = new ChromeDriver();
			    drivers.get("https://www.google.co.in");
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		drivers.findElement(By.name("q")).sendKeys("BMW");

	}

	@When("^enters the return key$")
	public void enters_the_return_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		drivers.findElement(By.name("q")).sendKeys(Keys.RETURN);

	}

	@Then("^the user should see the search results$")
	public void the_user_should_see_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = drivers.findElement(By.partialLinkText("BMW")).isDisplayed();
		if (status) {
		 System.out.println("Results displayed");

	}
	}
	
}
