package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountHomeMenu extends BasePage {
    @FindBy(css = "#accountNameInput")
    private WebElement accountNameInput;

    @FindBy(css = "#addAccountButton")
    private WebElement addButton;

    public AccountHomeMenu writeAccountName(String name) {
        Events.fillField(accountNameInput, name);
        return this;
    }

    public AccountHomeMenu pressAddButton() {
        Events.click(addButton);
        return this;
    }

    public WebElement GetAccountButtonById(String id) {
        return webDriver.findElement(By.id(id));
    }

    public MainMenu clickButtonById(String id) {
        Events.click(GetAccountButtonById(id));
        return new MainMenu();
    }
}
