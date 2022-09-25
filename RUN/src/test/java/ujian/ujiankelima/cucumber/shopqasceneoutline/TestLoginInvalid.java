package ujian.ujiankelima.cucumber.shopqasceneoutline;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tugas.selenium.framework.utils.Utils;
import ujian.ujiankelima.cucumber.page.LoginInvalidPage;


public class TestLoginInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginInvalidPage loginInvalidPage = new LoginInvalidPage ();
	
	public TestLoginInvalid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
		
	@When("User go to web SHOPQA")
	public void user_go_to_web_shopqa() {
		driver.get("https://shop.demoqa.com/my-account/");
		extentTest.log(LogStatus.PASS, "Browser open Web SHOPQA Outlinee");
	}

	@When("^User enter invalid (.*) and (.*)$")
	public void user_enter_invalid_username_and_password(String username, String password) throws Exception {
	    System.out.println("user_enter_invalid_username_and_password : "+ username +" pwd : "+password);
		loginInvalidPage.loginInvalid(username, password);
		extentTest.log(LogStatus.PASS, "enter_invalid_username_and_password");
	}

	@When("User click button login")
	public void user_click_button_login() {
		loginInvalidPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "button login clicked Outlinee");
	}

	@Then("System check credentials login")
	public void system_check_credentials_login() {
		String strExpect ="ERROR";
		// asserttrue ini jalankan apabila tidak dibatasi oleh admin.
//		assertTrue(loginInvalidPage.getTxtLoginInvalid().contains(strExpect));
		
		// asserttrue ini jalankan apabila dibatasi oleh admin.
		assertTrue(loginInvalidPage.getTxtEror().contains(strExpect));
		
		extentTest.log(LogStatus.PASS, "System check credentials invalid Outlinee");
	}

	

}
