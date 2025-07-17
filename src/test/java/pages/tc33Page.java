package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc33Page {

    WebDriver driver;

    By contractNumberInput = By.id("contractNumber");
    By submitButton = By.id("submitBtn");
    By errorMessage = By.id("errorMsg");
    By retryButton = By.id("retryBtn");
    By cancelButton = By.id("cancelBtn");

    public tc33Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToConsultaPage() {
        driver.get("http://example.com/consulta-contratos");
    }

    public void enterContractNumber(String contrato) {
        driver.findElement(contractNumberInput).sendKeys(contrato);
    }

    public void submitQuery() {
        driver.findElement(submitButton).click();
    }

    public boolean isContractNotFound() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public boolean canRetryOrCancel() {
        return driver.findElement(retryButton).isDisplayed() && 
               driver.findElement(cancelButton).isDisplayed();
    }
}