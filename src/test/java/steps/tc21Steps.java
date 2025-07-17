package steps;

import pages.tc21Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc21Steps {
    tc21Page page = new tc21Page();

    @Given("El operador selecciona la consulta que requiere datos de Infocell")
    public void seleccionarConsulta() {
        page.seleccionarConsultaInfocell();
    }

    @When("El sistema envía la solicitud a la API de Infocell")
    public void enviarSolicitudAPI() {
        page.enviarSolicitudAPIInfocell();
    }

    @Then("La API responde con la información solicitada")
    public void verificarRespuestaAPI() {
        assertTrue(page.verificarRespuestaAPI());
    }

    @Then("El sistema integra la respuesta de Infocell en la información del cliente")
    public void integrarRespuestaEnInformacionCliente() {
        assertTrue(page.integrarRespuestaEnInformacionCliente());
    }

    @Then("La información se muestra completa y sin errores")
    public void verificarInformacionCompletaSinErrores() {
        assertTrue(page.verificarInformacionSinErrores());
    }
}