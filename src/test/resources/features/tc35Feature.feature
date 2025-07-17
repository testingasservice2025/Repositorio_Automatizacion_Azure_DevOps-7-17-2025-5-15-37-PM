Feature: Interfaz de operación de cuentas pasivas en Acticenter
  Verificar la interfaz y facilidad de uso del módulo de operaciones pasivas.

  Scenario: Verificar carga y usabilidad del módulo de operaciones pasivas
    Given el operador accede al módulo de operaciones pasivas
    Then el módulo se carga sin errores
    When el sistema presenta opciones claras para consulta y sincronización
    Then las opciones son visibles y accesibles
    When el operador interactúa con diferentes funcionalidades del módulo
    Then el sistema responde con rapidez y sin fallos