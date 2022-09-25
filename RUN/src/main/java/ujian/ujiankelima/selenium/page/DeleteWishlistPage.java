package ujian.ujiankelima.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;
import tugas.selenium.framework.utils.Utils;

public class DeleteWishlistPage {
	
	private WebDriver driver;
	public  DeleteWishlistPage() {
		
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//div[@class='noo-product-item noo-product-sm-4 not_featured post-1497 product type-product status-publish has-post-thumbnail product_cat-t-shirt product_tag-t-shirt product_tag-women has-featured first instock shipping-taxable purchasable product-type-variable']//span[@class='noo-quick-view icon_zoom-in_alt']")
//	private WebElement btnZoomProduct;
//	
//	@FindBy(xpath="//h1[@class='product_title entry-title']")
//	private WebElement txtProduct;
//	
//	@FindBy(xpath="//a[@class='noo-quick-link']")
//	private WebElement btnSelectOption;
//	
//	@FindBy(xpath="//div[contains(@class,'no-icon wishlist-fragment on-first-load')]//a[@class='add_to_wishlist single_add_to_wishlist']")
//	private WebElement btnAdd;
//	
//	@FindBy(xpath="//td[@class='product-name']")
//	private WebElement txtAdd;
//	
//	@FindBy(xpath="//a[@class='woocommerce-store-notice__dismiss-link']")
//	private WebElement btnDismiss;
//	
//	@FindBy(xpath="//a[normalize-space()='My Wishlist']")
//	private WebElement btnMyWishlist;
	
	@FindBy(xpath="//a[@title='Remove this product']")
	private WebElement btnDelete;
	
	@FindBy(xpath="//div[@role='alert']")
	private WebElement txtResultDelete;
	
	public void DeleteWishlistProduct(){
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnDelete.click();
		
	}
	
	public String getTxtDelete() {
		return txtResultDelete.getText();
	}

	//Product successfully removed.
}
