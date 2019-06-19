package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class Store extends BasePage {
    @FindBy (xpath = "//*[@class=\"gl-product-card__details-main\"]//*/span[@class=\"gl-price__value\" and contains(.,\"$2,199\")]")
    private WebElement precio;

    @FindBy (xpath = "//*[@class=\"gl-product-card__image performance-item\" and @title=\"Calzado de Fútbol Nemeziz 19.3 Terreno Firme\"]")
    private WebElement product;

    public String getPrecio() {
        return Events.getText(precio);
    }

    public ProductView clickProduct() {
        Events.click(product);
        return new ProductView();
    }
}
