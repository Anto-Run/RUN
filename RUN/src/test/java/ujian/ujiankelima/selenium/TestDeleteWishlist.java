package ujian.ujiankelima.selenium;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;
import tugas.selenium.framework.utils.Utils;
import ujian.ujiankelima.selenium.page.AddWishlistPage;
import ujian.ujiankelima.selenium.page.DeleteWishlistPage;

public class TestDeleteWishlist {
	
	private WebDriver driver;
	private AddWishlistPage addWishlist;
	private DeleteWishlistPage deleteWishlist;
	
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_SHOP_QA);
		addWishlist = new AddWishlistPage();
		deleteWishlist = new DeleteWishlistPage();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testDeleteWishlistProduct() throws Exception {
		String strExpect ="Product successfully removed.";
		addWishlist.addWishlistProduct();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		deleteWishlist.DeleteWishlistProduct();
		System.out.println("---------- Test Delete  Wishlist Product-------");
		assertTrue(deleteWishlist.getTxtDelete().contains(strExpect));
		System.out.println("Expectation Message: " +strExpect);
		System.out.println("--------------------------------------------");
		
	}

}
