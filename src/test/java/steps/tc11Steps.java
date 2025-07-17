package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc11Page;

public class tc11Steps {

    tc11Page page = new tc11Page();

    @Given("que el operador está en la página de entrada de números de cliente")
    public void que_el_operador_está_en_la_página_de_entrada_de_números_de_cliente() {
        page.navigateToCustomerNumberInputPage();
    }

    @When("el operador ingresa un número de cliente en formato incorrecto")
    public void el_operador_ingresa_un_número_de_cliente_en_formato_incorrecto() {
        page.enterInvalidCustomerNumber("123ABC");
    }

    @Then("el sistema detecta el error de formato")
    public void el_sistema_detecta_el_error_de_formato() {
        Assert.assertTrue(page.isFormatErrorMessageDisplayed());
    }

    @When("el operador corrige el número de cliente")
    public void el_operador_corrige_el_número_de_cliente() {
        page.enterValidCustomerNumber("123456");
    }

    @Then("el sistema acepta el nuevo número y continúa el proceso")
    public void el_sistema_acepta_el_nuevo_número_y_continúa_el_proceso() {
        Assert.assertTrue(page.isProcessContinued());
    }
}