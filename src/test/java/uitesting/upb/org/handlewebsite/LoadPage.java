package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.nasa.EarthMenu;
import uitesting.upb.org.managepage.nasa.MainLeftMenu;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {
    public static MainLeftMenu loadMainLeftMenu(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        Events.maximizeWindow();
        return new MainLeftMenu();
    }

    public static void main(String[] args) {
        EarthMenu earthMenu = loadMainLeftMenu().clickFirstApiListingLink().clickSecondApiListingLink();
        System.out.println(earthMenu.clickEarthLink().clickImaginery().getText());
    }
}
