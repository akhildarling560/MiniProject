package miniproject_Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",
tags = {"@search"},
glue = {"miniproject_StepDefinition"},
plugin= {"html:target/test_feature1.report"})
public class TestRunner4 {
private TestNGCucumberRunner testRunner;
	

	@BeforeClass
	public void setUP()
	{
		testRunner = new TestNGCucumberRunner(TestRunner4.class);	
		
		
	}
	@Test(description="login",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature)
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}

	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}

	@AfterMethod

	public void tearDown() throws InterruptedException
	{	
		
		testRunner.finish();
	}
}