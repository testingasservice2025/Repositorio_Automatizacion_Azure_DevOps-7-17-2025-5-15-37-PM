package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc10Page;

public class tc10Steps {

    WebDriver driver;
    tc10Page page;

    public tc10Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc10Page.class);
    }

    @Given("El operador solicita la consulta de un cliente registrado")
    public void elOperadorSolicitaLaConsultaDeUnClienteRegistrado() {
        page.solicitarConsultaCliente();
    }

    @When("El sistema recupera la información del cliente")
    public void elSistemaRecuperaLaInformacionDelCliente() {
        page.recuperarInformacionCliente();
    }

    @Then("El sistema valida que la información complementaria coincida con los registros base")
    public void elSistemaValidaQueLaInformacionComplementariaCoincidaConLosRegistrosBase() {
        page.validarInformacionComplementaria();
    }

    @Then("Los datos son consistentes y completos")
    public void losDatosSonConsistentesYCompletos() {
        page.verificarConsistenciaDatos();
    }

    @Then("El sistema presenta los datos en la interfaz de Acticenter")
    public void elSistemaPresentaLosDatosEnLaInterfazDeActicenter() {
        page.presentarDatosActicenter();
    }

    @Then("La información se muestra de forma legible y detallada")
    public void laInformacionSeMuestraDeFormaLegibleYDetallada() {
        page.verificarPresentacionLegible();
    }
}