Feature: Consulta de múltiples contratos asociados a un cliente

  Scenario: Verificar presentación de múltiples contratos en consulta de cliente
    Given El operador consulta un cliente con múltiples contratos asociados
    When El sistema muestra la lista de todos los contratos del cliente
    Then La visualización es clara y completa
    When El operador selecciona cada contrato para ver detalles específicos
    Then El sistema despliega la información de cada contrato sin errores