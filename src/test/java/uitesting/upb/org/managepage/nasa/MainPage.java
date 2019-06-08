package uitesting.upb.org.managepage.nasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.managepage.BasePage;

public class MainPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(),'GET https://api.nasa.gov/planetary/a')]")
    private WebElement link;

    public String getText() {
        return link.getText();
    }
}
