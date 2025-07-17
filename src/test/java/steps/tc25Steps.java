package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ActicenterPage;
import pages.CBSPage;

public class tc25Steps {

    private ActicenterPage acticenterPage = new ActicenterPage();
    private CBSPage cbsPage = new CBSPage();
    private String acticenterData;
    private String cbsData;

    @Given("El operador está en la página de inicio de sesión de Acticenter")
    public void elOperadorEstaEnLaPaginaDeInicioSesionDeActicenter() {
        acticenterPage.navigateToLoginPage();
    }

    @When("El operador consulta la información de un cliente en Acticenter")
    public void elOperadorConsultaLaInformacionDeUnClienteEnActicenter() {
        acticenterData = acticenterPage.getClientData();
    }

    @Then("El sistema muestra datos actualizados")
    public void elSistemaMuestraDatosActualizados() {
        Assert.assertNotNull("Los datos del cliente deben estar presentes", acticenterData);
    }

    @Given("El operador está en el módulo de CBS")
    public void elOperadorEstaEnElModuloDeCBS() {
        cbsPage.navigateToCBSModule();
    }

    @When("El operador accede al módulo de CBS para verificar la misma información")
    public void elOperadorAccedeAlModuloDeCBSParaVerificarLaMismaInformacion() {
        cbsData = cbsPage.getClientData();
    }

    @Then("Los datos del cliente en CBS coinciden con los de Acticenter")
    public void losDatosDelClienteEnCBScoincidenConLosDeActicenter() {
        Assert.assertEquals("Los datos deben coincidir entre Acticenter y CBS", acticenterData, cbsData);
    }

    @When("El operador revisa los datos en ambos sistemas")
    public void elOperadorRevisaLosDatosEnAmbosSistemas() {
        // Additional steps if necessary
    }

    @Then("La información es idéntica en ambos sistemas")
    public void laInformacionEsIdenticaEnAmbosSistemas() {
        Assert.assertEquals("La información debe ser idéntica en ambos sistemas", acticenterData, cbsData);
    }
}