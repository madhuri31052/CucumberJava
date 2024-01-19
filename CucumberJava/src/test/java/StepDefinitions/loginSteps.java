package StepDefinitions;

import io.cucumber.java.en.*;

public class loginSteps {
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    System.out.println("User is on logic page");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enter username and password");
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Clicks on login button");
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("navigated to home page");
	}
}