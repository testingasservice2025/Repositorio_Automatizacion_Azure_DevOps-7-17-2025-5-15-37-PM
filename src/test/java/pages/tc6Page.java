package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc6Page {
    WebDriver driver;

    public tc6Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "consultaCedesButton")
    WebElement consultaCedesButton;
    
    @FindBy(id = "interfazCedes")
    WebElement interfazCedes;
    
    @FindBy(id = "informacionCedes")
    WebElement informacionCedes;

    public void clickConsultaCedes() {
        consultaCedesButton.click();
    }

    public void verificarInterfaz() {
        if (!interfazCedes.isDisplayed()) {
            throw new IllegalStateException("Interfaz de Cedes no se muestra correctamente");
        }
    }

    public void invocarServicio() {
        // Lógica para invocar el servicio de Cedes
    }

    public void validarRespuestaServicio() {
        // Lógica para validar la respuesta del servicio de Cedes
    }

    public void mostrarInformacion() {
        // Lógica para mostrar la información de Cedes
    }

    public void validarInformacionCompleta() {
        if (informacionCedes.getText().isEmpty()) {
            throw new IllegalStateException("La información de Cedes es incompleta");
        }
    }
}