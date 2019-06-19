package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class Carrito extends BasePage {

    @FindBy (xpath = "//*[@class = \"name\" and @title=\"Calzado de Fútbol Nemeziz 19.3 Terreno Firme\"]")
    private WebElement productName;
    @FindBy (xpath = "//*[@class=\"ffSelectButton\"]/span")
    private WebElement quantity;
    @FindBy (xpath = "//*[@data-ci-test-id=\"orderTotalCartValue\"]")
    private WebElement totalAmount;

    public String getName () {
        return Events.getText(productName);
    }

    public String getTotalAmount () {
        return Events.getText(totalAmount);
    }

    public String getQuantity() {
        return Events.getText(quantity);
    }
}
