Feature: tarea
  Scenario: Usaing list(table)
    Given 'adidas' page is loaded
    And mouse is hover 'homber' tag on 'NavBar' page
    And click 'futbol' button on 'NavBar'
    Then search item with by name and price
    |Calzado de Fútbol Nemeziz 19.3 Terreno Firme|$2,199|

    Scenario: Using map
      Given 'adidas' page is loaded
      And mouse is hover 'homber' tag on 'NavBar' page
      And click 'futbol' button on 'NavBar'
      Then search item with by name and price (map)
        |title                                       |price |
        |Calzado de Fútbol Nemeziz 19.3 Terreno Firme|$2,199|

      Scenario: Using Enum
        Given 'adidas' page is loaded
        And mouse is hover 'homber' tag on 'NavBar' page
        And click 'futbol' button on 'NavBar'
        Then search item with by name and price (ENUM)
          |title                                       |price |
          |Calzado de Fútbol Nemeziz 19.3 Terreno Firme|$2,199|
        And print product "PRICE"
        And print product "TITLE"