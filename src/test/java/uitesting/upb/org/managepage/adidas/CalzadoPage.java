package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class CalzadoPage extends BasePage {
    ////*[contains(@class,'gl-price__value')][contains(text(),'$2,199')]
    @FindBy(xpath = "//*[contains(@class,'gl-price__value')][contains(text(),'$2,199')]")
    private WebElement priceButton;

    @FindBy(xpath = "//*[contains(@href,'/calzado-de-futbol-nemeziz-19.3-terreno-firme/F99997.html')]")
    private WebElement calzadoNemezisButton;

    @FindBy(xpath = "//*[contains(@title,'Elige tu talla')]")
    private WebElement tallaSelectorButton;

    @FindBy(xpath = "//*[contains(@title,'MX 9')]")
    private WebElement tallaButton;

    @FindBy(xpath = "//*[contains(@aria-label,'Añadir al carrito')]")
    private WebElement añadirCarritoButton;

    @FindBy(xpath = "//*[contains(@data-auto-id,'add-to-bag-product-info-qty')]")
    private WebElement cantidadField;

    @FindBy(xpath = "//*[contains(@data-auto-id,'view-bag-desktop')]")
    private WebElement irAlCarritoButton;

    public  CalzadoPage isVisiblepriceButton(){
        Events.showTextElement(priceButton);
        return this;
    }
    public CalzadoPage clickCalzadoButton(){
        Events.click(calzadoNemezisButton);
        return this;
    }

    public CalzadoPage clickTallaSelectorButton(){
        Events.click(tallaSelectorButton);
        return this;
    }

    public CalzadoPage clickTallaButton(){
        Events.click(tallaButton);
        return this;
    }

    public CalzadoPage clickAñadirAlCarritoButton(){
        Events.click(añadirCarritoButton);
        return this;
    }

    public String getText(){
        return Events.getText(cantidadField);
    }

    public CarritoPage clickIrAlCarritoButton(){
        Events.click(irAlCarritoButton);
        return new CarritoPage();
    }
}
