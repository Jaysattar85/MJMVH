package com.syntax.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features/Entitlement.feature"}
				, glue= {""}
				, plugin ="pretty"
				, dryRun= true)
public class TestRunner {

}
 