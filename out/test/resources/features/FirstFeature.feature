Feature: Verificar Google home
  Scenario: Verificar si el campo de busqueda esta visible
    Given Google page is loaded
    And Browser is maximized
    Then the 'Search' field is visible
#
#  Scenario: Verificar que el boton "Buscar" esta visible
#  Scenario: Verificar resultados de busqueda