package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tc23Page {

    WebDriver driver;

    private By notificationQueryInput = By.id("queryInput");
    private By outlookApiConfirmation = By.id("apiConfirmation");
    private By inboxEmailDetail = By.id("emailDetail");

    public Tc23Page(WebDriver driver) {
        this.driver = driver;
    }

    public void makeQueryToActivateNotification() {
        // Simula la acción de realizar una consulta que activa el envío de notificaciones
        driver.findElement(notificationQueryInput).sendKeys("Consulta para activar notificación");
    }

    public void invokeOutlookApi() {
        // Invoca la API de Outlook para enviar la notificación
        // Este es un stub para simular la llamada a la API
    }

    public void verifyApiResponse() {
        // Verifica que la API haya respondido de forma correcta
        boolean apiResponded = driver.findElement(outlookApiConfirmation).isDisplayed();
        if (!apiResponded) {
            throw new AssertionError("La API no confirmó el envío de la notificación");
        }
    }

    public void verifyEmailReceived() {
        // Verifica que el email fue recibido en la bandeja de entrada
        boolean emailReceived = driver.findElement(inboxEmailDetail).isDisplayed();
        if (!emailReceived) {
            throw new AssertionError("No se recibió el email en la bandeja de entrada");
        }
    }

    public void verifyEmailDetails() {
        // Verifica los detalles específicos del email recibido
        String emailContent = driver.findElement(inboxEmailDetail).getText();
        if (!emailContent.contains("Detalles de la consulta")) {
            throw new AssertionError("El email recibido no contiene los detalles esperados de la consulta");
        }
    }
}