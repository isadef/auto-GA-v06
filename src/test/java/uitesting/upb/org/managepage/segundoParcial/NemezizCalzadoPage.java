package uitesting.upb.org.managepage.segundoParcial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class NemezizCalzadoPage extends BasePage {
    @FindBy(xpath = "//button[@value='F99997_660']")
    private WebElement talla85;

    @FindBy(xpath = "//button[@title='Elige tu talla']")
    private WebElement eligeTuTallaButton;

    @FindBy(xpath = "//button[@aria-label='Añadir al carrito']")
    private WebElement anadirCarritoButton;

    public NemezizCalzadoPage clickEligeTuTalla() {
        Events.click(eligeTuTallaButton);
        return this;
    }

    public NemezizCalzadoPage clickTalla() {
        Events.click(talla85);
        return this;
    }

    public ModalCarrito clickAnadirCarrito() {
        Events.click(anadirCarritoButton);
        return new ModalCarrito();
    }
}
