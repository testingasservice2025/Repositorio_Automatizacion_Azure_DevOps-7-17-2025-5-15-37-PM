Feature: Verificar integración efectiva entre Acticenter y la plataforma de servicios

  Scenario: Integración con plataforma de servicios
    Given el operador inicia una consulta que requiere servicios externos
    When el servicio de integración se activa y contacta a la plataforma de servicios
    Then la conexión se establece exitosamente
    And el sistema consolida la información de la plataforma y la muestra en Acticenter
    And la información es precisa y unificada