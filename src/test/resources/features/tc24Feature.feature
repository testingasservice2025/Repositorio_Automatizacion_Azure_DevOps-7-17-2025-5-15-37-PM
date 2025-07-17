Feature: Validar el envío de notificaciones vía WhatsApp

  Scenario: Integración con API de WhatsApp
    Given El operador activa una consulta que requiere notificación por WhatsApp
    When El sistema envía la solicitud a la API de WhatsApp
    Then La API procesa la solicitud y envía el mensaje
    And El operador confirma la recepción del mensaje en la aplicación WhatsApp
    Then El mensaje se recibe con los detalles correctos