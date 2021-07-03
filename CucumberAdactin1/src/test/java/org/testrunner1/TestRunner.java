package org.testrunner1;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeautureFile2",glue="org.stepdefinition",dryRun=false, monochrome=true, strict = false,tags= {"search"},plugin= {"pretty","html:src\\test\\resources\\Reports","json:src\\test\\resources\\Reports\\output.json","junit:src\\test\\resources\\Reports\\adc.xml"})

public class TestRunner {

}
