Feature: Descarga y visualización de archivo anexo PATHS-SAP

  Scenario: Validar descarga y presentación del archivo PATHS-SAP-v1.xlsx
    Given El operador navega a la página de descarga de PATHS-SAP
    When El operador selecciona la opción para descargar el archivo PATHS-SAP-v1.xlsx
    Then El sistema inicia la descarga del archivo

  Scenario: Verificación del contenido del archivo PATHS-SAP
    Given El archivo PATHS-SAP-v1.xlsx ha sido descargado
    When El archivo es abierto y verificado por su contenido
    Then El contenido del archivo es visible y correcto

  Scenario: Confirmación de integración de datos desde el archivo
    Given El contenido del archivo PATHS-SAP ha sido verificado
    When El sistema procesa el archivo para la integración de datos
    Then El usuario visualiza los resultados tras la integración