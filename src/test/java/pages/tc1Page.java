package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc1Page {

    private WebDriver driver;

    private By clientNumberInput = By.id("clientNumber");
    private By clientInfo = By.id("clientInfo");
    private By onlineServiceButton = By.id("activateService");
    private By integrationModuleMessage = By.id("integrationMessage");

    public tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToActicenter() {
        driver.get("http://www.acticenter.com");
    }

    public void enterClientNumber(String numeroCliente) {
        WebElement input = driver.findElement(clientNumberInput);
        input.clear();
        input.sendKeys(numeroCliente);
    }

    public boolean isClientNumberDisplayed() {
        WebElement info = driver.findElement(clientInfo);
        return info.isDisplayed();
    }

    public void activateOnlineService() {
        WebElement button = driver.findElement(onlineServiceButton);
        button.click();
    }

    public boolean isDataSentToIntegrationModule() {
        WebElement message = driver.findElement(integrationModuleMessage);
        return message.isDisplayed() && message.getText().contains("Datos enviados");
    }

    public boolean isClientInformationUpdated() {
        // Logic to check updated information on the client display
        return true; // This will need specific implementation
    }
}