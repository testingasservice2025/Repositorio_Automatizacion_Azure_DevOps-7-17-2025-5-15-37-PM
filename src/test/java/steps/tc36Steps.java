package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc36Page;

public class tc36Steps {

    WebDriver driver = new ChromeDriver();
    tc36Page page = new tc36Page(driver);

    @Given("^el operador inicia una consulta que requiere servicios externos$")
    public void elOperadorIniciaConsulta() {
        page.navegaAAplicacion();
        page.iniciaConsulta();
    }

    @When("^el servicio de integración se activa y contacta a la plataforma de servicios$")
    public void servicioIntegracionActivo() {
        page.activaServicioIntegracion();
    }

    @Then("^la conexión se establece exitosamente$")
    public void conexionExitosa() {
        page.verificaConexionEstablecida();
    }

    @Then("^el sistema consolida la información de la plataforma y la muestra en Acticenter$")
    public void sistemaConsolidaInformacion() {
        page.visualizaInformacionConsolidada();
    }

    @Then("^la información es precisa y unificada$")
    public void informacionPrecisa() {
        page.verificaInformacionPrecisa();
    }
}