package latihan.cucumber;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import latihan.selenium.pagefactoryobject.pages.LoginPage;

public class LoginImplementasi {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public LoginImplementasi() {
		driver = SceneFirstHook.driver;
		extentTest = SceneFirstHook.extentTest;
	}
	
	
	@When("User go to Web HRM")
	public void user_go_to_web_hrm() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter username password invalid")
	public void user_enter_username_password_invalid() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click button login")
	public void user_click_button_login() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User invalid credentials")
	public void user_invalid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter username password valid")
	public void user_enter_username_password_valid() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click button login valid")
	public void user_click_button_login_valid() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User valid credentials")
	public void user_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
