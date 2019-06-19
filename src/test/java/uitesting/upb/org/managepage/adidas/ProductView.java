package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ProductView extends BasePage {
    @FindBy (xpath = "//*[@title=\"Elige tu talla\"]")
    private WebElement eligeTuTallaSelect;

    @FindBy(xpath = "//*/button[@title=\"MX 8.5\"]")
    private WebElement talla85Button;

    @FindBy (xpath = "//button[@aria-label=\"Añadir al carrito\"]")
    private WebElement addtocartbutton;

    public ProductView clickEligeTuTalla() {
        Events.click(eligeTuTallaSelect);
        return this;
    }

    public AddCartAlert clickAddToCart () {
        Events.click(addtocartbutton);
        return new AddCartAlert();
    }

    public ProductView clickTalla85() {
        Events.click(talla85Button);
        return this;
    }

}
