package latihan.selenium.formy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompleteWebForm {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
		
		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);
		 
		 WebElement formFirstName = driver.findElement(By.id("first-name"));
		 formFirstName.sendKeys("Sutarno");

		 WebElement formLastName = driver.findElement(By.id("last-name"));
		 formLastName.sendKeys("Wibowo");
		 
		 WebElement formJobTitle = driver.findElement(By.id("job-title"));
		 formJobTitle.sendKeys("Quality Assurance");
		 
		 WebElement radioEducation = driver.findElement(By.id("radio-button-2"));
		 radioEducation.click();
		 
		 WebElement checkSex= driver.findElement(By.id("checkbox-1"));
		 checkSex.click();
		  
		Select sExperience = new Select(driver.findElement(By.id("select-menu")));
		sExperience.selectByValue("4");
//		sExperience.selectByIndex(1);
		
		
		WebElement dateBox = driver.findElement(By.id("datepicker"));
		dateBox.sendKeys("13/09/2022");
		//dateBox.sendKeys(Keys.TAB);
		
		WebElement submit = driver.findElement(By.partialLinkText("Submit"));
		submit.click();
		
}

}
