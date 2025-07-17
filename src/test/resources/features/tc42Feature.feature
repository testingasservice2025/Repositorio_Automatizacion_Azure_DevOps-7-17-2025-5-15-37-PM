Feature: Respuesta del sistema bajo carga alta

  Scenario: Verificar respuesta del sistema ante múltiples consultas simultáneas
    Given varios operadores realizan consultas simultáneamente en Acticenter
    Then el sistema maneja múltiples solicitudes de forma concurrente
    And el sistema mantiene la integridad de los datos de cada consulta
    And la performance se mantiene en niveles aceptables