package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AdidasMainPage extends BasePage {
    @FindBy(xpath = "//*[contains(@manual_cm_sp,'header-_-HOMBRE')]")
    private WebElement hombreLink;
    @FindBy(xpath = "//*[contains(@manual_cm_sp,'header-_-hombre-_-tenis-_-fútbol')]")
    private WebElement tennisButton;


    public AdidasMainPage hoverHombreLink() {
        Events.hoverWebElement(hombreLink);
        return new AdidasMainPage();
    }

    public CalzadoPage clicktennisbutton() {
        Events.click(tennisButton);
        return new CalzadoPage();
    }


}


