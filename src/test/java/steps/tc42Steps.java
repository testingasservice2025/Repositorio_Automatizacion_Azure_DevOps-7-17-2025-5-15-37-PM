package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc42Page;

public class tc42Steps {
    WebDriver driver;
    tc42Page acticenterPage;

    @Given("^varios operadores realizan consultas simultáneamente en Acticenter$")
    public void variosOperadoresRealizanConsultasSimultaneamente() {
        acticenterPage = new tc42Page(driver);
        acticenterPage.invokeConcurrentQueries();
    }

    @Then("^el sistema maneja múltiples solicitudes de forma concurrente$")
    public void sistemaManejaSolicitudesConcurrentes() {
        acticenterPage.verifyConcurrencyHandling();
    }

    @Then("^el sistema mantiene la integridad de los datos de cada consulta$")
    public void sistemaMantieneIntegridadDatos() {
        acticenterPage.verifyDataIntegrity();
    }

    @Then("^la performance se mantiene en niveles aceptables$")
    public void performanceNivelesAceptables() {
        acticenterPage.verifyAcceptablePerformance();
    }
}