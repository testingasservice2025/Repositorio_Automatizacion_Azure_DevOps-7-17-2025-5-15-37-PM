Feature: Verificación de Integridad de Archivos Anexos

  Scenario: Verificar integridad y contenido del archivo anexo mediante análisis final
    Given El operador está en la pantalla de visualización de anexos
    When El operador accede a la opción de visualizar el archivo anexo relacionado
    Then El sistema carga el archivo sin corrupción de datos
    And El sistema analiza el contenido del archivo
    Then El análisis confirma que los datos son correctos
    When El operador finaliza la revisión
    And El operador confirma la integridad de los datos presentados
    Then El sistema registra la validación de integridad sin incidencias