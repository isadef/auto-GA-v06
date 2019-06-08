package uitesting.upb.org.manageevents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.webdrivermanager.DriverManager;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * @autor Marcelo Garay
 */
public class Events {
    public static void click(WebElement webElement){
        webElement.click();
    }
    public static void click(By by){
        DriverManager.getInstance().getWebDriver().findElement(by).click();
    }

    public static void fillField(WebElement searchTextField, String text) {
        searchTextField.sendKeys(text);
    }

    public static void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().getWebDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public static WebElement fluentWait(final By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverManager.getInstance().getWebDriver())
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        return foo;
    }

    public static void maximizeWindow(){
        DriverManager.getInstance().getWebDriver().manage().window().maximize();
    }

    public static void scrollPage() {
        JavascriptExecutor jsx = (JavascriptExecutor)DriverManager.getInstance().getWebDriver();
        jsx.executeScript("window.scrollBy(0,20000)", "");
    }

    public static void zoomOut() {
        JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getInstance().getWebDriver();
        jse.executeScript("document.body.style.zoom = '80%';");
    }
}
