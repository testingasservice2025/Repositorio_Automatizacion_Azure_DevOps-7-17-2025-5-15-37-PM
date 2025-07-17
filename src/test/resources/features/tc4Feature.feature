Feature: Validación de número de cliente

  Scenario: Verificar que el número de cliente ingresado es correcto

    Given el operador está en la página de consulta de clientes
    When el operador ingresa un número de cliente en la consulta
    Then el sistema valida el formato del número ingresado
    And el sistema realiza una consulta en la base de datos de clientes
    Then se compara el número ingresado con la base de datos
    And el sistema muestra los datos complementarios del cliente si el número coincide
    Then la información se despliega correctamente