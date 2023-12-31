package zopper.TestRunner;



import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/main/java/featurefiles",glue="stepdefination",tags="@UserMnagement or @UserDashboard or @Gravience",
		plugin= {"html:target/cucumberreport.html","json:target/cucumberreport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//		tags={"@Tagfirst", "@Tagsecond"}
		)

		
		
		


public class TestExecutation extends AbstractTestNGCucumberTests {
//	@Override
//	@DataProvider(parallel = true)
//
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
}
