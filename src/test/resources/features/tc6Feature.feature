Feature: Sincronización de inversiones – Cedes

  Scenario: Validar sincronización de inversiones tipo Cedes
    Given El operador abre la aplicación
    When El operador selecciona la opción de consulta de inversiones tipo 'Cedes'
    Then El sistema muestra la interfaz correspondiente
    When El sistema invoca el servicio en línea para recuperar los datos de Cedes
    Then El servicio responde con los datos de inversiones 'Cedes'
    When El sistema presenta la información de Cedes en pantalla
    Then La información es precisa y completa