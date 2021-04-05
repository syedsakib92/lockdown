package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features= {"Features"},
		glue="com.stepdef",
		tags="@userRegistration",
		plugin="pretty",
		monochrome=true
		
		)



public class TestRunner extends AbstractTestNGCucumberTests{

}
