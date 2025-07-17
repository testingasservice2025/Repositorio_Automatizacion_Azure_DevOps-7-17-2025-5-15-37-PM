package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc17Page {

    WebDriver driver;

    public tc17Page(WebDriver driver) {
        this.driver = driver;
    }

    public void consultarCliente() {
        driver.findElement(By.id("consultaCliente")).click();
    }

    public boolean sistemaDetectaFaltaActualizacion() {
        WebElement alerta = driver.findElement(By.id("alertaActualizacion"));
        return alerta != null && alerta.isDisplayed();
    }

    public boolean verificarMensajeDesactualizacion() {
        WebElement mensaje = driver.findElement(By.id("mensajeDesactualizacion"));
        return mensaje.isDisplayed() && mensaje.getText().contains("información puede estar desactualizada");
    }

    public void reintentarConsulta() {
        driver.findElement(By.id("btnReintentar")).click();
    }

    public boolean verificarRegistroReconsulta() {
        WebElement registro = driver.findElement(By.id("registroReconsulta"));
        return registro != null && registro.isDisplayed();
    }
}