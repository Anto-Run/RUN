package ujian.ujiankeempat.nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.framework.drivers.connection.DriverSingleton;

public class ManufacturesPage {
	private WebDriver driver;
	
	public ManufacturesPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath="//input[@id='SearchManufacturerName']")
	private WebElement manufacturerName;
	
	@FindBy(xpath="//select[@id='SearchPublishedId']")
	private WebElement published;
	
	@FindBy(xpath="//td[normalize-space()='Apple']")
	private WebElement dataSearch;
	
	@FindBy(xpath="//button[@id='search-manufacturers']")
	private WebElement btnSearch;
	
	@FindBy(xpath="//p[normalize-space()='Manufacturers']")
	private WebElement btnManufactures;
	
	@FindBy(xpath="//p[normalize-space()='Catalog']")
	private WebElement btnCatalog;
	
	@FindBy(xpath="//td[@class='dataTables_empty']")
	private WebElement txtEmpty;
	
	public void manufactures(String manufacturerName, String published) throws Exception {
		
		btnSubmit.click();
		Thread.sleep(1000);
		btnCatalog.click();
		Thread.sleep(1000);
		btnManufactures.click();
		this.manufacturerName.sendKeys(manufacturerName);
		this.published.sendKeys(published);
		btnSearch.click();
		
	}
	public String getdataSearch() {
		return dataSearch.getText();
	}
	
	public String getTxtEmpty() {
		return txtEmpty.getText();
	}
	
	

}
