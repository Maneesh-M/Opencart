package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Project.feature",
		tags = {"@TC01_"},
		glue = {"com.StepDefinition"},
		monochrome = true
		)
public class RegisterLogin {

}
