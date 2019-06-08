package uitesting.upb.org.managepage.nasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class MainLeftMenu extends BasePage {
    @FindBy(xpath = "//ul[@id='tocify-header1']//li//a")
    private WebElement apiListingLink;

    public MainLeftMenu clickFirstApiListingLink() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Events.click(apiListingLink);
        return this;
    }

    public EarthMenu clickSecondApiListingLink() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Events.click(apiListingLink);
        return new EarthMenu();
    }
}
