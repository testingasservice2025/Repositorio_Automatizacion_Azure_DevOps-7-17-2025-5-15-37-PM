Feature: Validación de estado en consultas sin actualización
  Como operador del sistema
  Quiero verificar el estado del sistema cuando la información del cliente no se actualiza
  Para asegurarme de que el sistema maneja adecuadamente las consultas desactualizadas

  Scenario: Validar mensaje de información desactualizada
    Given el operador consulta un cliente cuya información no ha sido actualizada recientemente
    When el sistema detecta la falta de actualización
    Then el sistema muestra un mensaje indicando que la información puede estar desactualizada
    And el operador decide reintentar la consulta después de un tiempo
    Then el sistema registra el intento de reconsulta