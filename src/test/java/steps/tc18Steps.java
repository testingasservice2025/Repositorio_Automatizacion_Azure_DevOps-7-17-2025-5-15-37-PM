import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc18Page;

public class tc18Steps {

    WebDriver driver;
    tc18Page etlPage;

    public tc18Steps() {
        this.driver = Hooks.getDriver();
        etlPage = PageFactory.initElements(driver, tc18Page.class);
    }

    @Given("^el sistema invoca los scripts shell para procesar datos de diversas aplicaciones core$")
    public void invocarScriptsShell() {
        etlPage.invokeShellScripts();
    }

    @When("^el sistema verifica la transformación y carga de datos en la base de datos$")
    public void verificarTransformacionYCarga() {
        etlPage.verifyDataTransformationAndLoad();
    }

    @Then("^la información es enviada correctamente a la base de datos$")
    public void informacionEnviadaCorrectamente() {
        etlPage.verifyDataSentToDatabase();
    }

    @Then("^el sistema notifica el éxito del procesamiento ETL al usuario$")
    public void notificarExitoProcesamiento() {
        etlPage.notifySuccess();
    }

    @Then("^se muestra mensaje confirmatorio en la interfaz$")
    public void mostrarMensajeConfirmatorio() {
        etlPage.verifyConfirmationMessageDisplayed();
    }
}