package ujian.ujiankeempat.nopcommerce;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.framework.drivers.connection.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath="//h1[normalize-space()='Dashboard']")
	private WebElement txtDashboard;
	
	@FindBy(xpath="//span[@id='Email-error']")
	private WebElement txtEmailError;
	
	@FindBy(xpath="//li[normalize-space()='The credentials provided are incorrect']")
	private WebElement txtPasswordError;
	
	
	//tanpa clear email dan password
	public void login() throws Exception {
		email.click();
		password.click();
		btnSubmit.click();
		Thread.sleep(1000);
	}
	
	//Dengan clear email dan password
	public void loginClear(String email, String password) throws Exception {
		this.email.clear();
		Thread.sleep(1000);
		this.email.sendKeys(email);
		Thread.sleep(1000);
		this.password.clear();
		Thread.sleep(1000);
		this.password.sendKeys(password);
		btnSubmit.click();
		
	}
	
	
	public String getTxtDashboard() {
		
		return txtDashboard.getText();
	}
	
	public String getTxtEmailError() {
		
		return txtEmailError.getText();
	}
	
	public String getTxtPasswordError() {
		
		return txtPasswordError.getText();
	}


}
