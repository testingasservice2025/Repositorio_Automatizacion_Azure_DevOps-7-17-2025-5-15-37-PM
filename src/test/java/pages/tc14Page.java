package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc14Page {
    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public tc14Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navegarAPaginaPrincipal() {
        driver.get("http://acticenter.url_principal");
    }

    public void enviarSolicitudConsulta() {
        WebElement enviarSolicitudButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnEnviarSolicitud")));
        enviarSolicitudButton.click();
    }

    public boolean verificarComunicacionConCBS() {
        WebElement estadoComunicacion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("comunicacionEstado")));
        return estadoComunicacion.getText().contains("Conectado");
    }

    public void procesarSolicitudIntegracion() {
        // Código para simular el procesamiento de la solicitud
    }

    public boolean verificarDatosActualizados() {
        WebElement datosActualizados = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datosActualizados")));
        return datosActualizados.isDisplayed();
    }

    public void mostrarInformacionInterfaz() {
        // Simulación para mostrar resultados
    }

    public boolean verificarSincronizacionExitosa() {
        WebElement estadoSincronizacion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sincronizacionEstado")));
        return estadoSincronizacion.getText().equals("Éxito");
    }
}