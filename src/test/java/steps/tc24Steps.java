package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc24Page;

public class tc24Steps {
    WebDriver driver;
    tc24Page page;

    @Given("^El operador activa una consulta que requiere notificación por WhatsApp$")
    public void el_operador_activa_una_consulta() {
        page = new tc24Page(driver);
        page.activateQuery();
    }

    @When("^El sistema envía la solicitud a la API de WhatsApp$")
    public void el_sistema_envia_la_solicitud() {
        page.sendRequestToWhatsAppAPI();
    }

    @Then("^La API procesa la solicitud y envía el mensaje$")
    public void la_API_procesa_la_solicitud() {
        page.verifyAPISuccess();
    }

    @Then("^El operador confirma la recepción del mensaje en la aplicación WhatsApp$")
    public void el_operador_confirma_recepcion_mensaje() {
        page.confirmMessageReception();
    }

    @Then("^El mensaje se recibe con los detalles correctos$")
    public void el_mensaje_se_recibe_con_detalles_correctos() {
        page.verifyMessageDetails();
    }
}