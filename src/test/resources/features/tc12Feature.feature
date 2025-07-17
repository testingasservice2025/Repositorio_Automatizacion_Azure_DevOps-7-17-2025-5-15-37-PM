Feature: Validación de formato numérico en consultas
  Verificar que el sistema acepte solo valores numéricos para contratos

  Scenario: Validar que solo se acepten números en el campo de contrato
    Given el operador está en la página de consulta de contratos
    When el operador ingresa caracteres alfanuméricos en el campo de número de contrato
    Then el sistema rechaza caracteres no numéricos y muestra una notificación de entrada inválida

    When el operador corrige la entrada ingresando solo números
    Then el sistema acepta la entrada y permite continuar