package uitesting.upb.org.managepage.nasa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class EarthMenu extends BasePage {
    //@FindBy(xpath = "//ul[@id='tocify-header8']//a")
    private WebElement earthLink;

    public ImagineryMenu clickEarthLink(){
        Events.scrollPage();
        earthLink = Events.fluentWait(By.xpath("//ul[@id='tocify-header8']//a"));
        System.out.println(earthLink.getText());
        Events.click(earthLink);

        return new ImagineryMenu();
    }
}
