package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.managepage.BasePage;

public class ReportsPage extends BasePage {
    @FindBy(css = "h1.text-center")
    private WebElement title;

    public String getTitle() {
        return title.getText();
    }
}
