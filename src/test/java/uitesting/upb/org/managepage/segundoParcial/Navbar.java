package uitesting.upb.org.managepage.segundoParcial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class Navbar extends BasePage {
    @FindBy(xpath = "//a[text()='HOMBRE']")
    private WebElement hombreLink;

    private By.ByXPath bySelector;

    public void createSelectorForFutbol() {
        bySelector = new By.ByXPath("//div[@class='main-line']//div[@class='col-5'][2]//a[text()='Fútbol']");
    }

    public void hoverOverHombreLink() {
        Events.hoverElementAndSelectLink(hombreLink, bySelector);
    }
}
