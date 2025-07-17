package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc6Page;

public class tc6Steps {
    WebDriver driver;
    tc6Page tc6Page;

    public tc6Steps() {
        this.driver = Hooks.getDriver();
        tc6Page = PageFactory.initElements(driver, tc6Page.class);
    }

    @Given("El operador abre la aplicación")
    public void abrirAplicacion() {
        driver.get("http://aplicacion.com");
    }
    
    @When("El operador selecciona la opción de consulta de inversiones tipo 'Cedes'")
    public void seleccionarOpcionCedes() {
        tc6Page.clickConsultaCedes();
    }

    @Then("El sistema muestra la interfaz correspondiente")
    public void verificarInterfazCedes() {
        tc6Page.verificarInterfaz();
    }

    @When("El sistema invoca el servicio en línea para recuperar los datos de Cedes")
    public void invocarServicioCedes() {
        tc6Page.invocarServicio();
    }

    @Then("El servicio responde con los datos de inversiones 'Cedes'")
    public void verificarDatosServicio() {
        tc6Page.validarRespuestaServicio();
    }

    @When("El sistema presenta la información de Cedes en pantalla")
    public void presentarInformacionCedes() {
        tc6Page.mostrarInformacion();
    }

    @Then("La información es precisa y completa")
    public void verificarInformacionCompleta() {
        tc6Page.validarInformacionCompleta();
    }
}