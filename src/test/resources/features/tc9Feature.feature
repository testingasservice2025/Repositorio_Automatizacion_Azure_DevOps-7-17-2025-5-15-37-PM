Feature: Integración con servicios externos en la nube
  Verificar consulta a servicios externos (Infocell, Refinitiv, Outlook, WhatsApp).

  Scenario: Consulta de datos complementarios
    Given el operador ha solicitado la consulta de datos complementarios
    When la API contacta a Infocell, Refinitiv, Outlook y WhatsApp
    Then cada servicio responde dentro del tiempo esperado
    And el sistema consolida la información recibida
    And la información es completa y cohesiva