Feature: Manejo de consulta sin datos de inversión

  Scenario: Validar respuesta ante consulta de inversiones cuando no existen datos
    Given el operador inicia una consulta de inversiones para un cliente sin registros
    When el sistema busca datos en la base de datos
    Then el sistema detecta la ausencia de registros de inversiones
    And muestra un mensaje informando la falta de datos
    When el operador opta por volver a intentar o cerrar la consulta
    Then el sistema responde adecuadamente a la acción del usuario