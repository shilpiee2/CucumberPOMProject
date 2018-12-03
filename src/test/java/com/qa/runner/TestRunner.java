package com.qa.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:/Users/s.a.bose/workspace/CucumberPOM/src/main/java/com/qa/features" // path
																														// of
																														// feature
																														// file
	, glue = { "com/qa/stepdefination" }, // path of the step definition
	format = { "pretty", "html:test-outputs", "json:json_output/cucumber.json",
			"junit:junit_xml/cucumber.xml" },// to generate different kind of
												// reports.
	dryRun = false,
	monochrome = true, // to display console in readable format
	strict = true // it will fail if any pending/undefined steps are present
	)
	public class TestRunner {
		
		
	}
