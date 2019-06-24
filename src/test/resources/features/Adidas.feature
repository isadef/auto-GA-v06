#noinspection NonAsciiCharacters
Feature: verificar si añade al carrito
  Scenario: añadir al carrito
    Given adidasPage is loaded
    Given hover en 'Hombre LINK' en 'adidasPage'
    And click en 'tennis button en 'adidasPage'
    Then search 'price' from 'tennis button' on 'calzadoPage'
    And click 'calzado Button' on 'calzado page'
    And click on 'talla selecto button' on 'calzado page'
    And click on 'talla button MX9' button on 'calzado page'
    And click on 'añadir al carrito' button on 'calzado page'
    And search 'cantidad' text with "Cantidad: 1" on 'calzado page'
    And click 'ir al carrito' button on 'calzado page'
    And 'quantity' field is displayed with "1" on 'calzado page'
    And 'titlefield' with "CALZADO DE FÚTBOL NEMEZIZ 19.3 TERRENO FIRME" is displayed on 'carritopage'
    And 'totalproductofield' is displayed with "$2,199.00" on 'carritopage'
    And 'totalfield' is displayed with "$2,199.00" on 'carritopage'


  Scenario Outline: añadir al carrito 2
    Given adidasPage is loaded
    Given hover en 'Hombre LINK' en 'adidasPage'
    And click en 'tennis button en 'adidasPage'
    Then search 'price' from 'tennis button' on 'calzadoPage'
    And click 'calzado Button' on 'calzado page'
    And click on 'talla selecto button' on 'calzado page'
    And click on 'talla button MX9' button on 'calzado page'
    And click on 'añadir al carrito' button on 'calzado page'
    And search 'cantidad' text with "<calzadoQuantity>" on 'calzado page'
    And click 'ir al carrito' button on 'calzado page'
    And 'quantity' field is displayed with "1" on 'calzado page'
    And 'titlefield' with "<title>" is displayed on 'carritopage'
    And 'totalproductofield' and 'totalfield' is displayes with "<totalPrices>"
    Examples:
    | totalPrices        | title     | calzadoQuantity                             |
    | $2,199.00;$2,199.00| calzado 1 | CALZADO DE FÚTBOL NEMEZIZ 19.3 TERRENO FIRME|