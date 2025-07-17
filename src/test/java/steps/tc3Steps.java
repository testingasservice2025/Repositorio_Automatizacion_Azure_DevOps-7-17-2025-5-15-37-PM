package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc3Page;

public class tc3Steps {

    tc3Page page = new tc3Page();

    @Given("El operador está en la pantalla de consulta de inversiones")
    public void el_operador_esta_en_la_pantalla_de_consulta_de_inversiones() {
        page.navigateToInvestmentQueryScreen();
    }

    @When("El operador selecciona la opción de consulta de inversiones")
    public void el_operador_selecciona_la_opcion_de_consulta_de_inversiones() {
        page.selectInvestmentQueryOption();
    }

    @Then("Las opciones de Cedes y Pagarés se muestran disponibles")
    public void las_opciones_de_cedes_y_pagares_se_muestran_disponibles() {
        Assert.assertTrue(page.areInvestmentOptionsAvailable());
    }

    @When("Se inicia el servicio de integración para recuperar los datos de inversiones")
    public void se_inicia_servicio_integracion() {
        page.startIntegrationService();
    }

    @Then("El sistema se comunica con el CBS y recupera la información requerida")
    public void el_sistema_recupera_informacion() {
        Assert.assertTrue(page.isDataRetrievedSuccessfully());
    }

    @When("La pantalla actualiza y presenta los datos de inversiones al usuario")
    public void la_pantalla_presenta_datos() {
        page.updateAndDisplayInvestmentData();
    }

    @Then("Los datos se presentan completos y sin errores")
    public void los_datos_se_presentan_completos() {
        Assert.assertTrue(page.isDataPresentedWithoutErrors());
    }
}