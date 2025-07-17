package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class tc12Page {

    WebDriver driver;
    By contractNumberField = By.id("contractNumber");
    By invalidEntryNotification = By.id("invalidEntryNotification");

    public tc12Page(WebDriver driver) {
        this.driver = driver;
    }

    public void goToContractsPage() {
        driver.get("https://example.com/contracts");
    }

    public void enterContractNumber(String text) {
        WebElement contractNumberInput = driver.findElement(contractNumberField);
        contractNumberInput.clear();
        contractNumberInput.sendKeys(text);
    }

    public void verifyInvalidEntryMessage() {
        WebElement notification = driver.findElement(invalidEntryNotification);
        Assert.assertTrue(notification.isDisplayed());
        Assert.assertEquals("Error en formato del campo", notification.getText());
    }

    public void verifyEntryAccepted() {
        WebElement contractNumberInput = driver.findElement(contractNumberField);
        String value = contractNumberInput.getAttribute("value");
        Assert.assertTrue(value.matches("\\d+"));
    }
}