Feature: Validación de entrada de datos inválida - Validar comportamiento ante número de cliente mal formado

  Scenario: El sistema detecta número de cliente en formato incorrecto
    Given que el operador está en la página de entrada de números de cliente
    When el operador ingresa un número de cliente en formato incorrecto
    Then el sistema detecta el error de formato
    And el sistema muestra un mensaje de error indicando el fallo en el formato
    When el operador corrige el número de cliente
    Then el sistema acepta el nuevo número y continúa el proceso