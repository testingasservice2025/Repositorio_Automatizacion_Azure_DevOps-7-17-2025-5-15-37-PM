package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc43Page {
    WebDriver driver;

    By contractListLocator = By.id("contractList");
    By contractDetailLocator = By.className("contractDetail");

    public tc43Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToClientContracts() {
        driver.get("http://example.com/client-contracts");
    }

    public boolean isContractListDisplayed() {
        WebElement contractList = driver.findElement(contractListLocator);
        return contractList.isDisplayed();
    }

    public boolean isVisualizationClearAndComplete() {
        List<WebElement> contracts = driver.findElements(contractListLocator);
        return contracts.size() > 1 && contracts.stream().allMatch(WebElement::isDisplayed);
    }

    public void selectEachContract() {
        List<WebElement> contracts = driver.findElements(contractListLocator);
        for (WebElement contract : contracts) {
            contract.click();
            // Return to list for next iteration
            driver.navigate().back();
        }
    }

    public boolean isContractDetailDisplayedCorrectly() {
        List<WebElement> contracts = driver.findElements(contractListLocator);
        for (WebElement contract : contracts) {
            contract.click();
            WebElement detail = driver.findElement(contractDetailLocator);
            if (!detail.isDisplayed()) {
                return false;
            }
            driver.navigate().back();
        }
        return true;
    }
}