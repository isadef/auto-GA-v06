package uitesting.upb.org.managepage.segundoParcial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class Navbar extends BasePage {
    @FindBy(xpath = "//a[text()='HOMBRE']")
    private WebElement hombreLink;

    @FindBy(xpath = "//div[@class='main-line']//div[@class='col-5'][2]//a[text()='Fútbol']")
    private WebElement futbol;

    public void clickFutbol() {
        Events.click(hombreLink);
    }

    public void hoverOverHombreLink() {
        Events.hoverElement(hombreLink);
    }
}
