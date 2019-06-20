Feature: Shoes price

  Background:
    Given The 'Adidas' page is loaded

  Scenario: Test 'XX' shoes price matches initial price
    Given Hover 'HOMBRE' link on 'navbar' page
    Given Click 'Futbol' link on 'navbar' page
    Given Get precio primer calzado on 'calzados futbol' page
    And Click 'primer calzado' div on 'calzados futbol' page
    Given Click 'elige tu talla' button on 'nemeziz calzado' page
    And Click '8.5' button on 'nemeziz calzado' page
    When Click 'anadir al carrito' button on 'nemeziz calzado' page
    Then Cantidad carrito es "1" on 'modal' page
    When Click 'ver carrito' button on 'modal page'
    Then Title is "CALZADO DE FÚTBOL NEMEZIZ 19.3 TERRENO FIRME"
    Then Quantity is "1"
    Then Precio is actual price
    Then Precio total is actual price

