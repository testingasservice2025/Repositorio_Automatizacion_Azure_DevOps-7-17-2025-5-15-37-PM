Feature: Procesamiento mediante scripts shell (ETL) - Validar ejecución de scripts ETL en el proceso batch

  Scenario: Validar el proceso ETL ejecutado correctamente
    Given el sistema invoca los scripts shell para procesar datos de diversas aplicaciones core
    When el sistema verifica la transformación y carga de datos en la base de datos
    Then la información es enviada correctamente a la base de datos
    And el sistema notifica el éxito del procesamiento ETL al usuario
    Then se muestra mensaje confirmatorio en la interfaz