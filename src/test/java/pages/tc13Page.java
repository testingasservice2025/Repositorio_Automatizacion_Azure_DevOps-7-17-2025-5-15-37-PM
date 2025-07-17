package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc13Page {

    WebDriver driver;

    @FindBy(id = "consultaClienteButton")
    WebElement consultaClienteButton;

    @FindBy(id = "datosClienteDiv")
    WebElement datosClienteDiv;

    public tc13Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean iniciarConsultaCliente() {
        try {
            consultaClienteButton.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean recibirInformacionServicioIntegracion() {
        // Simulación de recepción de información
        return true;
    }

    public boolean mostrarDatosCliente() {
        return datosClienteDiv.isDisplayed();
    }
}