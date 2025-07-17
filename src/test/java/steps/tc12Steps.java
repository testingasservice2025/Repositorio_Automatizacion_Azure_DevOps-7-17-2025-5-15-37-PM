package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.*;
import pages.tc12Page;

public class tc12Steps {

    WebDriver driver;
    tc12Page page;
    
    public tc12Steps(WebDriver driver) {
        this.driver = driver;
        page = new tc12Page(driver);
        PageFactory.initElements(driver, this);
    }

    @Given("el operador está en la página de consulta de contratos")
    public void navigateToContractsPage() {
        page.goToContractsPage();
    }

    @When("el operador ingresa caracteres alfanuméricos en el campo de número de contrato")
    public void enterAlphanumericCharacters() {
        page.enterContractNumber("ABC123");
    }

    @Then("el sistema rechaza caracteres no numéricos y muestra una notificación de entrada inválida")
    public void verifyInvalidEntryMessage() {
        page.verifyInvalidEntryMessage();
    }

    @When("el operador corrige la entrada ingresando solo números")
    public void correctEntryToNumeric() {
        page.enterContractNumber("123456");
    }

    @Then("el sistema acepta la entrada y permite continuar")
    public void verifyValidEntryAllowed() {
        page.verifyEntryAccepted();
    }
}