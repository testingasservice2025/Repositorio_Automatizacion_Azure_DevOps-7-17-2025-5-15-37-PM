package steps;

import io.cucumber.java.en.*;
import pages.tc39Page;

public class tc39Steps {

    tc39Page page = new tc39Page();

    @Given("el operador ingresa un rango mínimo y máximo de inversiones a consultar")
    public void elOperadorIngresaUnRango() {
        page.ingresarRangoDeInversiones(1000, 5000);
    }

    @When("el sistema consulta los datos dentro del rango especificado")
    public void elSistemaConsultaLosDatos() {
        page.consultarDatosDelRango();
    }

    @Then("los datos presentados corresponden al rango establecido")
    public void losDatosPresentadosCorresponden() {
        page.verificarDatosDentroDelRango();
    }

    @And("el operador verifica que los límites se apliquen correctamente")
    public void elOperadorVerificaLimites() {
        page.verificarLimitesAplicados();
    }

    @Then("el sistema muestra únicamente datos dentro del rango")
    public void elSistemaMuestraUnicamenteDatos() {
        page.verificarUnicamenteDatosDentroDelRango();
    }
}