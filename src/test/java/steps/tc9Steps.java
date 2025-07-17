package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.Tc9Page;

public class Tc9Steps {
    Tc9Page tc9Page = new Tc9Page();

    @Given("el operador ha solicitado la consulta de datos complementarios")
    public void elOperadorSolicitaConsultaDatos() {
        tc9Page.solicitarConsultaDatos();
    }

    @When("la API contacta a Infocell, Refinitiv, Outlook y WhatsApp")
    public void laAPIContactaServiciosExternos() {
        tc9Page.contactarServiciosExternos();
    }

    @Then("cada servicio responde dentro del tiempo esperado")
    public void cadaServicioResponde() {
        tc9Page.verificarRespuestaServicios();
    }

    @Then("el sistema consolida la información recibida")
    public void elSistemaConsolidaInformacion() {
        tc9Page.consolidarInformacion();
    }

    @Then("la información es completa y cohesiva")
    public void laInformacionEsCompleta() {
        tc9Page.verificarInformacionCompleta();
    }
}