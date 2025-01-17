package uitesting.upb.org.managepage.personalwallet;

import cucumber.api.java.gl.E;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

import java.awt.*;

public class TransactionsPage extends BasePage {
    @FindBy(id = "categoryRegister")
    protected WebElement categoryRegisterField;

    @FindBy(id = "buttonCategory")
    protected WebElement catergoryButton;

    @FindBy(id = "categorySuccess")
    protected WebElement categorySuccessAlert;

    @FindBy(id = "category")
    protected WebElement categorySelector;

    @FindBy(id = "name")
    protected WebElement transactionNameField;

    @FindBy(id = "amount")
    protected WebElement amountField;

    @FindBy(id = "dateSpace")
    protected WebElement dateField;

    @FindBy(id = "buttonTransaction")
    protected WebElement transactionButton;

    @FindBy(id = "transactionFail")
    protected WebElement transactionFailAlert;

    @FindBy(id = "categoryFail")
    protected WebElement categoryFailAlert;

    @FindBy(xpath = "//nav//form//a")
    private WebElement exitButton;

    @FindBy(id = "exit")
    private WebElement ExitButton;

    @FindBy(id = "transactionSuccess")
    protected WebElement transactionSuccessAlert;
    @FindBy(id = "settings")
    private WebElement accountSettingsButton;

    @FindBy(id = "changeSuccess")
    protected WebElement changeSuccesAlert;

    @FindBy(id = "changeFail")
    protected WebElement changeFailAlert;

    @FindBy(id = "old-name")
    protected WebElement oldNameField;

    @FindBy(id = "new-name")
    protected WebElement newNameField;

    @FindBy(id = "new-date")
    protected WebElement newDateField;

    @FindBy(id = "new-amount")
    protected WebElement newAmountField;

    @FindBy(id = "new-category")
    protected WebElement newCategoryField;

    @FindBy(id = "buttonChange")
    protected WebElement registerChangesButton;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    protected WebElement personalWalletLink;

    @FindBy(id = "old-name")
    protected WebElement transactionNameSelector;

    @FindBy(xpath = "//*[@class=\"card p-5 mt-3\"]/h2[not(contains(.,\"Modify\"))]")
    protected WebElement registerTransactionTitle;

    @FindBy(xpath = "//*[@class=\"card p-5 mt-3\"]/h2[contains(.,\"Modify\")]")
    protected WebElement modifyTransactionTitle;

    @FindBy(xpath = "//*[@class=\"card card-category p-5 mt-3\"]/h2[contains(.,\"Register Category\")]")
    protected WebElement registerCategoryTitle;

    public boolean isRegisterChangesButtonVisible() {
        return Events.isWebElementVisible(registerChangesButton);
    }

    public boolean isRegisterTransactionButtonVisible() {
        return Events.isWebElementVisible(transactionButton);
    }

    public boolean isModifyOldNameSelectorVisible() {
        return Events.isWebElementVisible(oldNameField);
    }

    public boolean isModifyNewNameFieldVisible() {
        return Events.isWebElementVisible(newNameField);
    }

    public boolean isModifyNewCategorySelectorVisible() {
        return Events.isWebElementVisible(newCategoryField);
    }

    public boolean isModifyNewDateFieldVIsible() {
        return Events.isWebElementVisible(newDateField);
    }

    public boolean isModifyNewAmountFieldVisible() {
        return Events.isWebElementVisible(newAmountField);
    }

    public boolean isRegisterCategoryTitleVisible() {
        return Events.isWebElementVisible(registerCategoryTitle);
    }

    public boolean isCategoryRegisterFieldVisible() {
        return Events.isWebElementVisible(categoryRegisterField);
    }

    public boolean isCategoryRegisterButtonVisible() {
        return Events.isWebElementVisible(catergoryButton);
    }

    public boolean isRegisterNameFieldVisible() {
        return Events.isWebElementVisible(transactionNameField);
    }

    public boolean isRegisterCategorySelectorVisible() {
        return Events.isWebElementVisible(categorySelector);
    }

    public boolean isRegisterAmountFieldVisible() {
        return Events.isWebElementVisible(amountField);
    }

    public boolean isRegisterDateFieldVisible() {
        return Events.isWebElementVisible(dateField);
    }

    public String getRegisterCategoryTitle() {
        return Events.getText(registerCategoryTitle);
    }

    public String getModifyTransactionTitle() {
        return Events.getText(modifyTransactionTitle);
    }

    public boolean isModifyTransactionTitleVisible() {
        return Events.isWebElementVisible(modifyTransactionTitle);
    }

    public boolean isRegisterTransactionTitleVisible() {
        return Events.isWebElementVisible(registerTransactionTitle);
    }

    public String getRegisterTransactionTitleText() {
        return Events.getText(registerTransactionTitle);
    }

    public TransactionsPage selectTransactionName(String option) {
        Events.selectOptionInSelectElementByVisibleText(new Select(transactionNameSelector), option);
        return this;
    }

    public TransactionsPage clearCategoryNameField() {
        Events.clearElement(categoryRegisterField);
        return this;
    }

    public boolean isTransactionFailAlertVisible() {
        return Events.isWebElementVisible(transactionFailAlert);
    }

    public boolean isCategoryFailAlertVisible() {
        return Events.isWebElementVisible(categoryFailAlert);
    }

    public int getCategorySelectorNumberOptions() {
        return Events.getSelectorNumberOptions(new Select(categorySelector));
    }

    public int getTransactionNameSelectorNumberOptions() {
        return Events.getSelectorNumberOptions(new Select(transactionNameSelector));
    }

    public boolean isTransactionSuccessAlertVisible() {
        return Events.isWebElementVisible(transactionSuccessAlert);
    }

    public TransactionsPage fillAmountField(String amount) {
        Events.clearElement(amountField);
        Events.fillField(amountField, amount);
        return this;
    }

    public TransactionsPage clickRegisterTransactionButton() {
        Events.click(transactionButton);
        return this;
    }

    public TransactionsPage fillDateField(String date) {
        Events.fillField(dateField, date);
        return this;
    }

    public TransactionsPage fillCategoryRegisterField(String name) {
        Events.fillField(categoryRegisterField, name);
        return this;
    }

    public TransactionsPage fillTransactionNameField(String name) {
        Events.clearElement(transactionNameField);
        Events.fillField(transactionNameField, name);
        return this;
    }

    public TransactionsPage clickRegisterCategoryButton() {
        Events.click(catergoryButton);
        return this;
    }

    public boolean isCategorySuccessAlertVisible() {
        return Events.isWebElementVisible(categorySuccessAlert);
    }

    public boolean searchCategoryOnSelector(String category) {
        return Events.isElementOnSelector(categorySelector, category);
    }

    public boolean searchOptionOnTransactionNameSelector(String option) {
        return Events.isElementOnSelector(transactionNameSelector, option);
    }

    public TransactionsPage selectCategory(String category) {
        Events.fillField(categorySelector, category);
        return this;
    }

    public AccountHomeMenu clickExitButton() {
        Events.click(exitButton);
        return new AccountHomeMenu();
    }

    public AccountHomeMenu clickexitButton() {
        Events.click(ExitButton);
        return new AccountHomeMenu();
    }

    public AccountSettingsPage clickAccountSettingsButton() {
        Events.click(accountSettingsButton);
        return new AccountSettingsPage();
    }

    public boolean isChangeSuccessAlertVisible() {
        return Events.isWebElementVisible(changeSuccesAlert);
    }

    public TransactionsPage clickNewAmountField() {
        Events.click(newAmountField);
        return this;
    }

    public String getNewAmountFieldText() {
        return Events.getText(newAmountField);
    }

    public boolean isChangeFailAlertVisible() {
        return Events.isWebElementVisible(changeFailAlert);
    }

    public TransactionsPage fillNewCategoryField(String name) {
        Events.fillField(newCategoryField, name);
        return this;
    }

    public TransactionsPage fillNewNameField(String name) {
        Events.fillField(newNameField, name);
        return this;
    }

    public TransactionsPage fillNewAmountField(String name) {
        Events.fillField(newAmountField, name);
        return this;
    }

    public TransactionsPage fillNewDateField(String name) {
        Events.fillField(newDateField, name);
        return this;
    }

    public TransactionsPage fillOldTransactionNameField(String name) {
        Events.fillField(oldNameField, name);
        return this;
    }

    public TransactionsPage clickRegisterChangesButton() {
        Events.click(registerChangesButton);
        return this;
    }

}
