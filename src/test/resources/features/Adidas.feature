Feature: Add products to cart

  Background:
    #Given Adidas 'Main Menu' page is loaded
  Given 'MainMenu' page is loaded

    Scenario: Adding products to cart
      Given hovered over 'Hombre' on 'Header'
      And click 'Futbol' button on 'Tenis' category on 'Header'
      Then get price of 'Calsado de Futbol Nemeziz' on 'Futbol' page
      And click 'Calzado de Futbol Nemeziz' image button on 'Futbol' Page
      And click 'Eliga tu Talla' dropdown button on 'Futbol' Page
      And click 'MX Nine' size button on 'Futbol' Page
      And click 'AÑADIR AL CARRITO' button on 'Futbol' Page
      Then 'canitdad' should display "Cantidad: 1"
      And click 'Ver Carrito' link on 'Futbol' page
      Then title 'Calsado de Futbol Nemeziz' is displayed on 'Futbol' Page
      And price should be "$2,199.00"
      And total should be "$2,199.00"



