package amedigital.testweb.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/validarLogin.feature",
		glue = { "amedigital.testweb.steps" },
		tags = { "@CenariosLogin" },
		monochrome = true,
		dryRun = false,
		strict= true)
public class Runner {

}
