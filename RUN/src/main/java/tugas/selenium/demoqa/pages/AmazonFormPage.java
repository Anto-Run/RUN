package tugas.selenium.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tugas.selenium.framework.drivers.connection.DriverSingleton;



public class AmazonFormPage {
	
	private WebDriver driver;
	
	public AmazonFormPage() {
		
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		
	}
		@FindBy(xpath="//input[@id='first-name']")
		private WebElement firstName;
		
		@FindBy(xpath="//input[@id='last-name']")
		private WebElement lastName;
		
		@FindBy(xpath="//label[normalize-space()='Male']")
		private WebElement gender;
		
		
		@FindBy(xpath= "//input[@id='dob']")
		private WebElement dob;
		
		@FindBy(xpath="//input[@id='address']")
		private WebElement address;
		
		@FindBy(xpath="//input[@id='email']")
		private WebElement email;
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement password;
		
		@FindBy(xpath="//select[@id='role']")
		private WebElement role;
		
		@FindBy(xpath="//input[@id='company']")
		private WebElement company;
		
		@FindBy(xpath="//option[@value='High salary']")
		private WebElement jobExpectation;
		
		@FindBy(xpath = "//label[normalize-space()='Contribute to opensource projects']")
		private WebElement development;
		
		@FindBy(xpath = "//textarea[@id='comment']")
		private WebElement comment;
		
		@FindBy(xpath="//button[@id='submit']")
		private WebElement btnSubmit;
		
		@FindBy(xpath="//span[@id='submit-msg']")
		private WebElement txtMessage;
		
		
		public void amazonForm(String firstName, String lastName, String dob, String address, String email, String password, String roleJob, String company, String comment) throws Exception {
			this.firstName.sendKeys(firstName);
			Thread.sleep(500);
			this.lastName.sendKeys(lastName);
			gender.click();
			this.dob.sendKeys(dob);
			this.address.sendKeys(address);
			this.email.sendKeys(email);
			this.password.sendKeys(password);
			Select sRole = new Select(role);
			sRole.selectByValue(roleJob);
			this.company.sendKeys(company);
			jobExpectation.click();
			development.click();
			this.comment.sendKeys(comment);
			Thread.sleep(500);
			btnSubmit.click();
			
		}
		public String getTxtMessage() {
			return txtMessage.getText();
		}
		
	
		
		
		
		
		
		
		
	

}
