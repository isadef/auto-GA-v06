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
    And search 'titlefield' with "CALZADO DE FÚTBOL NEMEZIZ 19.3 TERRENO FIRME" on 'carritopage'
    And search 'totalproductofield' with "$2,199.00" on 'carritopage'
    And search 'totalfield' with "$2,199.00" on 'carritopage'