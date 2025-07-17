package steps;

import io.cucumber.java.en.*;
import pages.Tc23Page;

public class Tc23Steps {

    Tc23Page tc23Page = new Tc23Page();

    @Given("El operador realiza una consulta que activa notificaciones vía Outlook")
    public void elOperadorRealizaConsulta() {
        tc23Page.makeQueryToActivateNotification();
    }

    @When("El sistema invoca la API de Outlook para generar la notificación")
    public void elSistemaInvocaApiOutlook() {
        tc23Page.invokeOutlookApi();
    }

    @Then("La API responde confirmando el envío de la notificación")
    public void laApiRespondeConfirmacionEnvio() {
        tc23Page.verifyApiResponse();
    }

    @And("El operador verifica que se reciba el email en la bandeja de entrada")
    public void elOperadorVerificaEmailRecibido() {
        tc23Page.verifyEmailReceived();
    }

    @Then("El email se recibe correctamente con los detalles de la consulta")
    public void elEmailSeRecibeCorrectamente() {
        tc23Page.verifyEmailDetails();
    }
}