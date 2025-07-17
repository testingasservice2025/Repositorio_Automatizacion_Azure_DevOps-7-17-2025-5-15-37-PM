Feature: Validación de número de contrato

  Scenario: Verificar que el número de contrato se valida correctamente
    Given El operador ingresa un número de contrato en el sistema
    When Se inicia la consulta de información del contrato relacionado
    Then El sistema despliega la información del contrato si es válida