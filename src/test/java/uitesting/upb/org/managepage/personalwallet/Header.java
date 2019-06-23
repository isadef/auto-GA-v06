package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class Header extends BasePage {
    @FindBy(xpath = "//a[@class='navbar-brand']")
    private WebElement personalWalletButton;

    @FindBy(xpath = "//nav//form//a")
    private WebElement exitButton;

    public MainMenu clickPersonalWalletButton() {
        Events.click(personalWalletButton);
        return new MainMenu();
    }

    public AccountHomeMenu clickExitButton() {
        Events.click(exitButton);
        return new AccountHomeMenu();
    }

    public boolean isAccountSettingsPresent() {
        return Events.getNumberOfElements(new By.ById("settings")) >= 1;
    }
}
