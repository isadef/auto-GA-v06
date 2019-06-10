Feature: Go to reports for new account
  Scenario: Ir a la pagina de reportes a partir de una nueva cuenta creada
    Given Pagina principal esta cargada
    Given La cuenta "Test" esta creada
    When Se presiona el boton "Test"
    And Se presiona el boton 'Reports'
    Then El titulo es "Reports for: Test"