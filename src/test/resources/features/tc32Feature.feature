Feature: Manejo de consultas con datos no existentes
  Validar respuesta del sistema ante consulta de cliente inexistente

  Scenario: El operador ingresa un número de cliente que no existe
    Given el sistema está inicializado
    When el operador ingresa un número de cliente "999999"
    Then el sistema verifica la inexistencia de datos
    And muestra un mensaje "Cliente no encontrado"
    And da la opción de reintentar o corregir el número ingresado