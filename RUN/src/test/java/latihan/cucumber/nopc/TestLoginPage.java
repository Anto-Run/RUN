package latihan.cucumber.nopc;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import latihan.cucumber.framework.constraint.Constants;
import latihan.cucumber.page.nopc.LoginPage;

public class TestLoginPage {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestLoginPage() {
		driver = SceneFirstHook.driver;
		extentTest = SceneFirstHook.extentTest;
	}
	
	@When("User go to Web NOPC")
	public void user_go_to_web_nopc() {
		
		driver.get(Constants.URL_NOPC);
		extentTest.log(LogStatus.PASS, "User go to web NOPC");
	}
	
	@When("User enter invalid email and password")
	public void user_enter_invalid_email_and_password() throws Exception {
		String email="admin@yourstore.com";
		String password="123";
		loginPage.clearAll();
		loginPage.login("admin@yourstore.com", "123");
		
		System.out.println("=======================================");
		System.out.println("TEST INVALID LOGIN EMAIL");
		System.out.println("Email: " + email);
		System.out.println("Pass : " + password);
		
		extentTest.log(LogStatus.PASS, "User enter invalid username password");
	}
	
	@When("User click button login")
	public void user_click_button_login() {
		loginPage.clickBtnSubmit();
	}
	
	@Then("User invalid credentials")
	public void user_invalid_credentials() {
		String txt = "Login was unsuccessful. Please correct the errors and try again.";
		assertTrue(loginPage.getTxtInvalidLogin().contains(txt));
		System.out.println("Text Expected: " + txt);
		System.out.println("=======================================");
		
		extentTest.log(LogStatus.PASS, "User invalid credentials");
	}
	
	@When("User enter valid email and password")
	public void user_enter_valid_email_and_password() throws Exception {
		loginPage.clearAll();
		String email="admin@yourstore.com";
		String password="admin";
		loginPage.login(email, password);
		
		System.out.println("=======================================");
		System.out.println("TEST VALID LOGIN EMAIL");
		System.out.println("Email: " + email);
		System.out.println("Pass : " + password);
		
		extentTest.log(LogStatus.PASS, "User enter valid username password");
		
	}
	
	@When("User click button login valid")
	public void user_click_button_login_valid() {
		loginPage.clickBtnSubmit();
	}
	
	@Then("User valid credentials")
	public void user_valid_credentials() {
		String txt = "Dashboard";
		assertTrue(loginPage.getTxtDashboard().contains(txt));
		System.out.println("Text Expected: " + txt);
		System.out.println("=======================================");
		
		extentTest.log(LogStatus.PASS, "User valid credentials");
	}



}
