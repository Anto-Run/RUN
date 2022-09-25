package ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.demoqa.pages.AmazonFormPage;
import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;

public class TestLoginPage {
	private WebDriver driver;
	private LoginPage loginPage;
	
	
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_NOPC);
		loginPage = new LoginPage();
		
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	//Positive test
	@Test (priority=0)
	public void testLoginPage() throws Exception {
		loginPage.login();
		assertTrue(loginPage.getTxtDashboard().contains("Dashboard"));
		
	}
	
	@Test (priority=1)
	public void testLoginPageClear() throws Exception {
		loginPage.loginClear("admin@yourstore.com", "admin");
		assertTrue(loginPage.getTxtDashboard().contains("Dashboard"));
	}
	
	
	@Test(priority=2)
	//Negative test
	public void testLoginPageClearEmailNull() throws Exception {
		loginPage.loginClear("", "admin");
		assertTrue(loginPage.getTxtEmailError().contains("Please enter"));
	}
	
	
	@Test(priority=3)
	//Negative test
	public void testLoginPageClearPasswordNull() throws Exception {
		loginPage.loginClear("admin@yourstore.com", "");
		assertTrue(loginPage.getTxtPasswordError().contains("The credentials"));
	}
	

}
