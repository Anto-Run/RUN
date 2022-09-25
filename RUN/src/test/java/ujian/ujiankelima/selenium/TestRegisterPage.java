package ujian.ujiankelima.selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;
import tugas.selenium.framework.utils.Utils;
import ujian.ujiankelima.selenium.page.RegisterPage;

public class TestRegisterPage {
	private WebDriver driver;
	
	private RegisterPage registerPage;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_SHOP_QA);
		registerPage = new RegisterPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	
	//Positive Test
	@Test
	public void testRegistrasiValid() throws Exception {
		//sebelum test bagian strUsername, email, dan password wajib diubah
		// dan berbeda dengan sebelumnya
		String strExpect ="Your session has expired";
		String strUsername ="dada";
		String strEmail ="dada@gmail.com";
		String strPassword ="danda1134Q07";
		registerPage.clickBtnDismiss();
		registerPage.clickBtnAccount();
		registerPage.registrasi(strUsername, strEmail, strPassword);
		registerPage.clickBtnRegister();
		assertTrue(registerPage.getTxtRegisterValid().contains(strExpect));
		
	}
	
	//Negative Test
//	@Test
//	public void testRegistrasiInvalid() throws Exception{
//		String strExpect ="Error: An account is already";
//		String strUsername ="mnda";
//		String strEmail ="anda@gmail.com";
//		String strPassword ="danda1134Q07";
//		System.out.println("------ Test Invalid Registrasi Akun -------");
//		registerPage.clickBtnDismiss();
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		registerPage.clickBtnAccount();
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		registerPage.registrasi(strUsername, strEmail, strPassword);
//		registerPage.clickBtnRegister();
//		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
//		assertTrue(registerPage.getTxtRegisterInvalid().contains(strExpect));
//		System.out.println("Expectation Message: " +strExpect);
//		System.out.println("--------------------------------------------");
//		
//	}
	
	
	
	

}
