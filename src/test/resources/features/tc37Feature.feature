Feature: Validate external API response during integration

  Scenario: Integration with external API
    Given the system has valid integration credentials
    When the system sends a request to the external API
    Then the request should contain the correct parameters
    When the API processes the request and returns data
    Then the response should be in the expected format
    When the system integrates the response
    Then the integration should be successful and data should match