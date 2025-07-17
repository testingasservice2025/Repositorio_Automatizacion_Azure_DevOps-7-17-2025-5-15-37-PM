package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;
import pages.Tc16Page;

public class Tc16Steps {

    WebDriver driver;
    Tc16Page tc16Page;

    public Tc16Steps() {
        this.driver = Hooks.driver;
        tc16Page = PageFactory.initElements(driver, Tc16Page.class);
    }

    @Given("el sistema está listo para ejecutar el proceso batch")
    public void elSistemaEstaListoParaEjecutarElProcesoBatch() {
        tc16Page.openBatchProcessPage();
    }

    @When("el sistema ejecuta el batch para procesar información de múltiples fuentes")
    public void elSistemaEjecutaElBatch() {
        tc16Page.startBatchProcess();
    }

    @Then("el proceso batch se inicia sin errores")
    public void elProcesoBatchSeIniciaSinErrores() {
        tc16Page.verifyBatchStarted();
    }

    @When("los scripts ETL transforman y envían la información a la base de datos")
    public void losScriptsEtlTransformanYEnvianLaInformacion() {
        tc16Page.runEtlScripts();
    }

    @Then("la información es procesada correctamente")
    public void laInformacionEsProcesadaCorrectamente() {
        tc16Page.verifyEtlProcess();
    }

    @When("el sistema reporta la finalización del proceso batch al operador")
    public void elSistemaReportaLaFinalizacionDelProcesoBatch() {
        tc16Page.completeBatchProcess();
    }

    @Then("se muestra un mensaje de éxito en la interfaz")
    public void seMuestraUnMensajeDeExitoEnLaInterfaz() {
        tc16Page.verifySuccessMessage();
    }
}