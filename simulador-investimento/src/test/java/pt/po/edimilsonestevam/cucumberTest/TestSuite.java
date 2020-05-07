package pt.po.edimilsonestevam.cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/pt/po/edimilsonestevam/feature"}
                , glue = { "pt/po/edimilsonestevam/stepDefinition" }
				, plugin = {"html:target/cucumber-reports"}
				, dryRun = false
				, monochrome = true)

public class TestSuite {

}



