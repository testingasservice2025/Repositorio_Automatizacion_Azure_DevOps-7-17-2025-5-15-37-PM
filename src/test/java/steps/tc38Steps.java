package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc38Page;

import static org.junit.Assert.assertTrue;

public class tc38Steps {

    WebDriver driver = new ChromeDriver();
    tc38Page tc38page = new tc38Page(driver);

    @Given("el operador está en la interfaz de búsqueda de clientes")
    public void elOperadorEstaEnLaInterfazDeBusquedaDeClientes() {
        tc38page.navigateToCustomersSearch();
    }

    @When("el operador lanza una consulta para un cliente con datos extensos")
    public void elOperadorLanzaUnaConsultaParaUnClienteConDatosExtensos() {
        tc38page.launchQueryForExtensiveData();
    }

    @Then("el sistema acepta la solicitud y comienza el proceso")
    public void elSistemaAceptaLaSolicitudYComienzaElProceso() {
       assertTrue(tc38page.isQueryAccepted());
    }

    @When("el sistema gestiona la consulta sin saturar la interfaz")
    public void elSistemaGestionaLaConsultaSinSaturarLaInterfaz() {
        assertTrue(tc38page.isInterfaceResponsive());
    }

    @Then("la información se carga en tiempos razonables")
    public void laInformacionSeCargaEnTiemposRazonables() {
        assertTrue(tc38page.isLoadingTimeReasonable());
    }

    @And("el operador monitorea el tiempo de respuesta durante la consulta")
    public void elOperadorMonitoreaElTiempoDeRespuestaDuranteLaConsulta() {
        tc38page.monitorResponseTime();
    }

    @Then("el tiempo de carga se mantiene dentro de parámetros aceptables")
    public void elTiempoDeCargaSeMantieneDentroDeParametrosAceptables() {
        assertTrue(tc38page.isResponseTimeWithinLimits());
    }

}