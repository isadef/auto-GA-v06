package uitesting.upb.org.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class MainMenuAdidas extends BasePage {

    @FindBy(xpath = "//*[@id=\"app\"]//div[@data-auto-id='glass-navigation-flyout']")
    private WebElement HombreButton;

    @FindBy(xpath = "//*[@id='app']//div[@class='col-5']//a[@manual_cm_sp='header-_-hombre-_-tenis-_-fútbol']")
    private WebElement FutbolButton;


    public MainMenuAdidas hoverOverHombreButton() {
        Events.hoverElement(HombreButton);
        return this;
    }

    public FutbolPage clickFutbolButton() {
        Events.click(FutbolButton);
        return new FutbolPage();
    }
}
