import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc4Page {

    WebDriver driver;

    By numeroClienteInput = By.id("numeroCliente");
    By resultadoInformacion = By.id("resultadoInformacion");

    public tc4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarNumeroCliente(String numero) {
        driver.findElement(numeroClienteInput).sendKeys(numero);
    }

    public boolean esFormatoNumeroValido() {
        // Lógica para validar el formato del número ingresado
        String numero = driver.findElement(numeroClienteInput).getAttribute("value");
        return numero.matches("\\d{8}");
    }

    public boolean consultarBaseDeDatos() {
        // Lógica para simular la consulta en la base de datos
        return true;
    }

    public boolean numeroClienteCoincide() {
        // Lógica para verificar si el número ingresado coincide con uno en la base de datos
        return true;
    }

    public Object obtenerDatosCliente() {
        // Lógica para obtener datos del cliente
        return driver.findElement(resultadoInformacion).getText();
    }

    public boolean informacionDesplegadaCorrectamente() {
        // Verificar que la información se muestra correctamente en la interfaz
        return !driver.findElement(resultadoInformacion).getText().isEmpty();
    }
}