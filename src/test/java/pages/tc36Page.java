package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc36Page {

    WebDriver driver;

    public tc36Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegaAAplicacion() {
        driver.get("http://url-de-la-aplicacion");
    }

    public void iniciaConsulta() {
        driver.findElement(By.id("consulta")).click();
    }

    public void activaServicioIntegracion() {
        // código para activar servicio de integración
    }

    public void verificaConexionEstablecida() {
        // código para verificar conexión
    }

    public void visualizaInformacionConsolidada() {
        // código para visualizar información en Acticenter
    }

    public void verificaInformacionPrecisa() {
        // código para verificar precisión de la información
    }
}