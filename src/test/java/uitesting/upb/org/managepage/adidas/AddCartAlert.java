package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AddCartAlert extends BasePage {
    @FindBy (xpath = "//*/span[@data-auto-id=\"add-to-bag-product-info-qty\"]")
    private WebElement cantidad;

    @FindBy (xpath = "//*[@data-auto-id = \"view-bag-desktop\"]")
    private WebElement verCarritoButton;

    public String getCantidad() {
        return Events.getText(cantidad);
    }

    public Carrito clickVerCarrito() {
        Events.click(verCarritoButton);
        return new Carrito();
    }
}
