package ujian.ujiankelima.selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;
import ujian.ujiankelima.selenium.page.AddWishlistPage;


public class TestAddWishlist {
	private WebDriver driver;
	private AddWishlistPage addWishlist;
	
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_SHOP_QA);
		addWishlist = new AddWishlistPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testAddWishlistProduct() throws Exception {
		String strExpect ="PINK DROP SHOULDER";
		addWishlist.addWishlistProduct();
		System.out.println("---------- Test Add  Wishlist Product-------");
		assertTrue(addWishlist.getTxtAdd().contains(strExpect));
		System.out.println("Expectation Message: " +strExpect);
		System.out.println("--------------------------------------------");
		
	}
}
