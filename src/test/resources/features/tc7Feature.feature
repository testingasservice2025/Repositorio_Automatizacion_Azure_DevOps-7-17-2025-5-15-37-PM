Feature: Sincronización de inversiones tipo Pagarés

  Scenario: Validar sincronización de inversiones tipo Pagarés
    Given El operador selecciona la opción de consulta de inversiones tipo 'Pagarés'
    When Se activa el servicio de comunicación para obtener datos de Pagarés
    Then La interfaz actualiza y muestra la información de Pagarés