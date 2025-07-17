package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc8Page;

public class tc8Steps {

    tc8Page page = new tc8Page();

    @Given("the system receives information from core applications via shell scripts")
    public void system_receives_information() {
        page.receiveInformation();
    }

    @When("the batch starts reading the data")
    public void batch_starts_reading() {
        page.startBatchReading();
    }

    @Then("the system confirms the batch has initiated the reading process successfully")
    public void confirm_batch_initiation() {
        page.verifyBatchInitiation();
    }

    @When("the batch process executes the ETL scripts and sends information to the database")
    public void batch_executes_ETL() {
        page.executeETLScripts();
    }

    @Then("the scripts should execute without errors and transfer the data")
    public void confirm_data_transfer() {
        page.verifyDataTransfer();
    }

    @When("the system confirms the data update in CBS and Acticenter")
    public void confirm_data_update() {
        page.verifyDataUpdate();
    }

    @Then("both systems should display synchronized data")
    public void verify_data_synchronization() {
        page.confirmDataSynchronization();
    }
}