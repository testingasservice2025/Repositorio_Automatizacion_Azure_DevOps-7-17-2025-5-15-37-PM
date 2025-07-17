package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc40Page;

public class tc40Steps {

    tc40Page page = new tc40Page();

    @Given("el operador realiza una consulta de datos en Acticenter")
    public void elOperadorRealizaUnaConsultaDeDatosEnActicenter() {
        page.consultarDatosEnActicenter();
    }

    @When("el sistema transfiere la información a CBS")
    public void elSistemaTransfiereLaInformacionACBS() {
        page.transferirInformacionACBS();
    }

    @Then("los datos permanecen consistentes durante la transferencia")
    public void losDatosPermanecenConsistentesDuranteLaTransferencia() {
        Assert.assertTrue(page.verificarDatosConsistentes());
    }

    @Then("el operador compara los datos entre ambos sistemas")
    public void elOperadorComparaLosDatosEntreAmbosSistemas() {
        Assert.assertTrue(page.compararDatosEntreSistemas());
    }

    @Then("la información es idéntica y sin alteraciones")
    public void laInformacionEsIdenticaYSinAlteraciones() {
        Assert.assertTrue(page.verificarInformacionIdentica());
    }
}