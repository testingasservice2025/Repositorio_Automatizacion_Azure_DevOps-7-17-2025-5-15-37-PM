package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc32Page;

public class tc32Steps {
    tc32Page page = new tc32Page();

    @Given("el sistema está inicializado")
    public void el_sistema_está_inicializado() {
        page.initSystem();
    }

    @When("el operador ingresa un número de cliente {string}")
    public void el_operador_ingresa_un_número_de_cliente(String numeroCliente) {
        page.ingresarNumeroCliente(numeroCliente);
    }

    @Then("el sistema verifica la inexistencia de datos")
    public void el_sistema_verifica_la_inexistencia_de_datos() {
        Assert.assertTrue(page.isClienteNoExistente());
    }

    @Then("muestra un mensaje {string}")
    public void muestra_un_mensaje(String mensajeEsperado) {
        Assert.assertEquals(mensajeEsperado, page.getMensajeAlerta());
    }

    @Then("da la opción de reintentar o corregir el número ingresado")
    public void da_la_opción_de_reintentar_o_corregir_el_número_ingresado() {
        Assert.assertTrue(page.isOpcionReintentarVisible());
    }
}