package StepDefinitions;

import io.cucumber.java.en.*;

public class loginSteps {
	
	@Given("User is on login page of xyz website")
	public void user_is_on_login_page_xyz() {
	    System.out.println("User is on logic page");
	}

	@When("User enters username and password of xyz website")
	public void user_enters_username_and_password_xyz() {
		System.out.println("User enter username and password");
	}

	@When("Clicks on login button of xyz 	website")
	public void clicks_on_login_button_xyz() {
		System.out.println("Clicks on login button");
	}

	@Then("User is navigated to the home page of xyz website")
	public void user_is_navigated_to_the_home_page_xyz() {
		System.out.println("navigated to home page");
	}
}