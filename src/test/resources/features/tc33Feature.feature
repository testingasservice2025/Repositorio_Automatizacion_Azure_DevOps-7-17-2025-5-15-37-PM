Feature: Manejo de consulta de contrato inexistente

  Scenario: Verificar comportamiento ante consulta de contrato que no existe
    Given El operador está en la página de consulta de contratos
    When El operador ingresa un número de contrato no registrado "12345"
    Then El sistema identifica la ausencia del contrato
    And Se muestra mensaje de 'Contrato no encontrado'
    When El operador decide corregir la entrada o cancelar la operación
    Then El sistema permite volver a intentar la consulta