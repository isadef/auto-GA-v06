package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.personalwallet.AccountCreator;

import static uitesting.upb.org.manageevents.Events.isWebElementVisible;

public class GoogleHomeStepdefs {
    private AccountCreator creator;
    private WebElement searchFieldText;

    @Given("^Google page is loaded$")
    public void accountCreatorIsLoaded() throws Throwable{
        creator = LoadPage.loadHomeMenu();
    }

    @Then("^the 'Search' field is visible$")
    public void theSearchFieldIsVisible() {
        boolean isSearchFieldVisible = Events.isWebElementVisible(searchFieldText);
        Assert.assertTrue(isSearchFieldVisible);
    }
}
