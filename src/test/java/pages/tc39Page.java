package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc39Page {

    private WebDriver driver;
    private By rangoMinimoInput = By.id("rangoMin");
    private By rangoMaximoInput = By.id("rangoMax");
    private By consultarButton = By.id("consultar");

    public tc39Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarRangoDeInversiones(int min, int max) {
        driver.findElement(rangoMinimoInput).sendKeys(String.valueOf(min));
        driver.findElement(rangoMaximoInput).sendKeys(String.valueOf(max));
    }

    public void consultarDatosDelRango() {
        driver.findElement(consultarButton).click();
    }

    public void verificarDatosDentroDelRango() {
        // Implementar lógica para verificar que los datos estén dentro del rango
    }

    public void verificarLimitesAplicados() {
        // Implementar lógica para verificar la correcta aplicación de límites
    }

    public void verificarUnicamenteDatosDentroDelRango() {
        // Implementar lógica para garantizar que solo se muestren datos dentro del rango
    }
}