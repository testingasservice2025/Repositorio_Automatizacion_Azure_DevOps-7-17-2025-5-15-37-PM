Feature: Acceso a historial de consultas
  Como operador
  Quiero acceder y visualizar el historial de consultas
  Para comprobar que la información es precisa y está disponible

  Scenario: Verificar acceso y visualización de historial de consultas
    Given El operador accede a la sección de historial en Acticenter
    When El operador selecciona una consulta específica del historial
    Then El sistema despliega los detalles de esa consulta
    And El operador valida que los datos históricos coincidan con los registros actuales
    Then La información histórica es precisa y accesible