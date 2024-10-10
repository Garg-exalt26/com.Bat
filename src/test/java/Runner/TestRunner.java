package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",glue= {"stepDefination"},tags="@Smoke")

public class TestRunner {

	
	/*different cucumber options are as follows-
	dryrun
	monochrome
	plugin
	features
	glue
	tags*/
}
