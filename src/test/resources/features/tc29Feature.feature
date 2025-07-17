Feature: Notificación de operación exitosa

  Scenario: Verificar notificación tras consulta exitosa
    Given el operador finaliza una consulta de cliente
    When el sistema procesa la consulta
    Then el sistema muestra un mensaje de éxito en la interfaz
    And la notificación contiene los detalles correctos de la consulta