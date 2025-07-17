Feature: Carga de información en Acticenter
  Verificar que los datos del cliente se carguen correctamente en la interfaz.

  Scenario: Consulta de cliente y carga de información
    Given El operador inicia una consulta de cliente en Acticenter
    When Se recibe la información proveniente del servicio de integración
    Then La interfaz muestra todos los datos complementarios del cliente
    And La presentación de datos es correcta y completa