package ujian.ujiankelima.cucumber.shopqasceneoutline;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/ujiankelima/001LoginInvalid.feature",
		"src/test/resources/features/ujiankelima/002SearchData.feature"},
glue = "ujian.ujiankelima.cucumber.shopqasceneoutline",
monochrome=true,
plugin = {"pretty","html:target/shopqa/htmlreport/SHOPQAOutline.html",
		"json:target/shopqa/jsonreport/SHOPQAOutline.json",
		"junit:target/shopqa/junitreport/SHOPQAOutline.xml"})


public class TestRunner extends AbstractTestNGCucumberTests {

}
