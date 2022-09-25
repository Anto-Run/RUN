package ujian.ujiankelima.cucumber.shopqasceneoutline;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import latihan.cucumber.framework.connection.DriverSingleton;
import latihan.cucumber.framework.constraint.Constants;
import latihan.cucumber.framework.utils.Utils;
import ujian.ujiankelima.cucumber.scenariotest.SHOPQASceneOutline;

public class SceneHooks {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/shopqa/extentreport/shopqa-scene-outline-xr.html");
	private static SHOPQASceneOutline[] tests = SHOPQASceneOutline.values();
	private static final int[] DATA_OUTLINE = {3,3};
	private String testReport = "";
	
	@Before
	public void setUp() {		
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		testReport = tests[Utils.testCount].getTestName();
		extentTest = reports.startTest(testReport);
		if(Utils.countOutline==DATA_OUTLINE[Utils.testCount])
		{
			Utils.countOutline=0;
			Utils.testCount++;
		}
		Utils.countOutline++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, "SHOPQA_SceneOutlineHooks"+scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));;
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	
	
//	@AfterTest
	@AfterAll
	public static void closeBrowser() {
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		DriverSingleton.closeObjectInstance();
	}
	
}
