package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc17Page;

public class tc17Steps {

    tc17Page page;

    @Given("el operador consulta un cliente cuya información no ha sido actualizada recientemente")
    public void elOperadorConsultaCliente() {
        page = new tc17Page();
        page.consultarCliente();
    }

    @When("el sistema detecta la falta de actualización")
    public void elSistemaDetectaFaltaActualizacion() {
        Assert.assertTrue(page.sistemaDetectaFaltaActualizacion());
    }

    @Then("el sistema muestra un mensaje indicando que la información puede estar desactualizada")
    public void elSistemaMuestraMensajeDesactualizacion() {
        Assert.assertTrue(page.verificarMensajeDesactualizacion());
    }

    @Then("el operador decide reintentar la consulta después de un tiempo")
    public void elOperadorDecideReintentarConsulta() {
        page.reintentarConsulta();
    }

    @Then("el sistema registra el intento de reconsulta")
    public void elSistemaRegistraIntentoReconsulta() {
        Assert.assertTrue(page.verificarRegistroReconsulta());
    }
}