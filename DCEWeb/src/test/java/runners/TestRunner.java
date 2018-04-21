package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests/Registration.feature",
		glue = "src/test/java/stepDefinition"
	 )

public class TestRunner {

}