import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc2Steps {
    WebDriver driver;
    tc2Page contractPage;

    @Given("El operador está en la página de consulta de contratos")
    public void el_operador_está_en_la_página_de_consulta_de_contratos() {
        driver = Hooks.getDriver();
        contractPage = PageFactory.initElements(driver, tc2Page.class);
        driver.get("URL_DE_LA_PÁGINA_DE_CONSULTA");
    }

    @When("El operador ingresa el número de contrato {string}")
    public void el_operador_ingresa_el_número_de_contrato(String contractNumber) {
        contractPage.enterContractNumber(contractNumber);
    }
    
    @Then("El campo acepta el número válido del contrato")
    public void el_campo_acepta_el_número_válido_del_contrato() {
        assertTrue(contractPage.isContractNumberValid());
    }
    
    @When("El sistema inicia el proceso de consulta a través del servicio en línea")
    public void el_sistema_inicia_el_proceso_de_consulta_a_través_del_servicio_en_línea() {
        contractPage.startOnlineService();
    }

    @Then("El servicio de comunicación se activa para recuperar la información del contrato")
    public void el_servicio_de_comunicación_se_activa_para_recuperar_la_información_del_contrato() {
        assertTrue(contractPage.isCommunicationServiceActive());
    }

    @When("El sistema vincula y muestra datos complementarios del contrato")
    public void el_sistema_vincula_y_muestra_datos_complementarios_del_contrato() {
        contractPage.displayContractInformation();
    }

    @Then("La información es mostrada correctamente en la interfaz")
    public void la_información_es_mostrada_correctamente_en_la_interfaz() {
        assertTrue(contractPage.isContractInformationDisplayedCorrectly());
    }
}