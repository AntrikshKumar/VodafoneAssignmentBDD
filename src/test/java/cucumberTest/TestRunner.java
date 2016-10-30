package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue={"stepDefinitions"},
		plugin={"html:target/site/cucumber-pretty",
		        "junit:target/site/cucumber.xml"}
		)

public class TestRunner {

}
