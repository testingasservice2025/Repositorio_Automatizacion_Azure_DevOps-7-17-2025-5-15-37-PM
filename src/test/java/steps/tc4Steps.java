import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc4Steps {

    WebDriver driver;
    tc4Page page;

    @Given("el operador está en la página de consulta de clientes")
    public void elOperadorEstaEnLaPaginaDeConsultaDeClientes() {
        page = new tc4Page(driver);
        driver.get("URL_DE_CONSULTA");
    }

    @When("el operador ingresa un número de cliente en la consulta")
    public void elOperadorIngresaUnNumeroDeClienteEnLaConsulta() {
        page.ingresarNumeroCliente("12345678");
    }

    @Then("el sistema valida el formato del número ingresado")
    public void elSistemaValidaElFormatoDelNumeroIngresado() {
        assertTrue(page.esFormatoNumeroValido());
    }

    @Then("el sistema realiza una consulta en la base de datos de clientes")
    public void elSistemaRealizaUnaConsultaEnLaBaseDeDatosDeClientes() {
        assertTrue(page.consultarBaseDeDatos());
    }

    @Then("se compara el número ingresado con la base de datos")
    public void seComparaElNumeroIngresadoConLaBaseDeDatos() {
        assertTrue(page.numeroClienteCoincide());
    }

    @Then("el sistema muestra los datos complementarios del cliente si el número coincide")
    public void elSistemaMuestraLosDatosComplementariosDelClienteSiElNumeroCoincide() {
        assertNotNull(page.obtenerDatosCliente());
    }

    @Then("la información se despliega correctamente")
    public void laInformacionSeDespliegaCorrectamente() {
        assertTrue(page.informacionDesplegadaCorrectamente());
    }
}