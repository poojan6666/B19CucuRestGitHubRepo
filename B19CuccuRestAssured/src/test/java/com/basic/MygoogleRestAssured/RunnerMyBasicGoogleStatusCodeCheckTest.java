package com.basic.MygoogleRestAssured;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ={"src/test/resources/com/basic/MygoogleRestAssured/TestGoogleStatusCode.feature"},
		
		glue={"com/basic/MygoogleRestAssured/"}
		
		)

public class RunnerMyBasicGoogleStatusCodeCheckTest {

}

