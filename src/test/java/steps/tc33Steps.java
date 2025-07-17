package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.tc33Page;
import static org.junit.Assert.*;

public class tc33Steps {

    WebDriver driver;
    tc33Page contractPage;

    @Given("El operador está en la página de consulta de contratos")
    public void el_operador_está_en_la_página_de_consulta_de_contratos() {
        contractPage = new tc33Page(driver);
        contractPage.navigateToConsultaPage();
    }

    @When("El operador ingresa un número de contrato no registrado {string}")
    public void el_operador_ingresa_un_número_de_contrato_no_registrado(String contrato) {
        contractPage.enterContractNumber(contrato);
        contractPage.submitQuery();
    }

    @Then("El sistema identifica la ausencia del contrato")
    public void el_sistema_identifica_la_ausencia_del_contrato() {
        assertTrue(contractPage.isContractNotFound());
    }

    @Then("Se muestra mensaje de 'Contrato no encontrado'")
    public void se_muestra_mensaje_de_contrato_no_encontrado() {
        assertEquals("Contrato no encontrado", contractPage.getErrorMessage());
    }

    @When("El operador decide corregir la entrada o cancelar la operación")
    public void el_operador_decide_corregir_la_entrada_o_cancelar_la_operación() {
        assertTrue(contractPage.canRetryOrCancel());
    }

    @Then("El sistema permite volver a intentar la consulta")
    public void el_sistema_permite_volver_a_intentar_la_consulta() {
        // Implementation for retry or cancel operation
    }
}