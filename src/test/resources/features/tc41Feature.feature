Feature: Verificación de logs de comunicación

  Scenario: Validar que se registren adecuadamente los logs de las comunicaciones entre sistemas
    Given el sistema está operativo y preparado para una consulta
    When el sistema ejecuta una consulta de información desde Acticenter
    Then el log de la transacción se inicia en el sistema

    When el sistema registra detalles de la solicitud y respuesta del servicio
    Then el log contiene la información de la comunicación

    When el operador revisa el log para asegurarse de que los detalles sean correctos
    Then el log muestra datos completos y sin errores