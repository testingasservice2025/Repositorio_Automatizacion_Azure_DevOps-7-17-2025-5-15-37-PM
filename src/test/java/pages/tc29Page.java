package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc29Page {
  
    WebDriver driver;

    By mensajeExito = By.id("mensajeExito");
    By detallesNotificacion = By.id("detallesNotificacion");

    public tc29Page(WebDriver driver) {
        this.driver = driver;
    }

    public void finalizarConsultaCliente() {
        // Lógica para finalizar la consulta
    }

    public boolean isConsultaProcesadaSinErrores() {
        // Lógica para comprobar que la consulta se procesó sin errores
        return true; // Implementación ficticia
    }

    public boolean isMensajeExitoVisible() {
        WebElement mensaje = driver.findElement(mensajeExito);
        return mensaje.isDisplayed();
    }

    public String obtenerDetallesNotificacion() {
        WebElement detalles = driver.findElement(detallesNotificacion);
        return detalles.getText();
    }
}