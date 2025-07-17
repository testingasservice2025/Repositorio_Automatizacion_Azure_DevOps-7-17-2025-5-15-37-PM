package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc15Page {
    WebDriver driver;

    @FindBy(id = "consultaOption")
    WebElement consultaOption;

    @FindBy(id = "activationMessage")
    WebElement activationMessage;

    @FindBy(id = "confirmationMessage")
    WebElement confirmationMessage;

    public tc15Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickConsultaOption() {
        consultaOption.click();
    }

    public boolean isResponseSuccessful() {
        return consultaOption.isDisplayed();
    }

    public void activateCommunicationService() {
        // Implementación para activar el servicio
    }

    public boolean isServiceActivated() {
        return activationMessage.isDisplayed();
    }

    public void waitForProcessingMessage() {
        // Implementación para esperar el mensaje
    }

    public boolean isConfirmationVisible() {
        return confirmationMessage.isDisplayed();
    }
}