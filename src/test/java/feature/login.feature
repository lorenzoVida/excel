Feature: Login

  Scenario: Login exitoso
    Given cuando me encuentro en la web principal
    When ingreso mis credenciales correctas
    Then me muestra el Dasboard principal

  Scenario: Login Fallido
    Given cuando me encuentro en la web principal
    When ingreso mis credenciales incorrectas
    Then me muestra mensaje de error