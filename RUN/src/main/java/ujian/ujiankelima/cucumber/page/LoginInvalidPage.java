package ujian.ujiankelima.cucumber.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.cucumber.framework.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;
import tugas.selenium.framework.utils.Utils;



public class LoginInvalidPage {

	
	private WebDriver driver;
	public LoginInvalidPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//a[normalize-space()='My Account']")
//	private WebElement btnAccount;
//	
//	@FindBy(xpath="//a[@class='woocommerce-store-notice__dismiss-link']")
//	private WebElement btnDismiss;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement txtUnameEmail;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='rememberme']")
	private WebElement btnRememberMe;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//a[@title='Password Lost and Found']")
	private WebElement txtLoginInvalid;
	
	@FindBy(xpath="//strong[normalize-space()='ERROR']")
	private WebElement txtError;
	
	
	public void loginInvalid(String username, String password) {
		
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtUnameEmail.sendKeys(username);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		this.txtPassword.sendKeys(password);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		
	}
//	public void clickBtnDismiss() {
//		btnDismiss.click();
//	}
//	public void clickBtnAccount() {
//		btnAccount.click();
//	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	public String getTxtLoginInvalid() {
		return txtLoginInvalid.getText();
	}
	public String getTxtEror() {
		return txtError.getText();
	}
	
}
