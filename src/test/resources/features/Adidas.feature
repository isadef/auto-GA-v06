Feature: Add products to cart

  Background:
    #Given Adidas 'Main Menu' page is loaded
  Given 'Futbol' page is loaded

    Scenario: Adding products to cart
#      Given hovered over 'Hombre' on 'Header'
#      And clicked 'Futbol' button
      Given clicked 'Calzado de Futbol X' image button on 'Futbol' Page
      And click 'Eliga tu Talla' dropdown button on 'Futbol' Page
      And clicked 'MX 9.5' button on 'Futbol' Page
      And clicked 'AÑADIR AL CARRITO' button on 'Futbol' Page
      Then verify 'View shoping bag' is one on 'Futbol' page
      And click 'Ver Carrito' link 'Futbol' page
      Then  title is displayed on 'Futbol' Page


