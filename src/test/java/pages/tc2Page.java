import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc2Page {

    WebDriver driver;

    @FindBy(id = "contractNumberInput")
    WebElement contractNumberInput;

    @FindBy(id = "submitButton")
    WebElement submitButton;

    @FindBy(id = "onlineServiceStatus")
    WebElement onlineServiceStatus;

    @FindBy(id = "contractInformation")
    WebElement contractInformation;

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void enterContractNumber(String contractNumber) {
        contractNumberInput.clear();
        contractNumberInput.sendKeys(contractNumber);
        submitButton.click();
    }

    public boolean isContractNumberValid() {
        // Lógica para verificar la validez del número de contrato
        return contractNumberInput.getAttribute("value").equals("123456");
    }

    public void startOnlineService() {
        // Lógica para iniciar el servicio en línea
        submitButton.click();
    }

    public boolean isCommunicationServiceActive() {
        // Lógica para verificar el estado del servicio de comunicación
        return onlineServiceStatus.isDisplayed();
    }

    public void displayContractInformation() {
        // Lógica para vincular y mostrar la información del contrato
    }

    public boolean isContractInformationDisplayedCorrectly() {
        // Lógica para verificar que la información se muestre correctamente
        return contractInformation.isDisplayed();
    }
}