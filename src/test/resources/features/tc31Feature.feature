Feature: Proceso batch de actualización de datos

  Scenario: Verificar correcto procesamiento batch en la actualización de datos
    Given el sistema inicia el proceso batch programado para la sincronización
    When el batch procesa la información de varias aplicaciones core
    Then el sistema confirma la actualización de datos en Acticenter y CBS