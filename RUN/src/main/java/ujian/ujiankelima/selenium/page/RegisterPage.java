package ujian.ujiankelima.selenium.page;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.framework.drivers.connection.DriverSingleton;
import tugas.selenium.framework.utils.Constants;
import tugas.selenium.framework.utils.Utils;

public class RegisterPage {

	private WebDriver driver;
	public RegisterPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='My Account']")
	private WebElement btnAccount;
	
	@FindBy(xpath="//input[@id='reg_username']")
	private WebElement txtUsername;
	
	@FindBy(xpath="//input[@id='reg_email']")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='reg_password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[@name='register']")
	private WebElement btnRegister;
	
	@FindBy(xpath="//p[@class='login message']")
	private WebElement txtRegisterValid;
	
	@FindBy(xpath="//div[@id='primary']//li[1]")
	private WebElement txtRegisterInvalid;
	
	@FindBy(xpath="//a[@class='woocommerce-store-notice__dismiss-link']")
	private WebElement btnDismiss;
	
	public void registrasi(String username, String email, String password) throws Exception {
//		Utils.zoomOut(100);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		this.txtUsername.sendKeys(username);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		this.txtEmail.sendKeys(email);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		this.txtPassword.sendKeys(password);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		
	}
	
	public void clickBtnDismiss() {
		btnDismiss.click();
	}
	public void clickBtnAccount() {
		btnAccount.click();
	}
	
	public void clickBtnRegister() {
		btnRegister.click();
	}
	
	public String getTxtRegisterValid() {
		return txtRegisterValid.getText();
	}
	
	public String getTxtRegisterInvalid() {
		return txtRegisterInvalid.getText();
	}
	
	
	
	
	
}
