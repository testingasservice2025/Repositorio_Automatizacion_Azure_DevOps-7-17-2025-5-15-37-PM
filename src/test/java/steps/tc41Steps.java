package steps;

import io.cucumber.java.en.*;
import pages.tc41Page;

public class tc41Steps {

    tc41Page page = new tc41Page();

    @Given("el sistema está operativo y preparado para una consulta")
    public void elSistemaEstaOperativoYPreparadoParaUnaConsulta() {
        page.iniciarSistema();
    }

    @When("el sistema ejecuta una consulta de información desde Acticenter")
    public void elSistemaEjecutaUnaConsultaDesdeActicenter() {
        page.ejecutarConsultaActicenter();
    }
    
    @Then("el log de la transacción se inicia en el sistema")
    public void elLogDeLaTransaccionSeIniciaEnElSistema() {
        page.verificarInicioLogTransaccion();
    }

    @When("el sistema registra detalles de la solicitud y respuesta del servicio")
    public void elSistemaRegistraDetallesDeLaSolicitudYRespuestaDelServicio() {
        page.registrarDetallesTransaccion();
    }
    
    @Then("el log contiene la información de la comunicación")
    public void elLogContieneLaInformacionDeLaComunicacion() {
        page.verificarDetallesLog();
    }

    @When("el operador revisa el log para asegurarse de que los detalles sean correctos")
    public void elOperadorRevisaElLog() {
        page.revisarLogOperador();
    }
    
    @Then("el log muestra datos completos y sin errores")
    public void elLogMuestraDatosCompletosYSinErrores() {
        page.verificarLogCompletoYCorrecto();
    }
}