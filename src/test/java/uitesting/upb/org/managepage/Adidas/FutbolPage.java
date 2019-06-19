package uitesting.upb.org.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class FutbolPage extends BasePage {

    @FindBy (xpath = "//SPAN[@class='gl-price__value'][text()='$2,199']")
    private WebElement CalzadasPrice;

    @FindBy (xpath = "(//DIV[@class='gl-product-card glass-product-card___1PGiI'])[1]")
    private WebElement CalzadasButton;

    @FindBy (xpath = "//SPAN[@class='gl-dropdown__select-label-text']")
    private WebElement EligeTuTallaButton;

    @FindBy (xpath = "//BUTTON[@type='button'][text()='MX 9']")
    private WebElement TallaMX9Button;

    @FindBy (xpath = "//BUTTON[@type='submit']")
    private WebElement AddToCartButton;

    @FindBy (xpath = "//*[contains(@data-auto-id,'add-to-bag-product-info-qty')]")
    private WebElement GetCantidad;

    @FindBy (xpath = "//SPAN[@class='gl-cta__text'][text()='ver carrito'][1]")
    private WebElement VerCarritoLink;

    @FindBy (xpath = "//DIV[@id='shipment_wrapper_0_0']")
    private WebElement CalzadoTitle;

    @FindBy (xpath = "//DIV[@class='cart-widget-value']")
    private WebElement price;

    @FindBy (xpath = "//DIV[@class='cart-widget-value']")
    private WebElement total;

    public FutbolPage getPriceCalzadaDeFutbol() {
        System.out.println("Price of Calzado de Futbol Nemeziz: ");
        Events.getText(CalzadasPrice);
        return this;
    }

    public FutbolPage clickCalzadoDeFutbolButton() {
        Events.click(CalzadasButton);
        return this;
    }

    public FutbolPage clickEligeTuTallaButton(){
        Events.click(EligeTuTallaButton);
        return this;
    }

    public FutbolPage clickMX9Button() {
        Events.click(TallaMX9Button);
        return this;
    }

    public FutbolPage clickAddToCartButton() {
        Events.click(AddToCartButton);
        return this;
    }

    public String getCantidadText() {
        return Events.getText(GetCantidad);
    }

    public FutbolPage clickVerCarritoLink() {
        Events.click(VerCarritoLink);
        return this;
    }

    public boolean verifyCalzadoTitleIsVisible(){
        return Events.isWebElementVisible(CalzadoTitle);
    }

    public String getPrice(){
        return Events.getText(price);
    }

    public String getTotal(){
        return Events.getText(total);
    }



}
