package stepDefination;

import Page1.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	LoginPage login=new LoginPage();
	
	@Given("User launch site URL")
	public void user_launch_site_url() {
		
		login.user_launch_site_url();
	}

	@When("User enter correct username & password details")
	public void user_enter_correct_username_password_details() {
 
		login.user_enter_correct_username_password_details();
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
	   
		login.user_click_on_login_button();
	}

	@Then("Validate user login navigate to Home")
	public void validate_user_login_navigate_to_home() {
	 
		login.validate_user_login_navigate_to_home();
	}
	
}
