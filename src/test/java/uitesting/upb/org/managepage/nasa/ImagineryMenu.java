package uitesting.upb.org.managepage.nasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ImagineryMenu extends BasePage {
    @FindBy(css=".tocify-focus")
    private WebElement imaginery;

    public MainPage clickImaginery() {
        Events.click(imaginery);
        return new MainPage();
    }
}
