Feature: Verificar velocidad de carga para consultas de grandes volúmenes de datos

  Scenario: Velocidad de carga de información
    Given el operador está en la interfaz de búsqueda de clientes
    When el operador lanza una consulta para un cliente con datos extensos
    Then el sistema acepta la solicitud y comienza el proceso
    When el sistema gestiona la consulta sin saturar la interfaz
    Then la información se carga en tiempos razonables
    And el operador monitorea el tiempo de respuesta durante la consulta
    Then el tiempo de carga se mantiene dentro de parámetros aceptables