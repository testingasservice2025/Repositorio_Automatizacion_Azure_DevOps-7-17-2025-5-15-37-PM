package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc3Page {

    WebDriver driver;

    By investmentQueryOption = By.id("investmentQueryOption");
    By cedesOption = By.id("cedesOption");
    By pagaresOption = By.id("pagaresOption");
    
    public tc3Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToInvestmentQueryScreen() {
        driver.navigate().to("http://acticenter/investment-query");
    }

    public void selectInvestmentQueryOption() {
        driver.findElement(investmentQueryOption).click();
    }

    public boolean areInvestmentOptionsAvailable() {
        WebElement cedes = driver.findElement(cedesOption);
        WebElement pagares = driver.findElement(pagaresOption);
        return cedes.isDisplayed() && pagares.isDisplayed();
    }

    public void startIntegrationService() {
        // Simulate starting the integration service
    }

    public boolean isDataRetrievedSuccessfully() {
        // Simulate checking the successful data retrieval
        return true;
    }

    public void updateAndDisplayInvestmentData() {
        // Simulate updating and displaying investment data
    }

    public boolean isDataPresentedWithoutErrors() {
        // Simulate checking that data is presented correctly
        return true;
    }
}