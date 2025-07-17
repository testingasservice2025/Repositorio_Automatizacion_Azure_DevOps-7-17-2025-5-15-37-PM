Feature: Verificación de datos sincronizados entre sistemas

  Scenario: Comparar información de cliente entre Acticenter y CBS
    Given El operador está en la página de inicio de sesión de Acticenter
    When El operador consulta la información de un cliente en Acticenter
    Then El sistema muestra datos actualizados

    Given El operador está en el módulo de CBS
    When El operador accede al módulo de CBS para verificar la misma información
    Then Los datos del cliente en CBS coinciden con los de Acticenter

    When El operador revisa los datos en ambos sistemas
    Then La información es idéntica en ambos sistemas