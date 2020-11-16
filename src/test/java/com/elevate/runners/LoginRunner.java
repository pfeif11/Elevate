package com.elevate.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue="com/elevate/steps",
		dryRun=false,
		monochrome=true,
		strict=true,
		tags="@regression",
				plugin= {"pretty",
						"html:target/cucumber-default-report",
				"json:target/cucumber.json",
				"rerun:target/failed.txt" }
		
		)


public class LoginRunner {

}
