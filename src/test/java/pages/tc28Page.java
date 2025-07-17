package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc28Page {
    private WebDriver driver;

    // Locators for the history section
    private By historialSection = By.id("historial-section");
    private By queryDetails = By.id("query-details");
    private By specificQuery = By.xpath("//div[@class='query-item'][1]");

    public tc28Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHistorialSection() {
        driver.findElement(historialSection).click();
    }

    public boolean isHistorialLoaded() {
        return driver.findElement(historialSection).isDisplayed();
    }

    public void selectSpecificQuery() {
        driver.findElement(specificQuery).click();
    }

    public boolean areQueryDetailsDisplayed() {
        return driver.findElement(queryDetails).isDisplayed();
    }

    public boolean validateHistoricalData() {
        // Logic to compare historical data with current records
        // Placeholder for actual validation logic
        WebElement dataElement = driver.findElement(queryDetails);
        return dataElement != null && dataElement.getText().contains("Expected Data");
    }
}