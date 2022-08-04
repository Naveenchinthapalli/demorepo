package com.bdd.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature",   //path of the feature file
		glue="com.bdd.steps",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:target/index.html"},
		tags= "@sanity"
		)	
public class testRunner {
private TestNGCucumberRunner testngrunner;
@BeforeClass(alwaysRun=true)
public void setup() throws Exception {
	testngrunner=new TestNGCucumberRunner(this.getClass());
}

@Test(groups="cucumber",description="Runs Loginfeature",dataProvider="myFeatures")
public void feature(CucumberFeatureWrapper cucumberfeature) {
	testngrunner.runCucumber(cucumberfeature.getCucumberFeature());
}



@DataProvider(name="myFeatures")
public Object[][] getFeatures()
{
  
    return testngrunner.provideFeatures();
}


@AfterClass(alwaysRun=true)
public void teardown() throws Exception {
	testngrunner.finish();
}
}

