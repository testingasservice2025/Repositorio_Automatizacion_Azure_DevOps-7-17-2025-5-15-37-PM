package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc35Page {

    WebDriver driver;

    private By moduleContent = By.id("operationsModuleContent");
    private By optionsList = By.id("optionsList");
    private By functionalities = By.className("functionality");

    public tc35Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToOperationsModule() {
        driver.get("https://acticenter.com/operations-passives");
    }

    public boolean isModuleLoaded() {
        // Verify if the module content is displayed
        return driver.findElement(moduleContent).isDisplayed();
    }

    public boolean areOptionsVisible() {
        // Check if options list is visible
        return driver.findElement(optionsList).isDisplayed();
    }

    public boolean areOptionsAccessible() {
        // Check if options are clickable
        return driver.findElements(optionsList).stream().allMatch(option -> option.isEnabled());
    }

    public void interactWithModuleFunctionalities() {
        driver.findElements(functionalities).forEach(functionality -> functionality.click());
    }

    public boolean isSystemResponsive() {
        // Placeholder for response time checks or further validation
        return true;
    }
}