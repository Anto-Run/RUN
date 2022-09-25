package ujian.ujiankelima.selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;
import tugas.selenium.framework.utils.Utils;
import ujian.ujiankelima.selenium.page.SearchPage;

public class TestSearchPage{
	
	private WebDriver driver;
	private SearchPage searchPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_SHOP_QA);
		searchPage = new SearchPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	

	@Test
	public void testSearchData() throws Exception {
		String strSearch = "Black";
		String strExpect = "Showing all";
		searchPage.clickBtnSearch();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		searchPage.searchData(strSearch);
		System.out.println("---------- Test Search Data ---------------");
		assertTrue(searchPage.getTxtResult().contains(strExpect));
		System.out.println("Expectation Message: " +strExpect);
		System.out.println("--------------------------------------------");
		
	}

}
