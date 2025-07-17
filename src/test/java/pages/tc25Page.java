package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActicenterPage {

    private WebDriver driver;
    
    private By clientInfo = By.id("client-info");

    public ActicenterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("http://acticenter.example.com/login");
    }

    public String getClientData() {
        return driver.findElement(clientInfo).getText();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CBSPage {

    private WebDriver driver;
    
    private By clientInfo = By.id("client-info");

    public CBSPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToCBSModule() {
        driver.get("http://cbs.example.com/module");
    }

    public String getClientData() {
        return driver.findElement(clientInfo).getText();
    }
}