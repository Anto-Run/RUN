package ujian.ujiankelima.cucumber.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.cucumber.framework.connection.DriverSingleton;


public class SearchPage {

private WebDriver driver;
	
	public SearchPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='noo-search']")
	private WebElement btnSearch;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement inputSearch;
	
	@FindBy(xpath="//p[@class='woocommerce-result-count']")
	private WebElement txtResult;
	
	public void searchData(String txtSearch) {
		this.inputSearch.sendKeys(txtSearch);
		this.inputSearch.sendKeys(Keys.ENTER);
		
	}
	
	public void clickBtnSearch() {
		btnSearch.click();
	}
	
	public String getTxtResult() {
		return txtResult.getText();
	}
}
