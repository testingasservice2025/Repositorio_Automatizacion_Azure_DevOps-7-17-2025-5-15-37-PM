Feature: Sincronización de información de clientes entre Acticenter y CBS

  Scenario: Consulta de cliente activa comunicación en línea
    Given El operador está en la interfaz de Acticenter
    When Ingresa el número de cliente "123456"
    Then El sistema muestra el número de cliente en pantalla
    When Se activa el servicio de comunicación en línea
    Then El sistema envía los datos al módulo de integración
    And La información del cliente se actualiza en Acticenter