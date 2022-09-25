package ujian.ujiankelima.selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;
import ujian.ujiankelima.selenium.page.ZoomProductPage;

public class TestZoomProduct {

	private WebDriver driver;
	private ZoomProductPage zoomProduct;
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_SHOP_QA);
		zoomProduct = new ZoomProductPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testZoomProduct() throws Exception {
		String strExpect ="PINK DROP SHOULDER";
		zoomProduct.zoomProduct();
		System.out.println("---------- Test Zoom Product ---------------");
		assertTrue(zoomProduct.getTxtProduct().contains(strExpect));
		System.out.println("Expectation Message: " +strExpect);
		System.out.println("--------------------------------------------");
		
	}
}
