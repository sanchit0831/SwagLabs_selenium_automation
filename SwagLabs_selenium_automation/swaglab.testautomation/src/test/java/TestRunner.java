
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",
		glue = "StepDefinitions",
		plugin = "pretty",
		monochrome = true // To make the output more readable
)
public class TestRunner extends AbstractTestNGCucumberTests {}
