package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc19Page;

public class tc19Steps {
    
    private WebDriver driver;
    private tc19Page page;

    public tc19Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc19Page.class);
    }

    @Given("la plataforma de integración está disponible")
    public void laPlataformaDeIntegracionEstaDisponible() {
        page.navigateToPlatform();
        Assert.assertTrue(page.isPlatformAvailable());
    }

    @When("el operador carga el archivo {string}")
    public void elOperadorCargaElArchivo(String fileName) {
        page.uploadFile(fileName);
    }

    @Then("el sistema reconoce y valida el formato del archivo")
    public void elSistemaReconoceYValidaElFormatoDelArchivo() {
        Assert.assertTrue(page.isFileFormatValid());
    }

    @When("el sistema procesa el contenido del archivo")
    public void elSistemaProcesaElContenidoDelArchivo() {
        page.processFileContent();
    }

    @Then("el archivo es leído y la información es extraída correctamente")
    public void elArchivoEsLeidoYLaInformacionEsExtraidaCorrectamente() {
        Assert.assertTrue(page.isFileContentProcessed());
    }

    @When("el sistema integra la información extraída con datos existentes")
    public void elSistemaIntegraLaInformacionExtraidaConDatosExistentes() {
        page.integrateExtractedInformation();
    }

    @Then("la información combinada se presenta en el sistema")
    public void laInformacionCombinadaSePresentaEnElSistema() {
        Assert.assertTrue(page.isCombinedInformationDisplayed());
    }
}