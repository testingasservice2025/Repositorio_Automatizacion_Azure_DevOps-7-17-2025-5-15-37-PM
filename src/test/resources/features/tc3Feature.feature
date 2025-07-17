Feature: Sincronización de información de inversiones entre Acticenter y CBS

  Scenario: Consulta de inversiones (Cedes y Pagarés) en Acticenter
    Given El operador está en la pantalla de consulta de inversiones
    When El operador selecciona la opción de consulta de inversiones
    Then Las opciones de Cedes y Pagarés se muestran disponibles
    When Se inicia el servicio de integración para recuperar los datos de inversiones
    Then El sistema se comunica con el CBS y recupera la información requerida
    When La pantalla actualiza y presenta los datos de inversiones al usuario
    Then Los datos se presentan completos y sin errores