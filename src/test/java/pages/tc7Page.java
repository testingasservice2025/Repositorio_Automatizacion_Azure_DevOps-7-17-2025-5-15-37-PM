package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc7Page {
    WebDriver driver;

    @FindBy(id = "consultaPagares")
    WebElement consultaPagaresButton;

    @FindBy(id = "activarServicio")
    WebElement activarServicioButton;

    @FindBy(id = "mostrarInformacionPagares")
    WebElement informacionPagaresSection;

    public tc7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarOpcionPagares() {
        consultaPagaresButton.click();
    }

    public void activarServicioComunicacion() {
        activarServicioButton.click();
    }

    public void verificarInformacionPagaresMostrada() {
        if(informacionPagaresSection.isDisplayed()) {
            System.out.println("Información de Pagarés mostrada correctamente.");
        } else {
            throw new AssertionError("La información de Pagarés no se muestra correctamente.");
        }
    }
}