package ujian.ujiankelima.cucumber.shopqasceneoutline;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import latihan.cucumber.framework.constraint.Constants;
import latihan.cucumber.framework.utils.Utils;
import ujian.ujiankelima.cucumber.page.SearchPage;

public class TestSearchData {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private SearchPage searchPage = new SearchPage();
	
	
	public TestSearchData() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	
	@When("User go to web")
	public void user_go_to_web() {
		driver.get(Constants.URL_SHOP_QA);
		extentTest.log(LogStatus.PASS, "Browser open Web SHOPQA Outlinee");
	}

	@When("User click button search")
	public void user_click_button_search() {
		searchPage.clickBtnSearch();;
		extentTest.log(LogStatus.PASS, "button search clicked Outlinee");
	}

	@When("^User enter (.*) data search$")
	public void user_enter_input_data_search(String strSearch) {
		System.out.println("user_enter_input_data_search data : "+ strSearch);
		searchPage.searchData(strSearch);
		extentTest.log(LogStatus.PASS, "ser_enter_input_data_search data");
	}

	@Then("System check credentials data search")
	public void system_check_credentials_data_search() {
		String strExpect = "Showing all";
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		System.out.println("---------- Test Search Data ---------------");
		assertTrue(searchPage.getTxtResult().contains(strExpect));
		System.out.println("Expectation Message: " +strExpect);
		System.out.println("--------------------------------------------");
		extentTest.log(LogStatus.PASS, "System check credentials data search");
	}
}
