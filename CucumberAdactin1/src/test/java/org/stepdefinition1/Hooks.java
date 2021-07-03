package org.stepdefinition1;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass1;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass1{
	@Before
	public void beforeScenario() {
		System.out.println("Scenario starts....");
		launchBrowser() ;
		maximizeWindow() ;
		applWaitToAllLocators();
	}
	@After
	public void afterScenario(Scenario s) throws IOException  
	{
		if(s.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");
		}
	//String name= s.getName();
	//takeSnap(name);
		closeBrowser();
		System.out.println("Scenario ends.....");
	}

}


}
