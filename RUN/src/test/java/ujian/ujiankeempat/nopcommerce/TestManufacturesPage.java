package ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.demoqa.pages.AmazonFormPage;
import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;

public class TestManufacturesPage {

	private WebDriver driver;
	private ManufacturesPage manufacturesPage;
	private LoginPage loginPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_NOPCOMMERCE);
		manufacturesPage = new ManufacturesPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	//Positive Scenario
	
	//Test Scenario 1
	// Manufacturer Nama dikosongkan.
	// publishednya diisi All
	@Test (priority=0)
	public void testManufacturesFormNullAll() throws Exception {
		manufacturesPage.manufactures("", "All");
		assertTrue(manufacturesPage.getdataSearch().contains("Apple"));
		
	}
	
	//Test Scenario 2
	// Manufacturer Nama dikosongkan.
	// publishednya diisi published Only
	@Test (priority=1)
	public void testManufacturesFormNullPublishedOnly() throws Exception {
		manufacturesPage.manufactures("", "Published only");			
		assertTrue(manufacturesPage.getdataSearch().contains("Apple"));
			
	}
	
	//Test Scenario 3
	// Manufacturer Nama dikosongkan.
	// publishednya diisi published Only
	@Test (priority=2)
	public void testManufacturesFormNullUnPublishedOnly() throws Exception {
		manufacturesPage.manufactures("", "Unpublished only");			
		assertTrue(manufacturesPage.getTxtEmpty().contains("No data"));
			
	}
	
	//Test Scenario 4
	// Manufacturer Nama Apple (data sudah ada).
	// publishednya diisi All
	@Test(priority=3)
	public void testManufacturesFormCaseOne() throws Exception {
		manufacturesPage.manufactures("Apple", "All");
		assertTrue(manufacturesPage.getdataSearch().contains("Apple"));
		
	}
	
	//Test Scenario 5
	// Manufacturer Nama Apple (data sudah ada).
	// publishednya diisi Published Only
	@Test(priority=4)
	public void testManufacturesFormCaseTwo() throws Exception {
		manufacturesPage.manufactures("Apple", "Published Only");
		assertTrue(manufacturesPage.getdataSearch().contains("Apple"));
		
	}
	//Test Scenario 6
	// Manufacturer Nama Apple (data sudah ada).
	// publishednya diisi Unpublished only
	@Test(priority=5)
	public void testManufacturesFormCaseThree() throws Exception {
		manufacturesPage.manufactures("Apple", "Unpublished Only");
		assertTrue(manufacturesPage.getTxtEmpty().contains("No data"));
		
	}
	
	//Negative Scenario
	//Test Scenario 7
	// Manufacturer Nama Apple (data sudah ada).
	// publishednya diisi Unpublished only
	@Test(priority=6)
	public void testManufacturesFormNoData() throws Exception {
		manufacturesPage.manufactures("Samsung", "All");
		assertTrue(manufacturesPage.getTxtEmpty().contains("No data"));
		
	}

	
}
