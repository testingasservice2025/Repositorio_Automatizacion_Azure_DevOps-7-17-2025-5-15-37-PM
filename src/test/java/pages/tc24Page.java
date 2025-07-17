package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class tc24Page {
    WebDriver driver;

    public tc24Page(WebDriver driver) {
        this.driver = driver;
    }

    public void activateQuery() {
        // Implementación: script para activar la consulta que requiere notificación vía WhatsApp
    }

    public void sendRequestToWhatsAppAPI() {
        // Implementación: enviar solicitud a la API de WhatsApp
    }

    public void verifyAPISuccess() {
        // Implementación: verificar respuesta exitosa de la API
    }

    public void confirmMessageReception() {
        // Implementación: confirmar la recepción del mensaje en WhatsApp
    }

    public void verifyMessageDetails() {
        // Implementación: verificar que el mensaje recibido tenga los detalles correctos
    }
}