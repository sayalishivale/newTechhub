package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/MyFeature.feature",glue={"StepDefinition"}, plugin= {"pretty","html: target/cucumber-reports"})
public class RunCucumberTest {
	
}
