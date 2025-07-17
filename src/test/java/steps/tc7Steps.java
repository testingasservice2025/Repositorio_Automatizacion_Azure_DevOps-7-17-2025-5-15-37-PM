package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc7Page;

public class tc7Steps {
    WebDriver driver;
    tc7Page pagaresPage;

    public tc7Steps() {
        this.driver = Hooks.getDriver();
        pagaresPage = PageFactory.initElements(driver, tc7Page.class);
    }

    @Given("El operador selecciona la opción de consulta de inversiones tipo 'Pagarés'")
    public void elOperadorSeleccionaLaOpcionDeConsultaDeInversionesTipoPagares() {
        pagaresPage.seleccionarOpcionPagares();
    }

    @When("Se activa el servicio de comunicación para obtener datos de Pagarés")
    public void seActivaElServicioDeComunicacionParaObtenerDatosDePagares() {
        pagaresPage.activarServicioComunicacion();
    }

    @Then("La interfaz actualiza y muestra la información de Pagarés")
    public void laInterfazActualizaYMustraLaInDePagares() {
        pagaresPage.verificarInformacionPagaresMostrada();
    }
}