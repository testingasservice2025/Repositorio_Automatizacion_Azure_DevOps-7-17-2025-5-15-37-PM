package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc5Page;

public class tc5Steps {
    WebDriver driver = new ChromeDriver();
    tc5Page page = new tc5Page(driver);

    @Given("El operador ingresa un número de contrato en el sistema")
    public void el_operador_ingresa_un_numero_de_contrato_en_el_sistema() {
        page.navigateToContractPage();
        page.enterContractNumber("1234567890");
    }

    @When("Se inicia la consulta de información del contrato relacionado")
    public void se_inicia_la_consulta_de_informacion_del_contrato_relacionado() {
        page.submitContractNumber();
    }

    @Then("El sistema despliega la información del contrato si es válida")
    public void el_sistema_despliega_la_informacion_del_contrato_si_es_valida() {
        String info = page.getContractInformation();
        assert info.contains("Información del Contrato");
        driver.quit();
    }
}