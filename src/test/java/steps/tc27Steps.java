package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc27Page;

public class tc27Steps {

    tc27Page page = new tc27Page();

    @Given("^el operador realiza la consulta del cliente asesorado$")
    public void elOperadorRealizaLaConsultaDelClienteAsesorado() {
        page.consultarCliente();
    }

    @When("^el sistema inicia la carga de información$")
    public void elSistemaIniciaLaCargaDeInformacion() {
        page.iniciarCargaDeInformacion();
    }

    @Then("^el sistema consolida datos de cliente, contrato e inversiones en un dashboard$")
    public void elSistemaConsolidaDatosDeClienteContratoEInversionesEnUnDashboard() {
        page.consolidarDatos();
    }

    @Then("^la información se organiza de forma integral$")
    public void laInformacionSeOrganizaDeFormaIntegral() {
        page.verificarOrganizacionIntegral();
    }

    @When("^el operador revisa el dashboard y verifica la integridad de los datos$")
    public void elOperadorRevisaElDashboardYVerificaLaIntegridadDeLosDatos() {
        page.revisarDashboard();
    }

    @Then("^el sistema muestra información sin inconsistencias$")
    public void elSistemaMuestraInformacionSinInconsistencias() {
        page.verificarIntegridad();
    }
}