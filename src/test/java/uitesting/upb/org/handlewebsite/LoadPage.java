package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.personalwallet.AccountCreator;
import uitesting.upb.org.managepage.personalwallet.AccountMenu;
import uitesting.upb.org.managepage.personalwallet.MainMenu;
import uitesting.upb.org.managepage.personalwallet.ReportsPage;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {
    public static AccountCreator loadHomeMenu(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new AccountCreator();
    }

    public static void main(String[] args) {
        String newAccountName = "Test";
        AccountCreator creator = loadHomeMenu();
        creator.writeAccountName(newAccountName).pressAddButton();
        AccountMenu menu = new AccountMenu();
        MainMenu mainMenu = menu.clickButtonById(newAccountName);
        ReportsPage reports = mainMenu.clickReportsButton();
    }
}
