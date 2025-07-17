package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc19Page {

    private WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By validationMessage = By.id("validationMessage");
    private By processButton = By.id("processButton");
    private By integrationMessage = By.id("integrationMessage");

    public tc19Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPlatform() {
        driver.get("http://example.com/integration-platform");
    }

    public boolean isPlatformAvailable() {
        return driver.getTitle().contains("Integration Platform");
    }

    public void uploadFile(String fileName) {
        driver.findElement(uploadButton).sendKeys("/path/to/files/" + fileName);
    }

    public boolean isFileFormatValid() {
        return driver.findElement(validationMessage).getText().contains("Formato válido");
    }

    public void processFileContent() {
        driver.findElement(processButton).click();
    }

    public boolean isFileContentProcessed() {
        return driver.findElement(validationMessage).getText().contains("Contenido extraído correctamente");
    }

    public void integrateExtractedInformation() {
        // Insert code to integrate information
    }

    public boolean isCombinedInformationDisplayed() {
        return driver.findElement(integrationMessage).getText().contains("Información combinada presentada correctamente");
    }
}