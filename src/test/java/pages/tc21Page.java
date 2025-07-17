package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc21Page {
    WebDriver driver;

    // Selectors
    By consultaInfocellSelector = By.id("consultaInfocell");
    By enviarButtonSelector = By.id("enviarSolicitud");

    public tc21Page(WebDriver driver) {
        this.driver = driver;
    }

    // Method to select the Infocell query
    public void seleccionarConsultaInfocell() {
        driver.findElement(consultaInfocellSelector).click();
    }

    // Method to send the API request
    public void enviarSolicitudAPIInfocell() {
        driver.findElement(enviarButtonSelector).click();
    }

    // Method to verify API response
    public boolean verificarRespuestaAPI() {
        // Implement actual API response verification
        return true; // Placeholder return value
    }

    // Method to integrate API response into client information
    public boolean integrarRespuestaEnInformacionCliente() {
        // Implement actual response integration
        return true; // Placeholder return value
    }

    // Method to verify complete information without errors
    public boolean verificarInformacionSinErrores() {
        // Implement actual information verification
        return true; // Placeholder return value
    }
}