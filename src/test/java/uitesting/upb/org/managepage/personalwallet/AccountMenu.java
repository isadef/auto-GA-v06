package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountMenu extends BasePage {

    public WebElement GetAccountButtonById(String id) {
        return webDriver.findElement(By.id(id));
    }

    public MainMenu clickButtonById(String id) {
        Events.click(GetAccountButtonById(id));
        return new MainMenu();
    }
}
