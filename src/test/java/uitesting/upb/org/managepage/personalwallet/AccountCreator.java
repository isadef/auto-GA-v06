package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountCreator extends BasePage {
    @FindBy(css = "#accountNameInput")
    private WebElement accountNameInput;

    @FindBy(css = "#addAccountButton")
    private WebElement addButton;

    public AccountCreator writeAccountName(String name) {
        Events.fillField(accountNameInput, name);
        return this;
    }

    public AccountCreator pressAddButton() {
        Events.click(addButton);
        return this;
    }
}
