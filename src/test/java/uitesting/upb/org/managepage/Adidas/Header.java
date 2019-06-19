package uitesting.upb.org.managepage.Adidas;

import cucumber.api.java.en_old.Ac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;

import java.awt.*;

public class Header {

    private WebDriver driver;
    Actions action = new Actions(driver);

    @FindBy (xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a")
    protected WebElement HombreButton;

    public Header hoverHombreButton() {
        action.moveToElement(HombreButton);
        return this;
    }
}
