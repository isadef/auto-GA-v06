package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.managepage.personalwallet.Header;

public class Navbar extends BasePage {

    @FindBy (xpath = "//*[@class=\"label\" and @manual_cm_sp=\"header-_-HOMBRE\"]")
    private WebElement hombreTab;

    @FindBy (xpath = "//*[@href=\"/calzado_de_futbol-hombre\"]")
    private WebElement futbolButton;

    public Navbar hoverHombreTab () {
        Events.hoverElement(hombreTab);
        return this;
    }

    public Store clickFutbolButton () {
        Events.click(futbolButton);
        return new Store();
    }

}
