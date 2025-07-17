Feature: Processing batch information

  Scenario: Verify batch process in data synchronization
    Given the system receives information from core applications via shell scripts
    When the batch starts reading the data
    Then the system confirms the batch has initiated the reading process successfully

    When the batch process executes the ETL scripts and sends information to the database
    Then the scripts should execute without errors and transfer the data

    When the system confirms the data update in CBS and Acticenter
    Then both systems should display synchronized data