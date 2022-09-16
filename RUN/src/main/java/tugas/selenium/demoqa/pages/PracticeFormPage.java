package tugas.selenium.demoqa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tugas.selenium.framework.drivers.connection.DriverSingleton;

public class PracticeFormPage {
	private WebDriver driver;
	
	public PracticeFormPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstName")
	private WebElement firstName;

	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="userEmail")
	private WebElement userEmail;
	
	@FindBy(id="userNumber")
	private WebElement userNumber;
	
	@FindBy(xpath="//div[@id='genterWrapper']/div[2]/div/label")
	private WebElement gender;
	
	@FindBy(id= "dateOfBirthInput")
	private WebElement dateOfBirthInput;
	
	@FindBy(id="subjectsInput")
	private WebElement subject;
	
	@FindBy(xpath = "//div[@id='hobbiesWrapper']/div[2]/div/label")
	private WebElement checkBtnSport;
	
	@FindBy(xpath = "//div[@id='hobbiesWrapper']/div[2]/div[2]/label")
	private WebElement checkBtnReading;
	
	@FindBy(xpath = "//div[@id='hobbiesWrapper']/div[2]/div[3]/label")
	private WebElement checkBtnMusic;
	
	@FindBy(xpath ="//input[@type='file']")
	private WebElement uploadPicture;
	
	@FindBy(xpath = "//textarea[@id='currentAddress']")
	private WebElement currentAddress;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement btnSubmit;
	
	@FindBy(id = "state")
	private WebElement state;
	
	@FindBy(id = "city")
	private WebElement city;
	
	@FindBy(xpath="//div[@id='example-modal-sizes-title-lg']")
	private WebElement txtDoneUpload;

	public void practiceForm(String firstName, String lastName, String userEmail, String userNumber, String dateOfBirthInput, String subject, String urlFileUpload, String currentAddress) throws Exception {
		//Zoom out
		Robot robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		this.userEmail.sendKeys(userEmail);
		gender.click();
		this.userNumber.sendKeys(userNumber);
		this.dateOfBirthInput.sendKeys(Keys.CONTROL+"A");
		this.dateOfBirthInput.sendKeys(dateOfBirthInput);
		this.dateOfBirthInput.sendKeys(Keys.ENTER);
		
		// Untuk Scroll Page
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", btnSubmit);
		
		this.subject.sendKeys(subject);
		this.subject.sendKeys(Keys.ENTER);
		checkBtnMusic.click();
		this.uploadPicture.sendKeys(urlFileUpload);
		this.currentAddress.sendKeys(currentAddress);
		state.click();
		Thread.sleep(100);
		List<WebElement> selectedItemState = driver.findElements(By.id("react-select-3-option-2"));
		selectedItemState.get(0).click();
		city.click();
		Thread.sleep(500);
		List<WebElement> selectedItemCity = driver.findElements(By.id("react-select-4-option-1"));
		selectedItemCity.get(0).click();
		btnSubmit.click();
		Thread.sleep(3000);
	}
	
	public String getTxtDoneUpload() {
		return txtDoneUpload.getText();
	}
	

}
