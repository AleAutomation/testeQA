package br.com.correios.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature/testeAlelo.feature",
		glue = { "br.com.correios.steps" },
		monochrome = true,
		dryRun = false,
		strict= true)
public class Runner {

}
