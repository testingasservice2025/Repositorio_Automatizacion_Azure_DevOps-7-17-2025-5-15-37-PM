Feature: Límites de datos en consultas de inversiones
  Verificar comportamiento del sistema con límites superiores e inferiores en la consulta de inversiones

  Scenario: Verificar el comportamiento con límites superiores e inferiores
    Given el operador ingresa un rango mínimo y máximo de inversiones a consultar
    When el sistema consulta los datos dentro del rango especificado
    Then los datos presentados corresponden al rango establecido
    And el operador verifica que los límites se apliquen correctamente
    Then el sistema muestra únicamente datos dentro del rango