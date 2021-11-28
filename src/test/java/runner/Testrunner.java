package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",glue= {"stepdefinaion"},
		plugin= {"html:target/reports",
				"json:target/cucumber.json",
				"junit:target/cucumber_relusts.xml"})
public class Testrunner {

}
