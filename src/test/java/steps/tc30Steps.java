package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Tc30Page;

public class Tc30Steps {
    private WebDriver driver;
    private Tc30Page tc30Page;

    @Given("el operador consulta un cliente con múltiples registros en CBS y Acticenter")
    public void consultarClienteConMultiplesRegistros() {
        tc30Page = new Tc30Page(driver);
        tc30Page.consultarClienteEnCBSYActicenter();
    }

    @When("se muestran múltiples fuentes de información")
    public void mostrarMultiplesFuentesInformacion() {
        tc30Page.mostrarFuentesDeInformacion();
    }

    @Then("la información debe ser consistente en ambas fuentes")
    public void validarConsistenciaInformacion() {
        tc30Page.validarConsistenciaInfo();
    }

    @When("el operador confirma la integridad visualizando los datos sincronizados")
    public void confirmarIntegridadDatosSincronizados() {
        tc30Page.confirmarIntegridadVisual();
    }

    @Then("el sistema presenta datos integrales sin discrepancias")
    public void validarDatosIntegralesSinDiscrepancias() {
        tc30Page.verificarDatosIntegrales();
    }
}