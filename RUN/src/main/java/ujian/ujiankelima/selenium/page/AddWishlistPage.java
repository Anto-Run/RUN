package ujian.ujiankelima.selenium.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;
import tugas.selenium.framework.utils.Utils;

public class AddWishlistPage {
	
	private WebDriver driver;
	public  AddWishlistPage() {
		
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='noo-product-item noo-product-sm-4 not_featured post-1497 product type-product status-publish has-post-thumbnail product_cat-t-shirt product_tag-t-shirt product_tag-women has-featured first instock shipping-taxable purchasable product-type-variable']//span[@class='noo-quick-view icon_zoom-in_alt']")
	private WebElement btnZoomProduct;
	
	@FindBy(xpath="//h1[@class='product_title entry-title']")
	private WebElement txtProduct;
	
	@FindBy(xpath="//a[@class='noo-quick-link']")
	private WebElement btnSelectOption;
	
	@FindBy(xpath="//div[contains(@class,'no-icon wishlist-fragment on-first-load')]//a[@class='add_to_wishlist single_add_to_wishlist']")
	private WebElement btnAdd;
	
	@FindBy(xpath="//td[@class='product-name']")
	private WebElement txtAdd;
	
	@FindBy(xpath="//a[@class='woocommerce-store-notice__dismiss-link']")
	private WebElement btnDismiss;
	
	@FindBy(xpath="//a[normalize-space()='My Wishlist']")
	private WebElement btnMyWishlist;
	
	public void addWishlistProduct(){
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnZoomProduct.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnSelectOption.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnAdd.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnDismiss.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnMyWishlist.click();
		
	}
	
	public String getTxtAdd() {
		return txtAdd.getText();
	}
	

}
	
	


