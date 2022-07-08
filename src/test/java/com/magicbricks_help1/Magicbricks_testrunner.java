package com.magicbricks_help1;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit= "--step-notifications",
				plugin = {"json:target/cucumber.json"},
		features="C:\\eclipsce\\com.magicbricks_naveen\\cucumber\\magicbricks3.feature",
		glue={"com.magicbricks_teststeps"}
		,tags={"@magicbricks"}
				

		
		)


public class Magicbricks_testrunner {

}
