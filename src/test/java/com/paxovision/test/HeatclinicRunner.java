package com.paxovision.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	
		//dryRun = false,
		//strict = true,
		monochrome = true,
		//tags = { "@smoke" },
		//tags = { "@functional","@smoke" }, /*AND*/
		//tags = { "@functional,@smoke" }, /*OR*/
		//tags = { "@functional,@debug","@debug" }, /*AND-OR*/
		features = "src/test/resources/features",
		glue = {"com.paxovision.steps"},
		plugin={
	 "pretty",
	 "html:target/test-report",
	 "json:target/test-report.json",
	 "json:target/cucumber-report.json",
	 "junit:target/test-report.xml"
	}
)
public class HeatclinicRunner {

}
