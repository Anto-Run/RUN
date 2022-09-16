package latihan.selenium.formy;



import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeForm {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testPracticeForm() throws Exception {
    driver.get("https://demoqa.com/automation-practice-form");
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("Runanto");
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Darmawan");
    driver.findElement(By.id("userEmail")).click();
    driver.findElement(By.id("userEmail")).click();
    driver.findElement(By.id("userEmail")).clear();
    driver.findElement(By.id("userEmail")).sendKeys("runanto72@gmail.com");
    driver.findElement(By.xpath("//div[@id='genterWrapper']/div[2]/div/label")).click();
    driver.findElement(By.id("userNumber")).click();
    driver.findElement(By.id("userNumber")).clear();
    driver.findElement(By.id("userNumber")).sendKeys("6287734562");
    driver.findElement(By.id("dateOfBirthInput")).click();
    driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/select")).click();
    new Select(driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/select"))).selectByVisibleText("1999");
    driver.findElement(By.xpath("//option[@value='1999']")).click();
    driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")).click();
    driver.findElement(By.xpath("//div[@id='subjectsContainer']/div/div")).click();
    driver.findElement(By.id("subjectsInput")).clear();
    driver.findElement(By.id("subjectsInput")).sendKeys("Co");
    driver.findElement(By.id("userForm")).submit();
    driver.findElement(By.id("subjectsInput")).clear();
    driver.findElement(By.id("subjectsInput")).sendKeys("Ma");
    driver.findElement(By.id("userForm")).submit();
    driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div/label")).click();
    driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[3]/label")).click();
    driver.findElement(By.xpath("//form[@id='userForm']/div[8]/div[2]/div")).click();
    driver.findElement(By.id("uploadPicture")).click();
    driver.findElement(By.id("uploadPicture")).clear();
    driver.findElement(By.id("uploadPicture")).sendKeys("C:\\fakepath\\OOP (8).jpg");
    driver.findElement(By.id("currentAddress")).click();
    driver.findElement(By.id("currentAddress")).clear();
    driver.findElement(By.id("currentAddress")).sendKeys("Jalan Permata 1");
    driver.findElement(By.id("state")).click();
    driver.findElement(By.id("react-select-3-option-1")).click();
    driver.findElement(By.xpath("//div[@id='city']/div/div/div")).click();
    driver.findElement(By.id("react-select-4-option-0")).click();
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.xpath("//div[@id='fixedban']/div/div")).click();
    driver.findElement(By.xpath("//div[@id='fixedban']/div/div")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
