package amedigital.apitest.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/validarApi.feature",
		glue = { "amedigital.apitest.steps" },
		monochrome = true,
		dryRun = false,
		strict= true)
public class Runner {

}
