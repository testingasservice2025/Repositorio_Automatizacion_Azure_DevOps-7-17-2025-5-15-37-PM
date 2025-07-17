package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc28Page;

public class tc28Steps {
    tc28Page page = new tc28Page();

    @Given("El operador accede a la sección de historial en Acticenter")
    public void accederSeccionHistorial() {
        page.navigateToHistorialSection();
        Assert.assertTrue("El historial no fue cargado correctamente", page.isHistorialLoaded());
    }

    @When("El operador selecciona una consulta específica del historial")
    public void seleccionarConsultaEspecifica() {
        page.selectSpecificQuery();
        Assert.assertTrue("Los detalles de la consulta no se muestran correctamente", page.areQueryDetailsDisplayed());
    }

    @Then("La información histórica es precisa y accesible")
    public void validarDatosHistoricos() {
        boolean isDataValid = page.validateHistoricalData();
        Assert.assertTrue("La información histórica no coincide con los registros actuales", isDataValid);
    }
}