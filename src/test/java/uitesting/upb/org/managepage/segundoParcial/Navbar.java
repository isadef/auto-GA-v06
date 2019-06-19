package uitesting.upb.org.managepage.segundoParcial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class Navbar extends BasePage {
    @FindBy(xpath = "//a[text()='HOMBRE']")
    private WebElement hombreLink;

    @FindBy(xpath = "//a[@href=\"/calzado_de_futbol-hombre\"]")
    private WebElement futbolLink;

    public CalzadosFutbolPage clickFutbol() {
        Events.click(futbolLink);
        return new CalzadosFutbolPage();
    }

    public Navbar hoverOverHombreLink() {
        Events.hoverElement(hombreLink);
        return this;
    }
}
