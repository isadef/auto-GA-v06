package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.personalwallet.AccountHomeMenu;
import uitesting.upb.org.managepage.personalwallet.MainMenu;
import uitesting.upb.org.managepage.personalwallet.ReportsPage;

public class PersonalWalletSteps {
    private AccountHomeMenu accountHomeMenu;
    private MainMenu mainMenu;
    private ReportsPage reportsPage;

    @Given("^Pagina principal esta cargada$")
    public void loadMainPage() {
        accountHomeMenu = LoadPage.loadHomeMenu();
    }

    @Given("^La cuenta \"(.*)\" esta creada$")
    public void createAccount(String accountName) {
        accountHomeMenu.writeAccountName(accountName).pressAddButton();
    }

    @When("^Se presiona el boton \"(.*)\"$")
    public void clickAccountButton(String accountId) {
        mainMenu = accountHomeMenu.clickButtonById(accountId);
    }

    @When("^Se presiona el boton 'Reports'$")
    public void clickReportsButton() {
        reportsPage = mainMenu.clickReportsButton();
    }

    @Then("^El titulo es \"(.*)\"$")
    public void assertPageTitle(String title) {
        if (reportsPage.getTitle().equals(title)) {
            System.out.println("Assert is true");
        }
        else {
            System.out.println("Assert is false");
        }
    }
}
