Feature: Validación de datos complementarios del cliente

  Scenario: Verificar la presentación completa de datos complementarios del cliente
    Given El operador solicita la consulta de un cliente registrado
    When El sistema recupera la información del cliente
    Then El sistema valida que la información complementaria coincida con los registros base
    And Los datos son consistentes y completos
    Then El sistema presenta los datos en la interfaz de Acticenter
    And La información se muestra de forma legible y detallada