package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ReportsPage extends BasePage {
    @FindBy(css = "h1.text-center")
    private WebElement title;

    @FindBy(id = "reportType")
    private WebElement reportTypeSelect;

    @FindBy(id = "showReport")
    private WebElement showReportButton;

    public String getTitle() {
        return title.getText();
    }

    public ReportsPage selectByCategoryOption() {
        Events.selectOptionInSelectElement(new Select(reportTypeSelect), "category");
        return this;
    }

    public ReportsPage clickShowReportButton() {
        Events.click(showReportButton);
        return this;
    }

    public int getNumberOfRows() {
        return Events.getNumberOfElements(new By.ByXPath("//table//tr"));
    }
}