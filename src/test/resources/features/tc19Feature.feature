Feature: Adjuntar y procesar archivos para integración

  Scenario: Verificar carga y análisis de archivos anexos
    Given la plataforma de integración está disponible
    When el operador carga el archivo PATHS-SAP-v1.xlsx
    Then el sistema reconoce y valida el formato del archivo
    When el sistema procesa el contenido del archivo
    Then el archivo es leído y la información es extraída correctamente
    When el sistema integra la información extraída con datos existentes
    Then la información combinada se presenta en el sistema