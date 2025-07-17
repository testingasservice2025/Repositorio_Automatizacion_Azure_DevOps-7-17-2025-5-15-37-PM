Feature: Integración CBS y Acticenter - Validar integración y transmisión de información a CBS

  Scenario: Validar la integración y transmisión de información correcta entre Acticenter y CBS
    Given El operador está en la página principal de Acticenter
    When El operador envía una solicitud de consulta desde Acticenter
    Then El sistema inicia la comunicación con CBS
    When El servicio de integración procesa la solicitud
    Then El sistema obtiene los datos actualizados desde CBS
    When La información es mostrada en la interfaz de Acticenter
    Then La sincronización de datos es exitosa