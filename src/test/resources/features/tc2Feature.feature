Feature: Sincronización de información de contratos

  Scenario: Consulta de contrato con activación de servicio
    Given El operador está en la página de consulta de contratos
    When El operador ingresa el número de contrato "123456"
    Then El campo acepta el número válido del contrato
    When El sistema inicia el proceso de consulta a través del servicio en línea
    Then El servicio de comunicación se activa para recuperar la información del contrato
    When El sistema vincula y muestra datos complementarios del contrato
    Then La información es mostrada correctamente en la interfaz