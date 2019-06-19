package uitesting.upb.org.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class FutbolPage extends BasePage {

    @FindBy (xpath = "//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[27]/div/div/div/div[3]/a/div[2]/div[1]")
    private WebElement CalzadadeFutbolButton;

    public FutbolPage clickCalzadaDeFutbolButton() {
        Events.click(CalzadadeFutbolButton);
        return this;
    }
}
