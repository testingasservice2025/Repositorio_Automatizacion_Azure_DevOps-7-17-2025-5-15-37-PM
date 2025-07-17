package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.tc22Page;

public class tc22Steps {

    tc22Page refinitivPage = new tc22Page();

    @Given("^que el operador inicia una consulta que requiere datos de Refinitiv$")
    public void iniciarConsulta() {
        refinitivPage.configurarSolicitudApi();
    }
    
    @When("^el sistema envía la solicitud a la API de Refinitiv$")
    public void enviarSolicitudApi() {
        boolean isSolicitudEnviada = refinitivPage.enviarSolicitud();
        Assert.assertTrue("La solicitud a la API de Refinitiv no se envió correctamente", isSolicitudEnviada);
    }

    @Then("^la API devuelve los datos financieros correctamente$")
    public void validarRespuestaApi() {
        boolean isDatosRecibidos = refinitivPage.verificarRespuestaApi();
        Assert.assertTrue("No se recibieron los datos financieros correctamente", isDatosRecibidos);
    }

    @Then("^el sistema integra y muestra los datos en la interfaz de consulta$")
    public void integrarYMostrarDatos() {
        boolean isDatosMostrados = refinitivPage.integrarYMostrarDatos();
        Assert.assertTrue("Los datos de Refinitiv no se mostraron correctamente en la interfaz", isDatosMostrados);
    }
}