Feature: Verificar conexión e integración con API de Infocell
  Como operador
  Quiero verificar la conexión e integración con la API de Infocell
  Para asegurar que la información del cliente se muestra correctamente

  Scenario: Integración con API de Infocell
    Given El operador selecciona la consulta que requiere datos de Infocell
    When El sistema envía la solicitud a la API de Infocell
    Then La API responde con la información solicitada
    And El sistema integra la respuesta de Infocell en la información del cliente
    And La información se muestra completa y sin errores