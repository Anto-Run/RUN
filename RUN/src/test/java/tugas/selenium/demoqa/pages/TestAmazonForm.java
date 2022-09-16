package tugas.selenium.demoqa.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;



public class TestAmazonForm {

	
	private static WebDriver driver;	
	private  AmazonFormPage amazonFormPage;
	

	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_AMAZONS);
		amazonFormPage = new AmazonFormPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testAmazonForm() throws Exception {
		String firstName = "Runanto"; 
		String lastName = "Darmawan"; 
		String dateOfBirth = "08/26/1999"; 
		String address ="Jl Permata";
		String email="run123@gmail.com";
		String password="run123";
		String roleJob = "QA"; 
		String company = "Nexsoft";
		String comment = "Sungguh Luar Biasa";
		amazonFormPage.amazonForm(firstName, lastName,dateOfBirth, address, email, password, roleJob,company, comment);
		assertTrue(amazonFormPage.getTxtMessage().contains("Successfully"));

	}
	
	
	
	
}
