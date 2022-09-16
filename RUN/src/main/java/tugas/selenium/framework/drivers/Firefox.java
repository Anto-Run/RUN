package tugas.selenium.framework.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
				
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
