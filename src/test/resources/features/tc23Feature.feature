Feature: Integración con API de Outlook
  Verificar la integración con el servicio de Outlook para notificaciones.

  Scenario: Enviar notificación de consulta vía Outlook
    Given El operador realiza una consulta que activa notificaciones vía Outlook
    When El sistema invoca la API de Outlook para generar la notificación
    Then La API responde confirmando el envío de la notificación
    And El operador verifica que se reciba el email en la bandeja de entrada
    Then El email se recibe correctamente con los detalles de la consulta