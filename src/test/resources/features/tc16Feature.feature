Feature: Validación de respuesta del proceso batch

  Scenario: Verificar respuesta del sistema tras proceso batch exitoso
    Given el sistema está listo para ejecutar el proceso batch
    When el sistema ejecuta el batch para procesar información de múltiples fuentes
    Then el proceso batch se inicia sin errores
    
    When los scripts ETL transforman y envían la información a la base de datos
    Then la información es procesada correctamente
    
    When el sistema reporta la finalización del proceso batch al operador
    Then se muestra un mensaje de éxito en la interfaz