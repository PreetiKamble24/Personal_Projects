package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", // here as you are giving features folder name then all feature files in
											// folder will get executed. If given single then only single file will be executed.
		glue = "stepDefinations"
		)
public class TestRunner {

}
