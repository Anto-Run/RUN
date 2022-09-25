package ujian.ujiankelima.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;
import tugas.selenium.framework.utils.Utils;



public class ZoomProductPage {
	
	
	private WebDriver driver;
	
	public ZoomProductPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='noo-product-item noo-product-sm-4 not_featured post-1497 product type-product status-publish has-post-thumbnail product_cat-t-shirt product_tag-t-shirt product_tag-women has-featured first instock shipping-taxable purchasable product-type-variable']//span[@class='noo-quick-view icon_zoom-in_alt']")
	private WebElement btnZoomProduct;
	
	@FindBy(xpath="//h1[@class='product_title entry-title']")
	private WebElement txtProduct;
	
	public void zoomProduct(){
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		btnZoomProduct.click();
		
	}
	
	public String getTxtProduct() {
		return txtProduct.getText();
	}
	

}
