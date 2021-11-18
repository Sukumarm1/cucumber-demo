package stepDefinitions;

import cucumber.api.java.en.Given;

public class ExpressionSteps {
	

@Given("^I have (\\d+) laptop$")
public void i_have_laptop(int count) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Laptop count " + count);
}

@Given("^I have a (\\d+\\.\\d+) CGPA$")
public void i_have_a_CGPA(float num) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("CGPA is "+ num);
}

@Given("^\"([^\"]*)\" is elder to \"([^\"]*)\" and \"([^\"]*)\"$")
public void is_elder_to_and(String name, String name2, String arg3) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println(name + "is elder to"+ name2 + " and "+ 	arg3);
}

	
	
}
