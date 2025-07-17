package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc43Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc43Steps {
    WebDriver driver = new ChromeDriver();
    tc43Page page = new tc43Page(driver);

    @Given("El operador consulta un cliente con múltiples contratos asociados")
    public void elOperadorConsultaUnClienteConMultiplesContratosAsociados() {
        page.navigateToClientContracts();
    }

    @When("El sistema muestra la lista de todos los contratos del cliente")
    public void elSistemaMuestraLaListaDeTodosLosContratosDelCliente() {
        Assert.assertTrue(page.isContractListDisplayed());
    }

    @Then("La visualización es clara y completa")
    public void laVisualizacionEsClaraYCompleta() {
        Assert.assertTrue(page.isVisualizationClearAndComplete());
    }

    @When("El operador selecciona cada contrato para ver detalles específicos")
    public void elOperadorSeleccionaCadaContratoParaVerDetallesEspecificos() {
        page.selectEachContract();
    }

    @Then("El sistema despliega la información de cada contrato sin errores")
    public void elSistemaDespliegaLaInformacionDeCadaContratoSinErrores() {
        Assert.assertTrue(page.isContractDetailDisplayedCorrectly());
    }
}