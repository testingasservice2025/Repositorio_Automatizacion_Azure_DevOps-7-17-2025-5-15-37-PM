package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc14Page;

public class tc14Steps {

    tc14Page page = new tc14Page();

    @Given("El operador está en la página principal de Acticenter")
    public void elOperadorEstaEnLaPaginaPrincipalDeActicenter() {
        page.navegarAPaginaPrincipal();
    }

    @When("El operador envía una solicitud de consulta desde Acticenter")
    public void elOperadorEnviaUnaSolicitudDeConsultaDesdeActicenter() {
        page.enviarSolicitudConsulta();
    }

    @Then("El sistema inicia la comunicación con CBS")
    public void elSistemaIniciaLaComunicacionConCBS() {
        Assert.assertTrue(page.verificarComunicacionConCBS());
    }

    @When("El servicio de integración procesa la solicitud")
    public void elServicioDeIntegracionProcesaLaSolicitud() {
        page.procesarSolicitudIntegracion();
    }

    @Then("El sistema obtiene los datos actualizados desde CBS")
    public void elSistemaObtieneLosDatosActualizadosDesdeCBS() {
        Assert.assertTrue(page.verificarDatosActualizados());
    }

    @When("La información es mostrada en la interfaz de Acticenter")
    public void laInformacionEsMostradaEnLaInterfazDeActicenter() {
        page.mostrarInformacionInterfaz();
    }

    @Then("La sincronización de datos es exitosa")
    public void laSincronizacionDeDatosEsExitosa() {
        Assert.assertTrue(page.verificarSincronizacionExitosa());
    }
}