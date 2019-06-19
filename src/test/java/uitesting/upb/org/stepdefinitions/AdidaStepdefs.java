package uitesting.upb.org.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.Adidas.FutbolPage;
import uitesting.upb.org.managepage.Adidas.MainMenuAdidas;


public class AdidaStepdefs {

    private MainMenuAdidas mainMenuAdidas;
    private MainMenuAdidas header;
    private FutbolPage futbolPage;

    @Given("^'MainMenu' page is loaded$")
    public void mainmenuPageIsLoaded() {
        mainMenuAdidas = LoadPage.loadMainMenuAdidas();
    }

    @Given("^hovered over 'Hombre' on 'Header'$")
    public void hoveredOverHombreOnHeader() {
        mainMenuAdidas.hoverOverHombreButton();
    }

    @And("^click 'Futbol' button on 'Tenis' category on 'Header'$")
    public void clickFutbolButtonOnTenisCategoryOnHeader() {
        futbolPage = mainMenuAdidas.clickFutbolButton();
    }

    @Then("^get price of 'Calsado de Futbol Nemeziz' on 'Futbol' page$")
    public void getPriceOfCalsadoDeFutbolNemezizOnFutbolPage() {
        futbolPage = futbolPage.getPriceCalzadaDeFutbol();
    }

    @And("^click 'Calzado de Futbol Nemeziz' image button on 'Futbol' Page$")
    public void clickCalzadoDeFutbolNemezizImageButtonOnFutbolPage() {
        futbolPage = futbolPage.clickCalzadoDeFutbolButton();
    }

    @And("^click 'Eliga tu Talla' dropdown button on 'Futbol' Page$")
    public void clickEligaTuTallaDropdownButtonOnFutbolPage() {
        futbolPage = futbolPage.clickEligeTuTallaButton();
    }

    @And("^click 'MX Nine' size button on 'Futbol' Page$")
    public void clickMXSizeButtonOnFutbolPage() {
        futbolPage = futbolPage.clickMX9Button();
    }

    @And("^click 'AÑADIR AL CARRITO' button on 'Futbol' Page$")
    public void clickAÑADIRALCARRITOButtonOnFutbolPage() {
        futbolPage = futbolPage.clickAddToCartButton();
    }


    @Then("^'canitdad' should display \"([^\"]*)\"$")
    public void canitdadShouldDisplay(String cantidad) throws Throwable {
        Assert.assertEquals(futbolPage.getCantidadText(),cantidad);
    }


    @And("^click 'Ver Carrito' link on 'Futbol' page$")
    public void clickVerCarritoLinkOnFutbolPage() {
        futbolPage = futbolPage.clickVerCarritoLink();
    }

    @Then("^title 'Calsado de Futbol Nemeziz' is displayed on 'Futbol' Page$")
    public void titleCalsadoDeFutbolNemezizIsDisplayedOnFutbolPage() {
        Assert.assertTrue(futbolPage.verifyCalzadoTitleIsVisible());
    }

    @And("^price should be \"([^\"]*)\"$")
    public void priceShouldBe(String price) throws Throwable {
        Assert.assertEquals(futbolPage.getPrice(),price);
    }

    @And("^total should be \"([^\"]*)\"$")
    public void totalShouldBe(String total) throws Throwable {
        Assert.assertEquals(futbolPage.getTotal(),total);
    }
}
