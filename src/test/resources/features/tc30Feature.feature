Feature: Sincronización e integridad de datos

  Scenario: Validar integridad de datos sincronizados entre sistemas
    Given el operador consulta un cliente con múltiples registros en CBS y Acticenter
    When se muestran múltiples fuentes de información
    Then la información debe ser consistente en ambas fuentes

    When el operador confirma la integridad visualizando los datos sincronizados
    Then el sistema presenta datos integrales sin discrepancias