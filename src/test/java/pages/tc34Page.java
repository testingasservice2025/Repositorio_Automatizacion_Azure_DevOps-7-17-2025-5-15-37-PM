package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc34Page {

    WebDriver driver;

    By consultaBoton = By.id("consultaInversion");
    By mensajeFaltaDatos = By.id("mensajeFaltaDatos");
    By botonIntentar = By.id("botonIntentar");
    By botonCerrar = By.id("botonCerrar");

    public tc34Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarConsultaInversiones() {
        driver.findElement(consultaBoton).click();
    }

    public void buscarEnBaseDatos() {
        // Simulación de búsqueda en base de datos
    }

    public void deteccionRegistrosInexistentes() {
        // Lógica para detectar la ausencia de registros
    }

    public void mostrarMensajeFaltaDatos() {
        driver.findElement(mensajeFaltaDatos).isDisplayed();
    }

    public void decidirAccion() {
        // Lógica para ejecutar acción de intentar de nuevo o cerrar
    }

    public void responderAccionUsuario() {
        // Lógica para validar respuesta del sistema ante la acción del usuario
    }
}