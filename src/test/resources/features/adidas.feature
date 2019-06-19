Feature: Examen
  Scenario: Examen2
    Given 'adidas' page is loaded
    And mouse is hover 'homber' tag on 'NavBar' page
    And click 'futbol' button on 'NavBar'
    Then Check price of 'Calzado de Futbol Nemezis' on 'store' page
    And Click on 'Calzado de Futbol Nemezis' product on store page
    Then Click 'Elige tu talla' button on 'Product view' page
    And Click 'MX ocho y medio' button on 'Product view' page
    And Click 'Añadir al carrito' button on 'Product view' page
    Then Check 'cantidad' label is "Cantidad: 1" on 'AddCartAlert' page
    And  click 'Ver Carrito' button on 'AddCartAlert' page
    Then Verify Product Name is "CALZADO DE FÚTBOL NEMEZIZ 19.3 TERRENO FIRME" on 'Cart' page
    And Verify Product 'quantity' is "1" on 'Cart' page
    And Verify 'Total Amount' label is the same price on 'Cart' page and on 'store' page