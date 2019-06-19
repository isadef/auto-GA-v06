package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;

public class AdidasMainPage {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a")
    private WebElement hombreLink;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement tennisButton;


    public AdidasMainPage hoverHombreLink() {
        Events.hoverWebElement(hombreLink);
        return new AdidasMainPage();
    }

    public AdidasMainPage clicktennisbutton() {
        Events.click(tennisButton);
        return new AdidasMainPage();
    }


}


