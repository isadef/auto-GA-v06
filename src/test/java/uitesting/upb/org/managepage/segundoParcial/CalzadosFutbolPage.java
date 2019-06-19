package uitesting.upb.org.managepage.segundoParcial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class CalzadosFutbolPage extends BasePage {
    @FindBy(xpath = "//span[text()='$2,199']")
    private WebElement precioSpan;

    @FindBy(xpath = "//a[@href='/calzado-de-futbol-nemeziz-19.3-terreno-firme/F99997.html']")
    private WebElement primerCalzadoDiv;

    public String getPrecio() {
        if (Events.isWebElementVisible(precioSpan)) {
           precioSpan.getText();
        }
        return "";
    }

    public NemezizCalzadoPage clickPrimerCalzado() {
        Events.click(primerCalzadoDiv);
        return new NemezizCalzadoPage();
    }
}
