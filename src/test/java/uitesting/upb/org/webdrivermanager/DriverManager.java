package uitesting.upb.org.webdrivermanager;

import org.openqa.selenium.*;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managefile.PropertyAccesor;

/**
 * @autor Marcelo Garay
 */
public class DriverManager {
    private WebDriver webDriver;
    private static DriverManager ourInstance = new DriverManager();
    public WebDriverWait wait;

    public static DriverManager getInstance() {
        return ourInstance;
    }

    private DriverManager() {
        webDriver = DriverFactory.getWebDriver(BrowserType.valueOf(PropertyAccesor.getInstance().getBrowser()));
        wait = new WebDriverWait(webDriver, 10);
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
    public void closeWebDriver () {
        webDriver.close();
    }
//    public void clearLocalStorge () {
//        webDriver.get("chrome://settings/clearBrowserData");
//        WebElement root1 = webDriver.findElement(By.cssSelector("settings-ui"));
//        WebElement shadowRoot1 = expandRootElement(root1);
//        WebElement root2 = shadowRoot1.findElement(By.cssSelector("settings-main"));
//        WebElement shadowRoot2 = expandRootElement(root2);
//        WebElement root3 = shadowRoot2.findElement(By.cssSelector("settings-basic-page"));
//        WebElement shadowRoot3 = expandRootElement(root3);
//        WebElement root4 = shadowRoot3.findElement(By.cssSelector("settings-section > settings-privacy-page"));
//        WebElement shadowRoot4 = expandRootElement(root4);
//        WebElement root5 = shadowRoot4.findElement(By.cssSelector("settings-clear-browsing-data-dialog"));
//        WebElement shadowRoot5 = expandRootElement(root5);
//        WebElement root6 = shadowRoot5.findElement(By.cssSelector("#clearBrowsingDataDialog"));
//        WebElement clearDataButton = root6.findElement(By.cssSelector("#clearBrowsingDataConfirm"));
//        clearDataButton.click();
//        wait.until(ExpectedConditions.invisibilityOf(root1));
//    }
//    private WebElement expandRootElement(WebElement element) {
//        WebElement ele = (WebElement) ((JavascriptExecutor) webDriver)
//                .executeScript("return arguments[0].shadowRoot", element);
//        return ele;
//    }
    public void clearLocalStorge() {
        webDriver.close();
        webDriver = DriverFactory.getWebDriver(BrowserType.valueOf(PropertyAccesor.getInstance().getBrowser()));
        wait = new WebDriverWait(webDriver, 10);
    }
}
