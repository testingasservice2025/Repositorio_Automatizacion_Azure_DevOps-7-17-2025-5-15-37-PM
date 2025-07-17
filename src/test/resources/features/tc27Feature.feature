Feature: Visualización integral de información en Acticenter

  Scenario: Verificar presentación integral de datos del cliente
    Given el operador realiza la consulta del cliente asesorado
    When el sistema inicia la carga de información
    Then el sistema consolida datos de cliente, contrato e inversiones en un dashboard
    And la información se organiza de forma integral
    When el operador revisa el dashboard y verifica la integridad de los datos
    Then el sistema muestra información sin inconsistencias