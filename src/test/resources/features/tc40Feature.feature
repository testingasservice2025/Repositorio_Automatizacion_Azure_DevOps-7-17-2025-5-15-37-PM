Feature: Consistencia de datos en transferencias

  Scenario: Verificar que la información transferida entre sistemas sea consistente
    Given el operador realiza una consulta de datos en Acticenter
    When el sistema transfiere la información a CBS
    Then los datos permanecen consistentes durante la transferencia
    And el operador compara los datos entre ambos sistemas
    Then la información es idéntica y sin alteraciones