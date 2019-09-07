package com.basic.getRequestBasicSD;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
			
			features ={"src/test/resources/com/basic/getRequestBasicFF/GetRequestTesting.feature"},
			
		 	glue={"com/basic/getRequestBasicSD/"}
			
			)

	public class RunnerGETRequestTest {

	}


