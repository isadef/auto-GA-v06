package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

import java.awt.*;

public class CarritoPage extends BasePage {
    @FindBy(xpath = "//*[contains(@title,'Calzado de Fútbol Nemeziz 19.3 Terreno Firme')]")
    private WebElement titleField;

    @FindBy(xpath = "//*[contains(@data-ci-test-id,'orderTotalProductsDeliveryValue')]")
    private WebElement totalProductField;

    @FindBy(xpath = "//*[contains(@data-ci-test-id,'orderTotalCartValue')]")
    private WebElement totalField;

    @FindBy(xpath = "//*[@id=\"shipment_wrapper_0_0\"]/div[@class=\"co-quantitycolumn left\"]/div/div/a/span")
    private WebElement quantityField;

    public String getTitleText(){
        return Events.getText(titleField);
    }

    public  String getTotalProductFieldText(){
        return Events.getText(totalProductField);

    }

    public  String getTotalFieldText(){
        return  Events.getText(totalField);

    }

    public String getQuantityField(){
        return Events.getText(quantityField);
    }


}
