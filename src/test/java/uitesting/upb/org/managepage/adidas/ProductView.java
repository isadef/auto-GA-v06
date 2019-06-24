package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class ProductView extends BasePage {
    @FindBy (xpath = "//*[@title=\"Elige tu talla\"]")
    private WebElement eligeTuTallaSelect;

    @FindBy(xpath = "//*/button[@title=\"MX 8.5\"]")
    private WebElement talla85Button;

    @FindBy (xpath = "//button[@aria-label=\"Añadir al carrito\"]")
    private WebElement addtocartbutton;

    public ProductView clickEligeTuTalla() {
        Events.click(eligeTuTallaSelect);
        return this;
    }

    public static void waitForElement(String webElementXpath) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getWebDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webElementXpath)));
    }

    public static void waitForElement(By by, int time) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getWebDriver(), time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        DriverManager.getInstance().restoreWaiters();
    }

    public AddCartAlert clickAddToCart () {
        Events.click(addtocartbutton);
        return new AddCartAlert();
    }

    public ProductView clickTalla85() {
        Events.click(talla85Button);
        return this;
    }

}
