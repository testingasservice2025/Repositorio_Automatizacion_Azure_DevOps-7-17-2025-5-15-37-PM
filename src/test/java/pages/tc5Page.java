package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc5Page {
    WebDriver driver;

    By contractNumberField = By.id("contractNumber");
    By submitButton = By.id("submit");
    By contractInfo = By.id("contractInfo");

    public tc5Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToContractPage() {
        driver.get("http://example.com/contract");
    }

    public void enterContractNumber(String contractNumber) {
        driver.findElement(contractNumberField).sendKeys(contractNumber);
    }

    public void submitContractNumber() {
        driver.findElement(submitButton).click();
    }

    public String getContractInformation() {
        return driver.findElement(contractInfo).getText();
    }
}