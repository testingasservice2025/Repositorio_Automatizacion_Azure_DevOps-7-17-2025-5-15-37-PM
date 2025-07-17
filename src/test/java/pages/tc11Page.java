package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc11Page {
    WebDriver driver;

    public tc11Page() {
        // Inicializar WebDriver (este ejemplo asume uso de ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public void navigateToCustomerNumberInputPage() {
        driver.get("http://example.com/customer-number-input");
    }

    public void enterInvalidCustomerNumber(String customerNumber) {
        WebElement numberInput = driver.findElement(By.id("customerNumberInput"));
        numberInput.clear();
        numberInput.sendKeys(customerNumber);
        driver.findElement(By.id("submitButton")).click();
    }

    public boolean isFormatErrorMessageDisplayed() {
        WebElement errorMessage = driver.findElement(By.id("formatErrorMessage"));
        return errorMessage.isDisplayed();
    }

    public void enterValidCustomerNumber(String customerNumber) {
        WebElement numberInput = driver.findElement(By.id("customerNumberInput"));
        numberInput.clear();
        numberInput.sendKeys(customerNumber);
        driver.findElement(By.id("submitButton")).click();
    }

    public boolean isProcessContinued() {
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        return successMessage.isDisplayed();
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}