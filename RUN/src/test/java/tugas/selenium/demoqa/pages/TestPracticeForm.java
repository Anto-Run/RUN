package tugas.selenium.demoqa.pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;

public class TestPracticeForm {
	
	private static WebDriver driver;	
	private  PracticeFormPage practiceFormPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_DEMOQA.concat("automation-practice-form"));
		practiceFormPage = new PracticeFormPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}

	@Test
	public void testPracticeForm() throws Exception {
		String firstName = "Runanto";
		String lastName = "Darmawan";
		String email = "run123@gmail.com";
		String userNumber = "08587234563";
		String dateOfBirth = "03 Feb 2005";
		String subjects = "Computer Science";
		String urlUploadPicture = "C:\\Users\\NEXSOFT\\Downloads\\OOP.jpg";
		String currentAddress = "Jl Permata";
		practiceFormPage.practiceForm(firstName, lastName,email, userNumber,dateOfBirth, subjects, urlUploadPicture,currentAddress);
		assertTrue(practiceFormPage.getTxtDoneUpload().contains("Thanks"));

	}

}
