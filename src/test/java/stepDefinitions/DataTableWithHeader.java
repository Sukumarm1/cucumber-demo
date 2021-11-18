package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


	public class DataTableWithHeader {
		WebDriver drivers;

		@Given("^Go to login page$")
		public void go_to_login_page() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "D:\\Soft\\chromedriver.exe");
			drivers = new ChromeDriver();
			drivers.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}

		@When("^enter the below credentials$")
		public void enter_the_below_credentials(DataTable datatable) throws Throwable {
			// Write code here that turns the phrase above into concrete actions
			// For automatic transformation, change DataTable to one of
			// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
			// E,K,V must be a scalar (String, Integer, Date, enum etc)
			
			
			List<Map<String, String>> keyvaluepair = datatable.asMaps(String.class, String.class);
			String userName = keyvaluepair.get(0).get("UserName");
			String passWord = keyvaluepair.get(0).get("Password");

			drivers.findElement(By.id("txtUsername")).sendKeys(userName);
			drivers.findElement(By.id("txtPassword")).sendKeys(passWord);
		}

		@When("^click login button$")
		public void click_login_button() throws Throwable {
			// Write code here that turns the phrase above into concrete actions
			drivers.findElement(By.id("btnLogin")).click();
		}

	

}
