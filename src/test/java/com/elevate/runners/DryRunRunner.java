package com.elevate.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/test/resources/features/",
		glue="com/elevate/steps",
		dryRun=true,
		monochrome=true,
		strict=true,
		tags="@regression"
		
		
		
		
		)



public class DryRunRunner {

}
