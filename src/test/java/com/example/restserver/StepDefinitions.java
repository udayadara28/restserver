package com.example.restserver;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT, classes = RestserverApplication.class)
public class StepDefinitions {
	
	String url = null;
	double result =0;
	
	//double expectedResult;
	@Given("rest api {string}")
	public void restApi(String url) {
		this.url = url;
		// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("i invoke api")
	public void iInvokeApi() {
	    // Write code here that turns the phrase above into concrete actions
	    RestTemplate restApi = new RestTemplate();
	    result = restApi.getForObject(url,Double.class);
		//throw new cucumber.api.PendingException();
	}

	@Then("expected result {double}")
	public void expectedResult(Double expectedResult) {
		assertEquals(expectedResult,result,0.01);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

}
