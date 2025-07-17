Feature: Integración con API de Refinitiv
  Validar la integración y respuesta de la API de Refinitiv

  Scenario: Validación de la integración con Refinitiv API
    Given que el operador inicia una consulta que requiere datos de Refinitiv
    When el sistema envía la solicitud a la API de Refinitiv
    Then la API devuelve los datos financieros correctamente
    And el sistema integra y muestra los datos en la interfaz de consulta