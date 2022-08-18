package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features/GoogleSearch.feature",
		glue= {"StepDefinitions"},
		monochrome= true,
		plugin = {"pretty", "junit:target/JUnitReports/GoogleReport.xml",
				"json:target/JSONReports/GoogleReport.json",
				"html:target/HTMLReport/GoogleReport.html"}
				)
public class TestRunner {

} 
