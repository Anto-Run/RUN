package tugas.selenium.framework.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome implements DriverStrategy {

	public WebDriver setStrategy() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NEXSOFT\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		
		return new ChromeDriver(options);
		
	}

}
