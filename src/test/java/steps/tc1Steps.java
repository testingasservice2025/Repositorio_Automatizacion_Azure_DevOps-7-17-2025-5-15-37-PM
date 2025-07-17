package steps;

import pages.tc1Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class tc1Steps {

    tc1Page page = new tc1Page();

    @Given("^El operador está en la interfaz de Acticenter$")
    public void elOperadorEstaEnLaInterfazDeActicenter() {
        page.navigateToActicenter();
    }

    @When("^Ingresa el número de cliente \"([^\"]*)\"$")
    public void ingresaElNumeroDeCliente(String numeroCliente) {
        page.enterClientNumber(numeroCliente);
    }

    @Then("^El sistema muestra el número de cliente en pantalla$")
    public void elSistemaMuestraElNumeroDeClienteEnPantalla() {
        Assert.assertTrue(page.isClientNumberDisplayed());
    }

    @When("^Se activa el servicio de comunicación en línea$")
    public void seActivaElServicioDeComunicacionEnLinea() {
        page.activateOnlineService();
    }

    @Then("^El sistema envía los datos al módulo de integración$")
    public void elSistemaEnviaLosDatosAlModuloDeIntegracion() {
        Assert.assertTrue(page.isDataSentToIntegrationModule());
    }

    @Then("^La información del cliente se actualiza en Acticenter$")
    public void laInformacionDelClienteSeActualizaEnActicenter() {
        Assert.assertTrue(page.isClientInformationUpdated());
    }
}