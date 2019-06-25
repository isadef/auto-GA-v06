 #soft assert example
 Feature: Verify Account Settings Functionality
   Background:
     Given adidasPage is loaded
     Given hover en 'Hombre LINK' en 'adidasPage'
     And click en 'tennis button en 'adidasPage'
     Then search 'price' from 'tennis button' on 'calzadoPage'
     And click 'calzado Button' on 'calzado page'
     And click on 'talla selecto button' on 'calzado page'
     And click on 'talla button MX9' button on 'calzado page'
     And click on 'añadir al carrito' button on 'calzado page'
     And search 'cantidad' text with "CALZADO DE FÚTBOL NEMEZIZ 19.3 TERRENO FIRME" on 'calzado page'
     And click 'ir al carrito' button on 'calzado page'
     And 'quantity' field is displayed with "1" on 'calzado page'

     #en una sola linea
 Scenario Outline: añadir al carrito

   Given 'titlefield' with "<title>"  'totalproductofield' and 'totalfield' is displayes with "<totalPrices>" are  displayed on 'carritopage'
 Examples:
 | totalPrices        | title     |
 | $2,199.00;$2,199.00 | calzado 1|
