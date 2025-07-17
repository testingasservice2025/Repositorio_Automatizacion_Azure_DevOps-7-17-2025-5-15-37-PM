import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc26Page;
import static org.junit.Assert.*;

public class tc26Steps {

    private WebDriver driver;
    private tc26Page asesoresPage;

    @Given("el operador ingresa a la sección de consulta de asesores en Acticenter")
    public void elOperadorIngresaALaSeccionDeConsultaDeAsesoresEnActicenter() {
        // Setup del WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("URL_DE_LA_SECCION_DE_ASESORES");
        asesoresPage = new tc26Page(driver);
        
        // Verificación inicial de carga de la página
        assertTrue(asesoresPage.isPageLoaded());
    }

    @When("el sistema consulta los datos de asesores disponibles en la base de datos")
    public void elSistemaConsultaLosDatosDeAsesoresDisponiblesEnLaBaseDeDatos() {
        // Aquí se activaría la lógica interna para consultar datos
        assertNotNull(asesoresPage.consultarDatosAsesores());
    }

    @Then("el sistema despliega la información completa en la interfaz")
    public void elSistemaDespliegaLaInformacionCompletaEnLaInterfaz() {
        // Verificación de que la información está mostrando en la interfaz
        assertTrue(asesoresPage.areAsesoresVisibleAndUpdated());
        
        // Cerrar WebDriver
        driver.quit();
    }
}