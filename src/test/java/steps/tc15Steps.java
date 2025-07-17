package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc15Page;

public class tc15Steps {
    WebDriver driver;
    tc15Page acticenterPage;

    @Given("El operador está en la página de Acticenter")
    public void elOperadorEstaEnLaPaginaDeActicenter() {
        driver = Hooks.getDriver();
        acticenterPage = PageFactory.initElements(driver, tc15Page.class);
        driver.get("URL_DE_ACTICENTER");
    }

    @When("El operador selecciona la opción de consulta")
    public void elOperadorSeleccionaLaOpcionDeConsulta() {
        acticenterPage.clickConsultaOption();
    }

    @Then("La interfaz responde a la acción")
    public void laInterfazRespondeALaAccion() {
        Assert.assertTrue(acticenterPage.isResponseSuccessful());
    }

    @When("El sistema activa el servicio de comunicación en línea")
    public void elSistemaActivaElServicioDeComunicacionEnLinea() {
        acticenterPage.activateCommunicationService();
    }

    @Then("El servicio se inicia sin demoras")
    public void elServicioSeIniciaSinDemoras() {
        Assert.assertTrue(acticenterPage.isServiceActivated());
    }

    @When("El sistema muestra un mensaje de consulta en proceso")
    public void elSistemaMuestraUnMensajeDeConsultaEnProceso() {
        acticenterPage.waitForProcessingMessage();
    }

    @Then("El usuario recibe confirmación visual de la activación")
    public void elUsuarioRecibeConfirmacionVisualDeLaActivacion() {
        Assert.assertTrue(acticenterPage.isConfirmationVisible());
    }
}