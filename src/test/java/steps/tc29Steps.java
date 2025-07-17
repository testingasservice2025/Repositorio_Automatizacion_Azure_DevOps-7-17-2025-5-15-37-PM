package steps;

import pages.tc29Page;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc29Steps {
  
    WebDriver driver;
    tc29Page tc29page;

    public tc29Steps() {
        this.driver = Hooks.getDriver();
        tc29page = new tc29Page(driver);
    }

    @Given("el operador finaliza una consulta de cliente")
    public void el_operador_finaliza_una_consulta_de_cliente() {
        tc29page.finalizarConsultaCliente();
    }

    @When("el sistema procesa la consulta")
    public void el_sistema_procesa_la_consulta() {
        assertTrue(tc29page.isConsultaProcesadaSinErrores());
    }

    @Then("el sistema muestra un mensaje de éxito en la interfaz")
    public void el_sistema_muestra_un_mensaje_de_exito_en_la_interfaz() {
        assertTrue(tc29page.isMensajeExitoVisible());
    }

    @Then("la notificación contiene los detalles correctos de la consulta")
    public void la_notificacion_contiene_los_detalles_correctos_de_la_consulta() {
        String detallesEsperados = "Operación realizada correctamente";
        assertTrue(tc29page.obtenerDetallesNotificacion().contains(detallesEsperados));
    }
}