package org.testrunner1;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Failed\\failedscenarios.txt",glue="org.stepdefinition",dryRun=true, monochrome=true, strict = false,tags= {"@search"},plugin= {"pretty","html:src\\test\\resources\\Reports","json:src\\test\\resources\\Reports\\output.json","junit:src\\test\\resources\\Reports\\adc.xml"})

public class TestRunner2 {

	@AfterClass
	public static void jvmReportGeneration() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"src\\test\\resources\\Reports\\output.json ");
	}
}



