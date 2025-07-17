package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import pages.tc13Page;

public class tc13Steps {

    tc13Page acticenterPage = new tc13Page();

    @Given("El operador inicia una consulta de cliente en Acticenter")
    public void iniciarConsultaCliente() {
        boolean solicitudEnviada = acticenterPage.iniciarConsultaCliente();
        assertTrue("La solicitud no fue enviada al CBS", solicitudEnviada);
    }

    @When("Se recibe la información proveniente del servicio de integración")
    public void recibirInformacion() {
        boolean datosConsolidados = acticenterPage.recibirInformacionServicioIntegracion();
        assertTrue("Los datos del cliente no fueron consolidados", datosConsolidados);
    }

    @Then("La interfaz muestra todos los datos complementarios del cliente")
    public void mostrarDatosCliente() {
        boolean datosMostrados = acticenterPage.mostrarDatosCliente();
        assertTrue("La presentación de datos no es correcta o completa", datosMostrados);
    }
}