package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc16Page {

    WebDriver driver;

    By batchProcessButton = By.id("startBatchProcess");
    By etlStatusLabel = By.id("etlStatus");
    By successMessageLabel = By.id("successMessage");

    public Tc16Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openBatchProcessPage() {
        driver.get("http://example.com/batch_process");
    }

    public void startBatchProcess() {
        driver.findElement(batchProcessButton).click();
    }

    public void verifyBatchStarted() {
        // Implement a check to verify batch process has started
    }

    public void runEtlScripts() {
        // Trigger ETL scripts execution and wait for completion
    }

    public void verifyEtlProcess() {
        // Implement verification logic for ETL process
        String status = driver.findElement(etlStatusLabel).getText();
        assert status.equals("Processed Successfully");
    }

    public void completeBatchProcess() {
        // Logic to wait for batch process completion
    }

    public void verifySuccessMessage() {
        // Verify if the success message is present in the interface
        String message = driver.findElement(successMessageLabel).getText();
        assert message.equals("Batch Process Completed Successfully");
    }
}