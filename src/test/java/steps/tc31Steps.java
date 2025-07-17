package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc31Page;

public class tc31Steps {
    
    tc31Page page = new tc31Page();

    @Given("el sistema inicia el proceso batch programado para la sincronización")
    public void iniciar_proceso_batch() {
        page.iniciarProcesoBatch();
    }

    @When("el batch procesa la información de varias aplicaciones core")
    public void procesar_informacion() {
        page.procesarInformacion();
    }

    @Then("el sistema confirma la actualización de datos en Acticenter y CBS")
    public void confirmar_actualizacion_datos() {
        page.confirmarActualizacionDatos();
    }
}