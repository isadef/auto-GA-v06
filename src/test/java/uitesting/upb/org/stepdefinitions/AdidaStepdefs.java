package uitesting.upb.org.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.Adidas.FutbolPage;
import uitesting.upb.org.managepage.Adidas.Header;
import uitesting.upb.org.managepage.personalwallet.AccountHomeMenu;


public class AdidaStepdefs {

    private AccountHomeMenu mainMenu;
    private Header header;
    private FutbolPage futbolPage;

    @Given("^Adidas 'Main Menu' page is loaded$")
    public void adidasMainMenuPageIsLoaded() {
        mainMenu = LoadPage.loadHomeMenu();
        header = LoadPage.loadHeader();
    }

    @Given("^hovered over 'Hombre' on 'Header'$")
    public void hoveredOverHombreOnHeader() {
        header = header.hoverHombreButton();
    }

    @Given("^'Futbol' page is loaded$")
    public void futbolPageIsLoaded() {
        futbolPage = LoadPage.loadFutbolMenu();

    }

    @Given("^clicked 'Calzado de Futbol X' image button on 'Futbol' Page$")
    public void clickedCalzadoDeFutbolXImageButtonOnFutbolPage() {
        futbolPage = futbolPage.clickCalzadaDeFutbolButton();

    }

    @And("^click 'Eliga tu Talla' dropdown button on 'Futbol' Page$")
    public void clickedEligaTuTallaDropdownButtonOnFutbolPage() {
    }
}
