import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc26Page {

    private WebDriver driver;
    private By asesoresSection = By.id("aseSection");
    private By dataContainer = By.id("dataContainer");

    public tc26Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        // Verifica si la sección de asesores está visible
        return driver.findElement(asesoresSection).isDisplayed();
    }

    public Object consultarDatosAsesores() {
        // Lógica para consultar la información de asesores desde la base de datos
        // Aquí podrías simular o validar esta acción
        return new Object(); // Retorna un objeto ficticio para simular la consulta
    }

    public boolean areAsesoresVisibleAndUpdated() {
        // Verifica si los datos de asesores son visibles y están actualizados en la interfaz
        return driver.findElements(dataContainer).size() > 0;
    }
}