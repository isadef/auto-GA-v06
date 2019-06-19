package uitesting.upb.org.managepage.segundoParcial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

import java.util.EventListener;

public class CarritoPage extends BasePage {
    @FindBy(xpath = "//div[@class='product']//a[@class='name']")
    private WebElement title;

    @FindBy(xpath = "//a[@class='ffSelectButton']")
    private WebElement quantity;

    @FindBy(xpath = "(//div[@class='cart-widget-value'])[1]")
    private WebElement firstPrice;

    @FindBy(xpath = "(//div[@class='cart-widget-value'])[2]")
    private WebElement totalPrice;

    public String getTitle() {
        if (Events.isWebElementVisible(title)) {
            return title.getText();
        }
        return "";
    }

    public String getQuantity() {
        if (Events.isWebElementVisible(quantity)) {
            return quantity.getText();
        }
        return "";
    }

    public String getFirstPrice() {
        System.out.println(firstPrice.getText());
        return firstPrice.getText();
    }

    public String getTotalPrice() {
        System.out.println(totalPrice.getText());
        return totalPrice.getText();
    }
}
