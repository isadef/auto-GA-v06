package uitesting.upb.org.webdrivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.managefile.PropertyAccesor;

import java.util.concurrent.TimeUnit;

/**
 * @autor Marcelo Garay
 */
public class DriverManager {
    private WebDriver webDriver;
    private static DriverManager ourInstance = new DriverManager();
    public WebDriverWait wait;

    private static final int IMPLICIT_TIME_WAIT = PropertyAccesor.getInstance().getImplicitTimeWait();
    private static final int EXPLICIT_TIME_WAIT = PropertyAccesor.getInstance().getExplicitTimeWait();

    private WebDriverWait webDriverWait;

    public static DriverManager getInstance() {
        return ourInstance;
    }

    private DriverManager() {
        webDriver = DriverFactory.getWebDriver(BrowserType.valueOf(PropertyAccesor.getInstance().getBrowser()));
        wait = new WebDriverWait(webDriver, 30);
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }


    public void restoreWaiters() {
        setImplicitTimeWait(IMPLICIT_TIME_WAIT);
        setExplicitTimeWait(EXPLICIT_TIME_WAIT);
    }

    public void setImplicitTimeWait(int implicitTimeWait) {
        webDriver.manage().timeouts().implicitlyWait(implicitTimeWait, TimeUnit.SECONDS);
    }

    public void setExplicitTimeWait(int explicitTimeWait) {
        webDriverWait = new WebDriverWait(webDriver, explicitTimeWait);
    }

}
