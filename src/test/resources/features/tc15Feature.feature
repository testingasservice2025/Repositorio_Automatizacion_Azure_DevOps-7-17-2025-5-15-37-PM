Feature: Activación de servicio de comunicación
  Verificar la activación del servicio al realizar una consulta

  Scenario: El operador activa el servicio de comunicación en Acticenter
    Given El operador está en la página de Acticenter
    When El operador selecciona la opción de consulta
    Then La interfaz responde a la acción
    When El sistema activa el servicio de comunicación en línea
    Then El servicio se inicia sin demoras
    When El sistema muestra un mensaje de consulta en proceso
    Then El usuario recibe confirmación visual de la activación