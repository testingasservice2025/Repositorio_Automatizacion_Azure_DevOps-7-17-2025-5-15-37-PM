package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc20Page;

public class tc20Steps {

    WebDriver driver;
    tc20Page page;

    @Given("El operador navega a la página de descarga de PATHS-SAP")
    public void elOperadorNavegaALaPaginaDeDescargaDePATHSSAP() {
        page = new tc20Page(driver);
        page.navigateToDownloadPage();
    }

    @When("El operador selecciona la opción para descargar el archivo PATHS-SAP-v1.xlsx")
    public void elOperadorSeleccionaLaOpcionParaDescargarElArchivoPATHSSAP() {
        page.downloadFile();
    }

    @Then("El sistema inicia la descarga del archivo")
    public void elSistemaIniciaLaDescargaDelArchivo() {
        page.verifyFileDownload();
    }

    @Given("El archivo PATHS-SAP-v1.xlsx ha sido descargado")
    public void elArchivoPATHSSAPHaSidoDescargado() {
        page.checkFileExists();
    }

    @When("El archivo es abierto y verificado por su contenido")
    public void elArchivoEsAbiertoyVerificadoPorSuContenido() {
        page.openAndVerifyFileContent();
    }

    @Then("El contenido del archivo es visible y correcto")
    public void elContenidoDelArchivoEsVisibleYCorrecto() {
        page.validateFileContent();
    }

    @Given("El contenido del archivo PATHS-SAP ha sido verificado")
    public void elContenidoDelArchivoPATHSSAPHaSidoVerificado() {
        page.contentVerified();
    }

    @When("El sistema procesa el archivo para la integración de datos")
    public void elSistemaProcesaElArchivoParaLaIntegracionDeDatos() {
        page.processDataIntegration();
    }

    @Then("El usuario visualiza los resultados tras la integración")
    public void elUsuarioVisualizaLosResultadosTrasLaIntegracion() {
        page.verifyDataIntegrationResults();
    }
}