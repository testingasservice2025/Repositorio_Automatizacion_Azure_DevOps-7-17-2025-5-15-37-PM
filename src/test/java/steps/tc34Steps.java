package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc34Page;

public class tc34Steps {

    WebDriver driver;
    tc34Page page;

    public tc34Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc34Page.class);
    }

    @Given("^el operador inicia una consulta de inversiones para un cliente sin registros$")
    public void iniciarConsultaInversiones() {
        page.iniciarConsultaInversiones();
    }

    @When("^el sistema busca datos en la base de datos$")
    public void buscarDatosBaseDatos() {
        page.buscarEnBaseDatos();
    }

    @Then("^el sistema detecta la ausencia de registros de inversiones$")
    public void detectarAusenciaRegistros() {
        page.deteccionRegistrosInexistentes();
    }

    @Then("^muestra un mensaje informando la falta de datos$")
    public void mostrarMensajeFaltaDatos() {
        page.mostrarMensajeFaltaDatos();
    }

    @When("^el operador opta por volver a intentar o cerrar la consulta$")
    public void decidirIntentarOCerrar() {
        page.decidirAccion();
    }

    @Then("^el sistema responde adecuadamente a la acción del usuario$")
    public void respuestaSistemaAccionUsuario() {
        page.responderAccionUsuario();
    }
}