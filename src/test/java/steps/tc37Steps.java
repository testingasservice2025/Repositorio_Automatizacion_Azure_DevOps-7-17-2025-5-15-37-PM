package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import pages.tc37Page;

public class tc37Steps {

    tc37Page apiPage = new tc37Page();

    @Given("^the system has valid integration credentials$")
    public void the_system_has_valid_integration_credentials() {
        assertTrue(apiPage.hasValidCredentials());
    }

    @When("^the system sends a request to the external API$")
    public void the_system_sends_a_request_to_the_external_API() {
        apiPage.sendAPIRequest();
    }

    @Then("^the request should contain the correct parameters$")
    public void the_request_should_contain_the_correct_parameters() {
        assertTrue(apiPage.requestContainsCorrectParameters());
    }

    @When("^the API processes the request and returns data$")
    public void the_API_processes_the_request_and_returns_data() {
        apiPage.processAPIResponse();
    }

    @Then("^the response should be in the expected format$")
    public void the_response_should_be_in_the_expected_format() {
        assertTrue(apiPage.isResponseInExpectedFormat());
    }

    @When("^the system integrates the response$")
    public void the_system_integrates_the_response() {
        apiPage.integrateResponse();
    }

    @Then("^the integration should be successful and data should match$")
    public void the_integration_should_be_successful_and_data_should_match() {
        assertTrue(apiPage.isIntegrationSuccessful());
    }
}