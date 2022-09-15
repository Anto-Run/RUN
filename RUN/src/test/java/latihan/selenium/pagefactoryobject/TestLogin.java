package latihan.selenium.pagefactoryobject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.selenium.pagefactoryobject.drivers.DriverSingleton;
import latihan.selenium.pagefactoryobject.pages.LoginPage;
import latihan.selenium.pagefactoryobject.util.Constants;
public class TestLogin {

	private static WebDriver driver;
	
	private LoginPage loginPage;
	
	@BeforeClass
	public void setUp() {
		
		
	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testValidLogin() {
		loginPage.login("Admin", "admin123");
		assertEquals(loginPage.getTxtEmp(), "Employee Information");
		assertTrue(loginPage.getTxtEmp().contains("Employe"));
		
	}
	@Test
	public void testValidLoginUsernameKapital() {
		loginPage.login("ADMIN", "admin123");
		assertEquals(loginPage.getTxtEmp(), "Employee Information");
		
	}
	
	@Test
	public void testInvalidUsernameNull() {
		loginPage.login("", "admin123");
		assertEquals(loginPage.getTxtRequired(), "Required");
	}
	
	@Test
	public void testInvalidUsername() {
		loginPage.login("Nexsoft", "admin123");
		assertEquals(loginPage.getTxtInvalid(), "Invalid credentials");
	}
	
	@Test
	public void testInvalidPasswordNull() {
		loginPage.login("Admin", "");
		assertEquals(loginPage.getTxtRequired(), "Required");
	}
	
	@Test
	public void testInvalidPassword() {
		loginPage.login("Admin", "123");
		assertEquals(loginPage.getTxtInvalid(), "Invalid credentials");
	}
	
	@Test
	public void testInvalidUsernamePasswordNull() {
		loginPage.login("", "");
		assertEquals(loginPage.getTxtRequired(), "Required");
	}
}
