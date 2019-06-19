package uitesting.upb.org.managepage.segundoParcial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ModalCarrito extends BasePage {
    @FindBy(xpath = "//span[text()='Cantidad']")
    private WebElement cantidadCarrito;

    @FindBy(xpath = "//a//*[text()='ver carrito']")
    private WebElement verCarritoButton;

    public String getCantidadCarrito() {
        if (Events.isWebElementVisible(cantidadCarrito)) {
            String texto = cantidadCarrito.getText();
            String quantity = "";
            for (int q = 0; q < texto.length(); q++) {
                if (texto.charAt(q) >= 48 && texto.charAt(q) <=  57) {
                    quantity += texto.charAt(q);
                }
            }
            return quantity;
        }
        return "";
    }

    public CarritoPage clickVerCarritoButton() {
        Events.click(verCarritoButton);
        return new CarritoPage();
    }
}
