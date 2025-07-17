Feature: Consulta de datos de asesores en Acticenter

  Scenario: Validar consulta de información de asesores
    Given el operador ingresa a la sección de consulta de asesores en Acticenter
    When el sistema consulta los datos de asesores disponibles en la base de datos
    Then el sistema despliega la información completa en la interfaz