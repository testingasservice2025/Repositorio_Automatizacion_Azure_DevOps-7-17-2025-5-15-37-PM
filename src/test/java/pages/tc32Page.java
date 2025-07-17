package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc32Page {
    WebDriver driver;

    By numeroClienteInput = By.id("numeroCliente");
    By mensajeAlerta = By.id("mensajeAlerta");
    By btnReintentar = By.id("btnReintentar");

    public tc32Page(WebDriver driver) {
        this.driver = driver;
    }

    public void initSystem() {
        driver.get("http://example.com/sistema");
    }

    public void ingresarNumeroCliente(String numeroCliente) {
        driver.findElement(numeroClienteInput).sendKeys(numeroCliente);
    }

    public boolean isClienteNoExistente() {
        // Lógica para verificar si el cliente no existe en la base de datos
        return true; // Esto debe ser implementado de acuerdo con la lógica del sistema
    }

    public String getMensajeAlerta() {
        WebElement mensajeElement = driver.findElement(mensajeAlerta);
        return mensajeElement.getText();
    }

    public boolean isOpcionReintentarVisible() {
        return driver.findElement(btnReintentar).isDisplayed();
    }
}