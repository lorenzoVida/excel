Feature: Manejo de ventanas

  Scenario: Switch entre ventanas del navegador
    Given enter the window handle website
    When click en window handle button
    Then navigate in the new Window
    And return principal window